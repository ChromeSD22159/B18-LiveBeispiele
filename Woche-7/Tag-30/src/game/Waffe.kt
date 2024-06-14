package game


private val weapons = listOf("Dolch", "Handaxt", "Schwert des Drachenjägers")

class Waffe(name: String, var damage: IntRange): Item(name){
    // Default Konstruktor für eine Waffe
        //  1. ruft den Default Konstruktor von Item auf
        //  2. initialisiert eine neue Eigenschaft: Damage (wie viel Schaden macht die Waffe)


    // Sekundärer Konstruktor der ggf. value und description initialisiert
    constructor(name: String, damage: IntRange, value: Int? = null, description: String = ""): this(name, damage){
        // Muss den Default Konstruktor von Waffe aufrufen!
        // Deswegen kann ich nicht super(name, value, description) benutzen
        this.wert = value
        this.description = description
    }

    // Sekundärer Konstruktor der anhand eines Names eine entsprechende Waffe initialisiert
    constructor(name: String): this(name, 0..0){
        when(name){
            "Dolch" -> {
                this.damage = 2..4
                this.wert = 5
                this.description = "Ein simpler Dolch"
            }
            "Handaxt" -> {
                this.damage = 4..7
                this.wert = 5
                this.description = "Eine rostige Handaxt"
            }
            "Schwert des Drachenjägers" -> {
                this.damage = 8..12
                this.wert = 250
                this.description = "Ein magisches Schwert. Bietet Extra Schaden gegen Drachen."
            }
            else -> {
                // Andere Items kann dieser Konstruktor nicht erstellen
                throw Exception("Ungültiger Waffenname")
            }
        } // Ende when
    }

    // Sekundärer Konstruktor der zufällig eine von 3 Waffen generiert, in dem er den oberen Konstruktor aufruft
    constructor() : this(
        weapons.random()
        /*when ((1..6).random()) {
            1, 2, 3 -> "Dolch"
            4, 5 -> "Handaxt"
            6 -> "Schwert des Drachenjägers"
            else -> ""
        }*/
    ) {
    }

}