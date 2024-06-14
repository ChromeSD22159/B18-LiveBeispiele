package vlbeispiel

class Couch(
    name: String,
    preis: Double,
    var hoehe: Double,
    var breite: Double,
    var ausklappbar: Boolean = false
) : Moebelstueck(
    name, preis
) {
    var ausgeklappt: Boolean = false

    fun ausklappen() {

    }
}

fun main() {

    var couch = Couch("Name", 10.0, 2.0, 3.0, true)

    couch.farbeWechseln("Rot")
    couch.farbe
}