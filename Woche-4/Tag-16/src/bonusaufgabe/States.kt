package bonusaufgabe

class States(option: Options? = Options.STATIC) {
    var simHungry: Boolean? = false //
    var houseDirty: Boolean? = false //
    var simTired: Boolean? = false //
    var simWork: Boolean? = false
    var simDoSports: Boolean? = false
    var simGoShopping: Boolean? = false
    var simHobby: Boolean? = false
    var simLonely: Boolean? = false //

    var duration: Long = 500L

    fun generateStates(option: Options) {
        if(option == Options.GENERATED) {
            simHungry = Random().zufallsBoolean()
            houseDirty = Random().zufallsBoolean()
            simTired = Random().zufallsBoolean()
            simLonely = Random().zufallsBoolean()
            simWork = Random().zufallsBoolean()
            simDoSports = Random().zufallsBoolean()
            simGoShopping = Random().zufallsBoolean()
            simHobby = Random().zufallsBoolean()
        }
        if(option == Options.STATIC) {
            val bool = true
            simHungry = bool
            houseDirty = bool
            simTired = bool
            simLonely = bool
            simWork = bool
            simDoSports = bool
            simGoShopping = bool
            simHobby = bool
        }
    }

    init {
        generateStates(option ?: Options.STATIC)
    }
}