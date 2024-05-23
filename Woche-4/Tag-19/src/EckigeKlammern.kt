fun main() {
    exampleList()
    exampleMaps()
    exampleString()
}

fun exampleList() {
    val einkaufswagen = mutableListOf("Milch", "Fleisch", "Wasser", "Gemüse")
    println(einkaufswagen[0])

    einkaufswagen[3] = "Taschentücher"
    println(einkaufswagen)

    einkaufswagen.add(2, "Käse")
    println(einkaufswagen)
    println(einkaufswagen[3])
}

fun exampleMaps() {
    val gameMap = mutableMapOf(
        "Final Fantasy 7" to 69.99,
        "Call of Duty" to 34.55,
        "Minecraft" to 19.99
    )

    println(gameMap)

    gameMap["Minecraft"] = 199999.99
    gameMap["Final Fantasy 7"] = 12.99

    println(gameMap)
}

fun exampleString() {
    val word = "Kotlin"

    val firstChar = word[0] // Buchstabe K
    val secondChar = word[2] // Buchstabe t
    val thirdChar = word[word.length - 1] // Buchstabe n

    println("Erster Buchstabe: $firstChar")
    println("Dritter Buchstabe: $secondChar")
    println("Letzter Buchstabe: $thirdChar")
}