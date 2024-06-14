package entity.enemies

import effects.attacks.Attack
import effects.attacks.Attacker
import effects.spells.Caster
import effects.spells.Spell
import entity.Entity

class BattleMage(
    override var attackList: List<Attack>,
    override var spellList: List<Spell>,
    override var mana: Int
) : Entity(
    "BattleMage",
    100
), Attacker, Caster