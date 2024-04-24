
fun main(){

    // Alterseingabe:
    println("Geben sie ihr Alter ein:")
    var input: String = readln()

//    input = input.toInt()     // Fehler!
    var alter: Int = input.toInt()

//    input >= 18
    val istAltGenug: Boolean = alter >= 18
    println("Du bist volljährig? $istAltGenug")

    println("---------")

    println("Geben sie eine Kommazahl ein:")
    var testString: String = readln()
//    testString = testString.toDouble()
    var testDouble: Double = testString.toDouble()
    var testInt: Int = testDouble.toInt()

    println(testDouble)
    println(testInt)

    // Das ist das selbe...
    var text: String = 123456.toString()    // "123456"
    println("Text1 : $text")
    // wie das hier:
    text = "${123456}"                      // "123456"
    println("Text2 : $text")


    text = true.toString()

}
