package wiederholunggestern.aufgabe7

fun main() {

    var penguin = Penguin(5.0)
    var adler = Eagle(20.0)
    println("Der Penguin kann fliegen? ${penguin.canFly}")
    println("Der Adler kann fliegen? ${adler.canFly}")
    penguin.makeNoise()
    adler.makeNoise()
    penguin.waddle()
    adler.fly()
}