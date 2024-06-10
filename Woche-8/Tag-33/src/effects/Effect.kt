package effects

import entity.Entity

abstract class Effect(
    var name: String,
    var effect: Int
) {
    abstract fun use(user: Entity, target: Entity)
}