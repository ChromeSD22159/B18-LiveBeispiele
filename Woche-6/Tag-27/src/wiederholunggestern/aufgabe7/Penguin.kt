package wiederholunggestern.aufgabe7

class Penguin(
    weight: Double
) : Bird(
    weight,
    false
) {

    fun waddle() {
        println("Der Pinguin watschelt!")
    }
}