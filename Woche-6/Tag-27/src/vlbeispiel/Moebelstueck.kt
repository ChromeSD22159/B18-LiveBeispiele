package vlbeispiel

open class Moebelstueck(
    var name: String,
    var preis: Double
) {
    var catalogNR: Int? = null
    var farbe: String = ""
    var moeglicheFarben: List<String> = listOf()

    fun farbeWechseln(neueFarbe: String) {

    }
}