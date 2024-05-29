package shopping

class Getraenk(
    name: String,
    preis: Double,
    val istAlk: Boolean
): Produkt(name, preis) {
}