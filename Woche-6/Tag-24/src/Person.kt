import java.util.UUID

// Klassen werden GrossGeschrieben
class Person (
    // Eigenschaften
    var name: String = "",
    var vorname: String = "",
    var alter: Int = 0,
    val geschlecht: String = listOf("m", "f").random(),
    var haarfarbe: String,
    var hobbies: MutableList<String> = mutableListOf()
){
    // Methoden
    fun geburtstag(){
        println("HURRA! $vorname feiert heute Geburtstag")
        alter ++
    }

    fun vorstellen(){
        println("Ich heiße $vorname $name und bin $alter Jahre alt.")
    }
}