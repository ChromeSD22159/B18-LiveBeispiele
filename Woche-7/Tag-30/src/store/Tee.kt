package store

class Tee(
    name: String,
    preis: Double,
    /* Unser Tee hat außerdem noch weitere Eigenschaften,
         die wir ebenfalls im Konstruktor initialisieren möchten */
    val ursprungsLand: String,
    val mengeInGramm: Int

    // Aufruf des Konstruktors von der Klasse Produkt
): Produkt(name, preis) {

    // Tee hat noch eine weitere Eigenschaft. Diese wird anhand von dem Namen / Sorte festgelegt
    val ziehZeitInMin: Int =
        if ("Grüntee" in name)
            3
        else if ("Schwarztee" in name || "Oolong" in name)
            2
        else
            5

    override fun toString(): String {
        return super.toString() + "\tUrsprung: $ursprungsLand"
    }

}