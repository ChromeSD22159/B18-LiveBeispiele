fun main() {
    var kuh = Kuh()
    var schwein = Schwein()
    kuh.makeNoise()

    var bauernHof: List<Tier> = listOf(
        kuh,
        schwein
    )

    (bauernHof[1] as? Schwein)?.welzen()

    val tierAtIndex0 = bauernHof[0]
    if(tierAtIndex0 is Schwein) {
        tierAtIndex0.welzen()
    }
}

open class Tier() {

    open fun makeNoise() {

    }
}

class Kuh(): Tier() {

    override fun makeNoise() {
        println("MOOOO")
    }
}

class Schwein(): Tier() {

    override fun makeNoise() {
        println("OINK")
    }

    fun welzen() {
        println("Das Schwein welzt sich!")
    }
}