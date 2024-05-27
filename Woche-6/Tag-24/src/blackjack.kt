package blackjack

//Auf gehts eine Runde BlackJack! Hier ist das vollständige Kartendeck für BlackJack
val kartendeck : List<String> = listOf(
    "Pik Ass", "Pik Koenig", "Pik Dame", "Pik Bube", "Pik 10", "Pik 9",
    "Pik 8" , "Pik 7", "Pik 6", "Pik 5", "Pik 4", "Pik 3", "Pik 2",
    "Kreuz Ass", "Kreuz Koenig", "Kreuz Dame", "Kreuz Bube", "Kreuz 10", "Kreuz 9",
    "Kreuz 8" , "Kreuz 7", "Kreuz 6", "Kreuz 5", "Kreuz 4", "Kreuz 3", "Kreuz 2",
    "Herz Ass", "Herz Koenig", "Herz Dame", "Herz Bube", "Herz 10", "Herz 9",
    "Herz 8" , "Herz 7", "Herz 6", "Herz 5", "Herz 4", "Herz 3", "Herz 2",
    "Karo Ass", "Karo Koenig", "Karo Dame", "Karo Bube", "Karo 10", "Karo 9",
    "Karo 8" , "Karo 7", "Karo 6", "Karo 5", "Karo 4", "Karo 3", "Karo 2",
)


fun main(){

    var konto: Double = 100.0

    do {
        // Initialisierungen
        println("-------------------------")
        val meinDeck = kartendeck.toMutableList()

        val handSpieler = mutableListOf<String>()
        val dealer = mutableListOf<String>()

        spielrundeStarten(handSpieler, dealer, meinDeck)


        println("----")
        println("Wie viel Geld möchtest du setzen? ")
        println("Du hast noch $konto € auf dem Konto.")

        val gebot = geldBieten(konto)

        println("----")
        hitAndStand(handSpieler, meinDeck)

        // Gewinner Ermitteln?
        if(handWert(handSpieler) <= 21){
            println("Nun zieht der Dealer!")
            dealerZieht(dealer, meinDeck)
        }
        if(handWert(handSpieler) > 21) {
            konto -= gebot
        }
        else if (handWert(dealer) > 21) {
            konto += gebot
        }
        when(gewinner(handSpieler, dealer)){
            0 -> konto -= gebot
            1 -> println("Du bekommst deinen Einsatz zurück!")
            2 -> konto += gebot
        }
        println("Du hast noch $konto € auf dem Konto.")
        println("Möchten Sie weiter Spielen? (J/N)")
        var tmp = readln().uppercase()
    } while (konto > 0 && tmp == "J")

    println("Das Spiel ist nun zu Ende!")
}

// mischt das als Parameter übergebene Deck
fun mischen(deck: MutableList<String>){
    deck.shuffle()
}

// gibt die oberste Karte aus dem Kartendeck als Rückgabewert zurück und entfernt sie auch aus diesem
fun eineKarteZiehen(deck: MutableList<String>): String {
    var karte = deck.first()
    deck.remove(deck.first())
    return karte
}

//gibt den Zahlenwert der Kart zurück.
fun kartenWert(karte: String) :Int {
    var kartenWert = karte.split(" ")[1]

    return when(kartenWert){
        "2" -> 2
        "3" -> 3
        "4" -> 4
        "5" -> 5
        "6" -> 6
        "7" -> 7
        "8" -> 8
        "9" -> 9
        in listOf("10","Koenig","Dame","Bube" ) -> 10
        "Ass" -> 11
        else -> 0
    }
}

// Gibt den Gesamtwert aller Karten einer Hand zurück
fun handWert(hand: MutableList<String>): Int{
    var erg = 0
    for(karte in hand){
        erg += kartenWert(karte)
    }
    return erg

    return hand.sumOf { karte -> kartenWert(karte) }
}

fun spielrundeStarten(handSpieler: MutableList<String>, handPC: MutableList<String>, deck: MutableList<String>){
    // karten Mischen
    mischen(deck)

    // Spieler und Dealer (PC) bekommen 2 Karten
    handSpieler.add(eineKarteZiehen(deck))
    handSpieler.add(eineKarteZiehen(deck))
    handPC.add(eineKarteZiehen(deck))
    handPC.add(eineKarteZiehen(deck))

    // Zeigt die Hand vom Spieler
    println("Deine Hand sieht wie folgt aus: ${handSpieler[0]} + ${handSpieler[1]}")

    // Zeigt die höhere Karte vom Dealer
    if(kartenWert(handPC[0]) < kartenWert(handPC[1])){
        println("Die erste Karte vom Dealer ist: ${handPC[1]}")
    }
    else {
        println("Die erste Karte vom Dealer ist: ${handPC[0]}")
    }
}

fun geldBieten(konto: Double, minGebot: Double = 5.0, maxGebot: Double = 20.0): Double {
    var geld: Double = 0.0
    do{
        try {
            geld = readln().toDouble()
            if (geld > konto) {
                println("Sie können nicht so viel Geld setzen, da sie nur noch $konto im Konto sind.")
            } else {
                println("Sie haben $geld € gesetzt")
            }

//            if (geld in minGebot..maxGebot)

            if (geld < minGebot){
                println("Sie müssen mindestens $minGebot setzen!")
                geld = 0.0
            }
            if (geld > maxGebot){
                println("Sie dürfen maximal $maxGebot setzten!")
                geld = 0.0
            }

        } catch (e: Exception) {
            println("Sie haben keine Zahl eingegeben! ")
        }
    } while (!(geld > 0 && geld <= konto))
    return geld
}

fun zuHohePunkte(hand: MutableList<String>): Boolean{
    return handWert(hand) > 21
}

fun hitAndStand(hand: MutableList<String>, deck: MutableList<String>){
    var gameNotEnde: Boolean = true
    do {
        println("Möchten Sie noch eine Karte ziehen oder passen? (hit/stand)")
        val eingabe = readln()
        if(eingabe == "hit"){
            hand.add(eineKarteZiehen(deck))
            println("Deine Hand sieht nun wie folgt aus: $hand")
            if(zuHohePunkte(hand)){
                println("Der Spieler hat die Punktzahl überschritten")
                gameNotEnde = false
            }
        }
        else if(eingabe == "stand"){
            //Stand
            gameNotEnde = false
        }
    }while (gameNotEnde)
}

fun dealerZieht(hand: MutableList<String>, deck: MutableList<String>){
    do {
        if(handWert(hand) < 17) {
            hand.add(eineKarteZiehen(deck))
            if (zuHohePunkte(hand)) {
                println("Der Dealer hat die Punktzahl überschritten")
                return
            }
        }
    } while (handWert(hand) < 17)
    println("Die Hand vom Dealer: $hand")
}

fun gewinner(handSpieler: MutableList<String>, handPC: MutableList<String>): Int{
    if(handWert(handSpieler) < handWert(handPC) && handWert(handPC) <= 21){
        println("Der Pc gewinnt das Spiel!")
        return 0
    }
    else if(handWert(handSpieler) == handWert(handPC) && handWert(handSpieler) <= 21){
        println("Unentschieden!")
        return 1
    }
    if(handWert(handSpieler) > handWert(handPC) && handWert(handSpieler) <= 21){
        println("Der Spieler gewinnt das Spiel!")
        return 2
    }
    return -1
}