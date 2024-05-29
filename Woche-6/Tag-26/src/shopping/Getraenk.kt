package shopping

class Getraenk(
    // Parameter des Konstruktors
    name: String,
    preis: Double,
    // Zusätzliche Eigenschaft
    val istAlk: Boolean
): Produkt(name, preis) {

    override fun toString(): String {
        return "$name ($preis€); Alkoholisch: $istAlk"
    }

}