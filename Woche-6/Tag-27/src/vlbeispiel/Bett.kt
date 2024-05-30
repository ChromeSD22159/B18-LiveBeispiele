package vlbeispiel

class Bett(
    name: String,
    preis: Double,
    var hoehe: Double,
    var breite: Double,
    var laenge: Double,
    var matraze: Boolean
) : Moebelstueck(
    name, preis
) {
    var matrazeINKL: Boolean = false

}