import farben.*

fun main(){


    var antwort: String = ""

    while (antwort.isBlank()){
        println()
        println("Wollen sie das vegetarische Menu?")
        antwort = readln()
    }

//    while(! email.contains('@'))

    val vegetarisch: Boolean = antwort.equals("ja", true)
        // antwort.lowercase().contains("ja") && !antwort.lowercase().contains("nein")
    println("Sie haben das vegetarische Menu gewählt: $blau$vegetarisch$reset")

}