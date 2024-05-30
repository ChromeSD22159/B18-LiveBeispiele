package vlbeispiel

class Moebelhaus {
    var produktKatalog: MutableMap<Int, Moebelstueck> = mutableMapOf()
    var aktuelleAusstellung: MutableList<Moebelstueck> = mutableListOf()

    fun preisAbfrage(ID: Int): Double {
        return 0.0
    }

    fun preisAbfrage(name: String): Double {
        return 0.0
    }
}