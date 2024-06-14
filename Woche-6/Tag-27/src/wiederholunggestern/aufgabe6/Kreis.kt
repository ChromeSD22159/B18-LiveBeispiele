package wiederholunggestern.aufgabe6

class Kreis(
    color: String,
    var a: Int
) : Form(
    color
) {

    fun flaeche(): Double {
        return Math.PI * a * a
    }

    fun umfang(): Double {
        return 2 * a * Math.PI
    }
}