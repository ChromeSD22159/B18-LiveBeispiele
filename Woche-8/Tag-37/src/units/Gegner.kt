package units

import playSound

class Gegner(
    name: String
) : Unit(name) {
    fun mockHeroes() {
        println("Der Boss sitzt auf seinem Thron und schmeißt mit Geld!")
        playSound("coin").start()
    }
}