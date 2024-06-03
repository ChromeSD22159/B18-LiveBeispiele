open class Tier(
    var name: String,
    var gewicht: Double,
    var alter: Int,
    val geschlecht: String = listOf("m", "w").random()
) {
    fun bewegung() {
        println("$name bewegt sich durchs Gehege.")
    }

    open fun geraeuscheMachen() { // abstrakte funktion
       //
    }

    fun streicheln(besucher : Besucher) {
        println("Der Besucher '${besucher.name}' streichelt $name.")
    }

    open fun fuettern(besucher : Besucher) {
        println("'${besucher.name}' gibt $name etwas zu Essen. $name stürzt sich auf das Essen und frisst sich satt.")
        gewicht *= 1.02
    }

}