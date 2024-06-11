

fun main(){

    repeat(10) {
        try {
            fehlerFunktion()
        } catch (e: Exception){
            println("Fehler verhindert.")
        }
    }

}


// Die Fehler Funktion hat eine 33% Chance einen Laufzeitfehler zu verursachen
fun fehlerFunktion(){
    val zufallsZahl = (1..3).random()

    when(zufallsZahl){
        1,2 -> println("\tKein Fehler aufgetreten")
        3 -> throw Exception("Fehler ist aufgetreten")
    }
}