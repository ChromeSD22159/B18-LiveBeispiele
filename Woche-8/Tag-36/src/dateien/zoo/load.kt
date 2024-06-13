package dateien.zoo

import java.io.File

fun main(){
    val saveDatei = File(SAVE_PFAD)

    val tierListe: MutableList<Tier> = mutableListOf()

    var i = 0

    val alleZeilen: List<String> = saveDatei.readLines()

    for (zeile in alleZeilen){  // nicht  readln() !!
        if (i == 0) {
            i++
            continue
        }

        val daten = zeile.split(",")
        val namen = daten[0]
        val alter = daten[1].toInt()

        val tier =
            if (daten.size > 2)
                daten[2]
            else
                ""

        when(tier){
            "Hund" -> tierListe.add(Hund(namen, alter))
            "Katze" -> tierListe.add(Katze(namen, alter))
            else -> tierListe.add(Tier(namen, alter))
        }
        // i++
    }

    for (tier in tierListe)
        println(tier)

}


fun loadGame(saveDatei: String = ""){}

fun saveGame(){}

fun mainGame(){
    println("Was wollen sie tun?")
    var input = readln()

    when(input){
        "s" -> saveGame()
        "l" -> loadGame()
        //"c" -> continue()
    }
}