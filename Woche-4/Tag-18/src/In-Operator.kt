fun main() {
    val letter = 'a'
    val word = "alphabet"
    if(letter in word) {
        println("Der Buchstabe $letter ist in $word enthalten!")
    } else {
        println("Der Buchstabe $letter ist in $word nicht enthalten!")
    }

    println("Gebe mir eine Nummer zwischen 1 und 10")
    val number = readln().toInt()
    val numbers = listOf(1, 2, 3, 4, 5)
    if (number in numbers) {
        println("Die Zahl $number ist in der Liste enthalten")
    } else {
        println("Die Zahl $number ist nicht in der Liste")
    }

    if(number !in 6..10) {
        println("Die Zahl $number liegt nicht zwischen 6 und 10")
    } else {
        println("Die Zahl $number liegt zwischen 6 und 10")
    }
}