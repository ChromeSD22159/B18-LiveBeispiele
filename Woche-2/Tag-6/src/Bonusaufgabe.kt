
fun main(){

    /*
        Gegeben ist eine Liste aus Produkten, inkl. Artikel Name und Preis

        TODO:
            Deine Aufgabe ist es einem Nutzer eine Preisabfrage der Artikel via der Konsole zu ermöglichen

        Tip:
           - um die Verwendung von dem Datentyp "Pair" zu verstehen,
                - schaue für Beispiele in die Datei "Pairs.kt"
                - im CP1 werden wir diese auch gemeinsam einmal anschauen :)
     */

    var automat: List<Pair<String, Double>> = listOf(
        "Twix" to 2.00,
        "Mars" to 2.00,
        "Chio Chips" to 2.50,
        "Lays Chips" to 2.50,
        "Coca Cola 0.33" to 3.00,
        "Fanta 0.33" to 3.00,
        "Sprite 0.33" to 3.00,
    )

    println(automat.joinToString("\n"))



}