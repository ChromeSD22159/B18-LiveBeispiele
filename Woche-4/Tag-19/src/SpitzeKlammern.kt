fun main() {
    val numbers = listOf<Int>(1, 2, 3)
    val decimals = listOf<Double>(1.1, 2.2, 3.3)
    val bools = listOf<Boolean>(true, false)
    val food = listOf<String>("Pizza", "Pasta", "Sushi")

    val shoppingList = mapOf<String, Int>(
        "apples" to 5,
        "banana" to 10,
        "milk" to 2
    )

    comparison()
}

fun comparison() {
    val livePlayer = 20
    val liveEnemy = 10

    if (livePlayer > liveEnemy) {
        println("Der Spieler hat überlebt.")
    }
}