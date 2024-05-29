package buch

fun main(){

    val seite1 = Seite("Das ist die erste Seite...")
    val seite2 = Seite("Das ist die zweite Seite...")

    val buch = Buch(
        listOf(seite1, seite2, Seite("Eine dritte Seite..."))
    )


    buch.read()
    println("------")


    while(true) {
        buch.aktuelleSeite.read()
        println("Drücken 1 für die vorherige Seite, und 2 für die nächste Seite")
        when (readln()){
            "1" -> buch.zurueckBlaettern()
            "2" -> buch.weiterBlaettern()
            else -> continue
        }
    }

}