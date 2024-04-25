
fun main(){

    var beispiel: String = "Hallo, mein Name ist Bond, James Bond"

    // .split teilt den Satz
    var aufteilung: List<String> = beispiel.split(",")
    println(aufteilung)

    println("Geben sie 2 Kommazahlen ein: (mit , getrennt)")
    var eingabe: List<String> = readln().split(',')

    val zahl1 = eingabe[0].toDouble()
    val zahl2 = eingabe[1].toDouble()

    println("Von $zahl1 bis $zahl2")


    // String.split
    println("-----------------")

    var testBeispiel: List<String> = "1000,-346,0,45".split(',')
    println(testBeispiel)
    println(testBeispiel[0].toInt())

    println("Geben sie 2 Zahlen ein (mit ' ' getrennt):")
    /*    var input = readln().split(' ')
        var zahl1 = input[0].toDouble()
        var zahl2 = input[1].toDouble()

        println("Zahl 1: $zahl1")
        println("Zahl 2: $zahl2")*/

}