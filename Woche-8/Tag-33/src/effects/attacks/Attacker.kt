package effects.attacks

import entity.Entity

interface Attacker {
    var attackList: List<Attack>

    fun listAttacks() {
        attackList.forEachIndexed { index, attack ->
            println("${index + 1}. ${attack.name}")
        }
    }

    fun useAttack(user: Entity, target: Entity) {
        println("Bitte wähle einen Angriff aus:")
        listAttacks()
        try {
            val input = readln().toInt() - 1
            attackList[input].use(user, target)
        } catch (e: Exception) {
            println("Du hast die falsche Eingage getätigt!")
            useAttack(user, target)
        }
    }
}