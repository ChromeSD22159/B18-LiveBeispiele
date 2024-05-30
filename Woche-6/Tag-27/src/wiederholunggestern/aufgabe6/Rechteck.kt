package wiederholunggestern.aufgabe6

class Rechteck(
    color: String,
    var a: Int,
    var b: Int
) : Form(
    color
) {
    fun flaeche(): Int {
        return a * b
    }

    fun umfang(): Int {
        return 2 * a + 2 * b
    }
}