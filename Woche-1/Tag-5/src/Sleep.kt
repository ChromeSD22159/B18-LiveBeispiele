fun main(){

    val textGeschwindigkeit: Long = 150L

    var einleitungsText: String = """
        Es war einmal vor einer langen Zeit.
        Ein mächtiges Kotlin Programm.
    """.trimIndent()

    for (buchstabe in einleitungsText){
        print(buchstabe)
        Thread.sleep(textGeschwindigkeit)
    }
    println()



    print("Hallo ")
    Thread.sleep(3000) // 3 sec warten
    println("Welt")

    print("4 + 5 = ")
    Thread.sleep(5000)
    println(4+5)


    val ergebnis = 4+9
    print("Was ist 4 + 9?   ...")
    println(ergebnis)
    println("Das Ergebnis ist $ergebnis")
}