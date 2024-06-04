fun main(){
    val text = "Hallo ich heiße Tobi. Mein Alter ist 7 Jahre. Ich bin Schüler."

    // Buchstabe für Buchstabe
    for (buchstabe in text){
        print(buchstabe)
        Thread.sleep(250)
    }
    println("\n----")

    // Wort für Wort
    for (word in text.split(" ")){
        print(word)
        print(" ")
        Thread.sleep(500)
    }

    println("\n----")

    // Satz für Satz
    for (satz in text.split(".")){
        println(satz)
        Thread.sleep(500)
    }
    println("\n----")

    // Zeile für Zeile
//    for (satz in text.split("\n")){

}