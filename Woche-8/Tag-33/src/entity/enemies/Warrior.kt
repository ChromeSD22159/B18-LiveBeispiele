package entity.enemies

import effects.attacks.Attack
import effects.attacks.Attacker
import entity.Entity

class Warrior(
    override var attackList: List<Attack>
) : Entity(
    "Warrior",
    150
), Attacker