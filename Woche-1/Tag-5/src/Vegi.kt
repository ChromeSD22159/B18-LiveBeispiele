import farben.*

fun main(){

    println("Wollen sie das vegetarische Menu?")

    var antwort: String = readln()

    val vegetarisch: Boolean = antwort.equals("ja", true)
        // antwort.lowercase().contains("ja") && !antwort.lowercase().contains("nein")
    println("Sie haben das vegetarische Menu gewählt: $blau$vegetarisch$reset")

}