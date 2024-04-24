fun main(){

    val groesse = 1.8

    println("Größe: $groesse")


    println("Größe: %.2f\nName: Moh".format(groesse))

    // Andere Datentypen als String einlesen:
        // .toInt()
        // .toBoolean()
        // .toDouble()
    println("Wie alt sind sie? geben sie in Jahren ein:")
    var alter: Int = readln().toInt()

    println("Sie sind $alter Jahre alt")

}