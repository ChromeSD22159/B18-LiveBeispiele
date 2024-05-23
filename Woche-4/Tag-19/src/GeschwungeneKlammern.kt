fun main() {
    simpleFunction()

    println("Regnet es heute?")
    val userInput = readln()
    conditions(userInput)
}

fun simpleFunction() {
    val x = 2
    val y = 3
    val sum = x + y
    println("Summe: $sum")
}

fun conditions(rain: String) {
    if (rain == "ja") {
        println("Nimm einen Regenschirm mit.")
    } else {
        println("Geht auch ohne.")
    }
}

