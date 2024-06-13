import farben.BOLD_UNDERLINE

class Hero(
    val name: String,
    var lp: Int,
    var atk: Int,
    var energie: Int = 100
) {
    val maxLP = lp
    val maxEnergie = energie


    fun attacke(gegner: Hero){
        this.energie -= 20
        gegner.lp -= atk
    }

    fun printStatus(){
        println("${name.farbe(BOLD_UNDERLINE)} ❤️${lp}/${maxLP} ⚡️️$energie/$maxEnergie")
    }
}