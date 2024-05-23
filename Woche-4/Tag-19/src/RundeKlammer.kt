import java.util.*

val playerStrength = 50
val enemyStrength = 10

fun main() {
    val result1 = (2 + 3) * 5
    println("(2 + 3) * 5 = $result1")

    val result2 = 2 + 3 * 5
    println("2 + 3 * 5 = $result2")

    var result3 = "Peter" + " Pan".uppercase()
    println(result3)

    var result4 = ("Peter" + " Pan").uppercase()
    println(result4)

    println("Gebe dein Geburtsjahr ein.")
    val userInput = readln().toInt()
    age(userInput)

    sayHello()

    if (playerStrength > enemyStrength) {
        println("Der Spieler hat gewonnen!")
    }
}

fun age(year: Int) {
    val calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.YEAR)
    val userAge =  currentYear - year
    println("Du bist in diesem Jahr $userAge Jahre alt!")
}

fun sayHello() {
    println("Hello World")
}