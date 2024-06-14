package store

class Equipment(
    // Primärer Konstruktor von Equipment
        // Name und Preis sind bereits Eigenschaften von Produkt, deshalb kein var/val
    name: String,
    preis: Double,
    // Zusätzliche Eigenschaften
    val garantie: Boolean,
    val waschFest: Boolean = false
    )
    // Aufruf des Konstruktors von der Klasse Produkt
    : Produkt(name, preis) {

    override fun toString(): String {
        return super.toString() + "\t Garantie: $garantie"
    }
}