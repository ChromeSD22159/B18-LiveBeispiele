package game

fun main(){

    val items = listOf(

        // Mit der Mutter Klasse kann ich Items erstellen, die zu keiner Unterkategorie passen
        Item("Stein der Weisen"),
        Item("Adidas T-Shirt",  "Blau"),
        Item("Adidas T-Shirt",  "Grün"),
        Item("Nimbus 4000", 300),
        Item("HexHex 200xl", 450),
        Item("Nimbus 4000", "Ein Besen zum Fliegen"),
        Item("Nimbus 4000","Ein Besen zum Fliegen", 300),
        Item(), // Erstellt ein zufälliges item
        Item(),


        Potion("Heiltrank"),    // Erstellt einen Heiltrank (mit Standardwerten)
        Potion(),                       // erstellt ebenfalls einen Heiltrank (mit Standardwerten)
        Potion("Geschwindigkeitstrank"),    // erstellt einen Geschwindigkeitstrank
        Potion(1),
        Potion(2),

        Waffe(),
        Waffe(),
        Waffe(),
        Waffe(),
        Waffe()
    )


    val inventar = mutableMapOf<Item, Int>(
        Potion("Heiltrank") to 4,
        Item("Nimbus 4000") to 1
    )
}