package effects.spells

import effects.Effect
import entity.Entity

abstract class Spell(
    name: String,
    effect: Int,
    var manaCost: Int
) : Effect(
    name,
    effect
) {

    override fun use(user: Entity, target: Entity) {
        println("${user.name} benutzt $name und greift damit ${target.name} an und verursacht $effect Schaden!")
        target.hp -= effect
        println("${target.name} hat noch ${target.hp} Leben übrig!")
    }
}