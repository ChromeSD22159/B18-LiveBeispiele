package pizzaria

class Pizza (
    val name: String,
) {

    var groesse: String
    var preis: Double

    init {
        println("Wählen sie Größe ihrer Pizza: M, L, XL")
        groesse = readln().uppercase()

        preis = when (groesse){
            "M" -> 9.99
            "L" -> 12.99
            "XL" -> 15.99
            else -> throw Exception("Falsche Größe ausgewählt")
        }
    }

    val zutaten: MutableList<String> = mutableListOf("Tomaten", "Käse")

    init {
        when(name){
            "Margarita" -> zutaten.add("Basilikum")
            "Salame" -> zutaten.add("Salami")
            "Tonno" -> {
                zutaten.addAll(listOf("Zwiebeln", "Thunfisch"))
                preis += 1  // Tonno kostet 1 mehr als die Standardpizzen
            }
            else -> println("Unbekannte Pizza")
        }
    }

}