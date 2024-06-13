package dateien.zoo

open class Tier (var name: String, var alter: Int) {

    open fun save(): String{
        return "$name,$alter"
    }

    override fun toString(): String {
        return "${this::class.simpleName}: $name, $alter"
    }
}