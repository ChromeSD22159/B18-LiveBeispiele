package effects.spells

import entity.Entity

interface Caster {
    var spellList: List<Spell>
    var mana: Int

    fun listSpells() {
        spellList.forEachIndexed { index, spell ->
            println("${index + 1}. ${spell.name} kostet ${spell.manaCost} mana!")
        }
    }

    fun useSpell(user: Entity, target: Entity) {
        println("Bitte wähle einen Zauber aus:")
        listSpells()
        try {
            val input = readln().toInt() - 1
            val spell = spellList[input]
            if(mana < spell.manaCost) {
                println("Du hast nicht genug mana!")
            } else {
                spell.use(user, target)
            }
        } catch (e: Exception) {
            println("Du hast die falsche Eingage getätigt!")
            useSpell(user, target)
        }
    }
}