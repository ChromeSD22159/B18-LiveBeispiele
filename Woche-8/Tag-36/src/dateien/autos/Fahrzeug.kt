package dateien.autos

open class Fahrzeug(var modell: String, var preis: Double, var marke: Marke) {

    open fun save(): String {
        return "$modell,$preis,$marke"
    }

    override fun toString(): String {
        return "${this::class.simpleName}: $modell, $preis 💰, $marke"
    }
}