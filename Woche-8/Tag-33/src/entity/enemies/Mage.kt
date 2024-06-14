package entity.enemies

import effects.spells.Caster
import effects.spells.Spell
import entity.Entity

class Mage(override var spellList: List<Spell>, override var mana: Int) : Entity("Mage", 60), Caster