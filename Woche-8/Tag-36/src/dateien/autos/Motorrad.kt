package dateien.autos

class Motorrad(
    modell: String,
    preis: Double,
    marke: Marke,
    var hatBeiwagen: Boolean
): Fahrzeug(modell, preis, marke) {

    override fun save(): String {
        return super.save() + ",Motorrad,$hatBeiwagen"
    }

    override fun toString(): String {
        return "🏍️${super.toString()}, Beiwagen: ${if (hatBeiwagen) "Ja" else "Nein"}"
    }
}