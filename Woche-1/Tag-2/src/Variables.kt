fun main() {

    // var steht für Variable  (eng: "variable")
    // val steht für Konstante (eng: "value")
    val minAlter: Int = 21          // Int = Integer
//    minAlter = 18       // Fehler, Konstanten kann man nicht neu belegen
    println("Das Mindestalter ist $minAlter")

    var myAge: Int = readln().toInt()
    println("Mein Alter ist: $myAge")

    val istNutzerAltGenug: Boolean = myAge > minAlter

    myAge = 30
    println("Das Alter ist jetzt: $myAge")

    myAge = myAge + 1
    println("Das Alter ist jetzt: $myAge")

    val geburtsJahr: Int = 2001    // Konstante
    var alter: Int = 2024 - geburtsJahr  // Variable

    println("Wenn ich $geburtsJahr geboren bin, bin ich jetzt $alter")

    val vorname1 : String = "Fabian"
    val vorname2 = "Niclas"
    val nachname = "Hermann"
    val ganzerName = "$vorname1 $vorname2 $nachname"
    var email: String = "Hallo94@GMAIL.COM"

    var brief: String = """
        Hallo ...👋🏻👋🏻,
        
            ich ...
        
            Liebe Grüße
            Gordon ❤️❤️
    """.trimIndent()

    println(brief)

    // Fehler, wenn ich falschen Datentyp verwende
//    email = 50
//    alter = "Hi"


    // Diese Var speichert, ob es regnet
    var isRaining: Boolean = true
    isRaining = false

    // Beachtet den Unterschied zwischen "val" und "var"
    val isSunny: Boolean = false
    //isSunny = true

}