fun main(){
    // Charakterauswahl
    // Liste von spielbaren Charakteren
    val characterListe = listOf("Mario", "Luigi", "Peach", "Yoshi", "Bowser")

    // Spieler einen Charakter aussuchen lassen:
    println("Wählen sie ihren Character:")
    println("0 für ${characterListe[0]}")
    println("1 für Luigi")
    println("2 für Peach")
    println("3 für Yoshi")
    println("4 für Bowser")

    val eingabe = readln().toInt()             // Index muss Int sein!
    val spielerCharacter = characterListe[eingabe]

    // ausgewählte Charakter aus Liste entfernen
    val gegnerOptionen = characterListe.toMutableList()
    gegnerOptionen.remove(spielerCharacter)

    // Zufälliger Charakter für den Computer
    val zufallsCharacter = gegnerOptionen.random()

    println("Der Spieler wählt $spielerCharacter")
    println("Der Gegner spielt mit $zufallsCharacter")

    println("-------------")
    // Gewinner ermitteln

    // Liste von Namen
    val namenListe = mutableListOf("Max", "Lisa", "Erik", "Anna", "Sophie")
    // Liste durchmischen
    namenListe.shuffle()

    // Liste von Punkten
    val punkteListe = mutableListOf(
        (80..90).random(),         // zufälliger Wert aus range
        (90..100).random(),
        75,
        95,
        80
    )

    // Alle Spieler mit Punkten ausdrucken:
    repeat(punkteListe.size){
        println("${namenListe[it]}:\t ${punkteListe[it]}")
    }

    // Sortierte Kopie der Liste
    val sortedPoints = punkteListe.sorted()

    // höchste Punktzahl:
    var maxPoints = punkteListe.max()
    //oder
    maxPoints = sortedPoints.last()

    // An welcher Stelle steht die höchste Punktzahl?
    val index = punkteListe.indexOf(maxPoints)

    // Welcher Spieler hat gewonnen?
    val gewinner = namenListe[index]

    println("Der Gewinner ist $gewinner mit $maxPoints Punkten")
}


