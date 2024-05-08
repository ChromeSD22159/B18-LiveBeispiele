import kotlin.math.min

fun main() {
    var a = 10
    var b = 20
    // Wir können funktinen auch verschachteln, wenn diese etwas zurückgeben und der
    // Datentyp der Rückgabe passend zu dem Parameter der nächsten Funktion ist.
    var result = sub(mult(3, add(a, b)), 4)


    var detailedResult = add(a, b)
    detailedResult = mult(3, detailedResult)
    detailedResult = sub(detailedResult, 4)
    println(detailedResult)

    feinwaesche(minuten = 120, waschmittel = "Persil")
}

fun add(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun sub(number1: Int, number2: Int): Int {
    return number1 - number2
}

fun mult(number1: Int, number2: Int): Int {
    return number1 * number2
}

fun div(number1: Int, number2: Int): Int {
    return number1 / number2
}

fun feinwaesche(
    temp: Int = 40,
    umdrehungen: Int = 1200,
    minuten: Int = 90,
    waschmittel: String = "Spee",
    farben: String = "Bunt"
) {
    println("Wir starten eine $farben Wäsche mit dem Waschmittel $waschmittel, haben $umdrehungen umdrehungen auf $temp grad und das ganze geht $minuten minuten.")
}