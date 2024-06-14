import effects.attacks.BasicAttack
import effects.spells.FireBall
import entity.enemies.BattleMage
import entity.enemies.Mage
import entity.enemies.Warrior

fun main() {
    val mage = Mage(
        listOf(FireBall()),
        100
    )
    val battleMage = BattleMage(
        listOf(BasicAttack()),
        listOf(FireBall()),
        100
    )
    val warrior = Warrior(
        listOf(BasicAttack())
    )


    mage.listSpells()
    mage.useSpell(mage, warrior)
    warrior.listAttacks()

    battleMage.listAttacks()
    battleMage.listSpells()
}