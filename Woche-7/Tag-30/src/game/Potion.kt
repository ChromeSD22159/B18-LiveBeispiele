package game

class Potion: Item{
    // Diese Klasse hat keinen default-Konstruktor
    // Sie hat auch keine neuen Eigenschaften

    // Sekundärer Konstruktor der den Trank initialisiert
    constructor(name: String, wert: Int? = 1, description: String = ""): super(name, description, wert){}

    // Sekundärer Konstruktor, bei dem die Eigenschaften anhand des Namen initialisiert werden
    constructor(name: String): super(name){
        when (name){
            "Heiltrank" -> {
                this.wert = 10
                this.description = "Dieser Trank heilt einen Helden um 10 Lebenspunkte."
            }
            "Manatrank" -> {
                this.wert = 15
                this.description = "Dieser Trank stellt die Ressourcen eines Helden wieder her."
            }
            "Geschwindigkeitstrank" -> {
                this.wert = 20
                this.description = "Dieser Trank erhöht die Geschwindigkeit eines Helden für 10 Sekunden."
            }
            else -> throw Exception("Ungültiger Name für einen Trank")
        } // Ende When
    }

    // Sekundärer Konstruktor, der mithilfe des oberen Konstruktors einen basic Heiltrank initialisiert
    constructor(): this("Heiltrank"){}

    constructor(nr: Int): this(when(nr){
        1 -> "Heiltrank"
        2 -> "Manatrank"
        3 -> "Geschwindigkeitstrank"
        else -> "Heiltrank"
    })

}