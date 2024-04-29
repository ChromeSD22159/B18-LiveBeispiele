fun main(){

    val horrorFilme = listOf("The Ring", "Das Schweigen der Lämmer")
    val actionFilme = listOf("James Bond", "Die Hard")

    val alleFilme = horrorFilme + actionFilme

    println(alleFilme)

    println(alleFilme.joinToString("\n"))

    println("The Ring"[0])




    val ergebnis = horrorFilme[0] + actionFilme[1]
    println(ergebnis)
//    list[index] = neuerWert
}