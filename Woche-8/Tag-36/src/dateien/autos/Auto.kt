package dateien.autos

class Auto(
    modell: String,
    preis: Double,
    marke: Marke,
    var anzahlSitze: Int
): Fahrzeug(modell, preis, marke) {

    override fun save(): String {
        return super.save() + ",Auto,$anzahlSitze"
    }

    override fun toString(): String {
        return "🚙${super.toString()}, Sitze: $anzahlSitze"
    }
}