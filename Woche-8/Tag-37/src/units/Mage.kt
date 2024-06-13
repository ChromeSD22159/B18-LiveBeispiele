package units

import playSound

class Mage(
    name: String
) : Unit(name) {

    fun fireBall(target: Unit) {
        println("Der Mage $name castet einen Feuerball auf ${target.name}")
        playSound("fireball").start()
    }
}