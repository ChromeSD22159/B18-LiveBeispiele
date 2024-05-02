
fun main(){
    /*
        !! Operator heißt "Ich bin mir sicher hier steht nicht null"
        ?.  Operator heißt "es könnte null sein, versuche zu rechnen, sonst null"
        ?: Elvis Operator heißt: "falls der Wert null ist, dann benutze den Default-Wert"
     */

    val preis: Double? = null
    println("Snickers kostet ${preis ?: "k.a"}")

    println("Geben sie ihr Geburtsjahr ein:")
//    var geburtsJahr: Int? = readln().toInt()      // Fehlerpotenzial
    var geburtsJahr: Int? = readln().toIntOrNull()

    if (geburtsJahr == null){
        println("Du hast dein Geburtsjahr falsch eingegeben")
        System.exit(1)
    }

//    var geburtsJahr: Int = readln().toIntOrNull() ?: 0
    println("Geboren: $geburtsJahr")

        // 3 Varianten um mit Nullable Werten weiter zu rechnen:
    var alter: Int =  2024 - geburtsJahr!!
//    var alter = 2024 - (geburtsJahr ?: 0 )
//    var alter: Int? =  geburtsJahr?.times(-1)?.plus(geburtsJahr)

    println("Alter: $alter")

    System.exit(0)

    println("------------")

    var text: String? = "Hallo"
    var inventar: List<String>? = null

    text?.length
    text?.lowercase()
    inventar?.sorted()


    // Anwendungsbeispiele für Null-Safety

    // Videospiel: Character kann 0-2 Waffen in seinen Händen tragen
    val schadenWaffe1: Int? = 56
    val schadenWaffe2: Int? = null

    val gesamtSchaden = (schadenWaffe1 ?: 0) + (schadenWaffe2 ?: 0)
    println("Gesamtschaden: $gesamtSchaden")

    // Formular: Adresseneingabe
    var adresse : String = readln()
    var adresseZusatz: String? = readlnOrNull()

    /* Tabelle mit leeren Zellen, zB:

        Name    Alter   Adresse
        Rudi     22
        Michi           Teststr 1
     */

    val tabelle: List<Triple<String, Int?, String?>> = listOf(
        Triple("Rudi", 22, null),
        Triple("Michi", null, "Teststr 1")
    )

    // Eine Darstellung von freien Parkplätzen in einer Tiefgarage
    var tiefGarage: MutableList<String?> = mutableListOf(
        "blauer BMW",
        null,
        null,
        "roter Toyota"
    )
    val belegtePlaetze = tiefGarage.filterNotNull()
    val freiePlatze = tiefGarage.size - belegtePlaetze.size
    println("Freie Parkplätze: $freiePlatze")

}