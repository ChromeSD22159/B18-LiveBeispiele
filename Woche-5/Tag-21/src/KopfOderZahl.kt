
fun main(){

    var kontostand: Double = 10.0

    do {
        print("Bieten sie einen Geldbetrag: ")

        val betrag = readln().toDouble()

        print("Ihre Vorhersage (Kopf oder Zahl): ")
        val vorhersage = readln().capitalize()

        val muenze = muenze()

        if (vorhersage == muenze) {
            println("Gewonnen")
            kontostand += betrag
        } else {
            println("Verloren")
            kontostand -= betrag
        }

        println("Neuer Kontostand: $kontostand")

        print("Wollen sie weiter spielen (J/N): ")
        val weiterSpielen = readln().uppercase()
    } while(kontostand > 0.0 && weiterSpielen == "J" )


}

fun muenze(): String {
    return listOf("Kopf", "Zahl").random()
}