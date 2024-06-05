package store

// Jedes Produkt hat immer einen Namen, einen Preis und eine Liste aus Bewertungen
open class Produkt(
    val name: String,
    var preis: Double
)
{
    val bewertungen: MutableList<Int> = mutableListOf()  // Bewertungen: 1-5 Sterne

    override fun toString(): String {
        return "${name.padEnd(30, ' ')} \t\t $preis€"
    }
}