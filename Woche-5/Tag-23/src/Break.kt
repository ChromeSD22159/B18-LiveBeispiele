val namensListe = listOf(
    "Brian", "Benni", "Hannes",
    "Emily", "Merlin", "Stephan", "Nico",
    "Tobi", "Cora", "Rita"
)

fun main(){
    // Position in Liste finden:
    //    index = namensListe.indexOf("Merlin")

    val gesuchterName = "Merlin"
    var index: Int = -1
    for (i in namensListe.indices) {
        val name = namensListe[i]

        if (name == gesuchterName) {
            index = i
            break // Suche kann nun abgebrochen werden
        }
    }
    println("$gesuchterName steht an Stelle ${index + 1}")


    // Spiel Loop abbrechen
    while (true){
        spielRunde()

        println("Möchten sie weiter spielen? (J/N)")
        val input = readln()
        if (input == "N"){
            break
        }
        // ...
    }
    println("Danke fürs Spielen")

}

fun spielRunde(){
    val ergebnis = listOf("Gewonnen!", "Verloren").random()
    println(ergebnis)
}