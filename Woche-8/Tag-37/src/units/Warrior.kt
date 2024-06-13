package units

import playSound

class Warrior(
    name: String
) : Unit(name) {
    fun schwertHieb(target: Unit) {
        println("Der Krieger $name greift ${target.name} mit seinem Schwert an!")
        playSound("sword").start()
    }
}