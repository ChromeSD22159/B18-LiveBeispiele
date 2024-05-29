package shopping

class Gericht(
    name: String,
    preis: Double,
    val istVegi: Boolean,
    beschreibung: String = "",
): Produkt(name, preis, beschreibung) {




}