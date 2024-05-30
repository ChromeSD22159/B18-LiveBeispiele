package realisation

fun main() {

    var gegner = Enemy()
    gegner.introduce()
    gegner.fliegen()
    gegner.schiessen()
}

class Enemy(): Fliegen, Schiessen {

    fun introduce() {
        println("Ich bin ein gegner!")
    }
}

class Enemy2(): Fliegen {

}