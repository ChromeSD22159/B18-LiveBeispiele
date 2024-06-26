fun main() {
/*
    while (bedingung){       "Solange die Bedingung wahr ist, mach folgendes"
        Code...
    }
*/

    println("-----While:-----")
    //  Simpler 10x loop
    var i: Int = 0
    while (i < 10) {
        println(i)
        i++   // i = i + 1
    }

    println("-----Repeat:-----")
    // Alternative mit Repeat:
    repeat(10) { it ->
        println(it)
    }


    // Rückwärts zählen (Countdown)

    println()
    println("--------------------")
    println()
    println("Get ready for the countdown:")
    var zaehler = 10

    while (zaehler > 0) {
        print("$zaehler.. ")

        Thread.sleep(1000)
        zaehler--
    }
    println()



    println("---------Kampf:----------")
    var playerLP = 100
    var gegnerLP = 100
    while (playerLP > 0 && gegnerLP > 0) {
//            attackeAusführen()
        gegnerLP -= (1..20).random()

//            gegnerSpielzug()
        playerLP -= (1..10).random()
    }

    if (playerLP > 0)
        println("Der Spieler hat gewonnen")
    else
        println("Der Gegner hat gewonnen")



    // Auftrags-Warteschlange

    val queue = auftraegeLaden()
    while (queue.isNotEmpty()){
        val aktuellerAuftrag = queue.first()
            //..
        println(aktuellerAuftrag)

        queue.removeFirst()
    }


}

fun auftraegeLaden(): MutableList<String> {
    return mutableListOf()
}