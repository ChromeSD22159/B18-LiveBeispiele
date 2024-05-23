var playerLevel = (1..20).random()
var enemyLevel = (1..20).random()

// Startpunkt des Programms
fun main() {

    // Situation des Spiels und die verschiedenen Auswahlmöglichkeiten
    println("In einer Höhle begegnest du einem Drachen. Was machst du?")
    println("A: Angreifen")
    println("B: Wegrennen")
    println("C: Euch totstellen")
    println("D: Weinen")

    // Eingabe unseres Spielers wird gespeichert
    val userInput = readln()

    // Abhängig vom Level des Spielers und des Drachen wird jeweil ein Codeblock ausgeführt.
    if(playerLevel > enemyLevel) {
        userWon(userInput)
        println("Dein Level war: $playerLevel. Das Level des Drachen war: $enemyLevel")
        println("Du hast gewonnen! \n!!!Game Over!!!")
    } else {
        userLost(userInput)
        println("Dein Level war: $playerLevel. Das Level des Drachen war: $enemyLevel")
        println("Du hast verloren! \n!!!Game Over!!!")
    }

}

// Funktion für den Fall, dass der Spieler gewinnt.
fun userWon(userInput: String) {
    // When Bedingung abhängig von der getätigten Eingabe des Spielers
    when(userInput) {
        "A" -> println("Du hast den Drachen besiegt.")
        "B" -> println("Du bist entkommen.")
        "C" -> println("Der Drache ist weggegangen.")
        "D" -> println("Der Drache ist verwirrt, gibt uns Taschentücher und geht zusammen mit uns ein Bier trinken.")
    }
}

// Funktion für den Fall, dass der Spieler verliert.
fun userLost(userInput: String) {
    // When Bedingung abhängig von der getätigten Eingabe des Spielers
    when(userInput) {
        "A" -> println("Der Drache verschlingt uns.")
        "B" -> println("Du bist beim weglaufen hingefallen und der Drache verschlingt dich.")
        "C" -> println("Der Drache ist nicht darauf hereingefallen und verschlingt dich.")
        "D" -> println("Der Drache ist zwar verwirrt, verschlingt dich aber trotzdem.")
    }
}