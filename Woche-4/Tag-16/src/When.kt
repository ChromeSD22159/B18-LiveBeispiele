
fun main(){
    println("Geben sie den Monat ein: (als Zahl)")

    var eingabe: String = readln()
    var monatsEingabe: Int

    // Dieser Teil prüft ob eine Zahl eingegeben wurde
    if (eingabe.isNumeric()) {
        // Wenn eine gültige Zahl eingegeben wurde, wird sie umgewandelt
        monatsEingabe = eingabe.toInt()
    }
    else {
        // Ansonsten wird der "Fehlercode" -1 zugewiesen
        monatsEingabe = -1
    }

    when (monatsEingabe){
        1 -> {
            println("Januar")
            println("Gratuliere zum neuem Jahr")
        }

        // bei einzelnen Anweisungen können {} weggelassen werden
        2 -> println("Februar")

        // Dieser Fall kann nie erreicht werden, weil 2 bereits ein Fall ist
        2 -> println("February")

        // Wir können auch Fälle zusammen gruppieren
        3, 4, 5 -> println("Frühling")
        in 6..9 -> println("Sommer")
        in listOf(10, 11, 12) -> println("Herbst")

        // Else deckt ALLE verbleibenden Fälle ab
        else -> {
            println("Ungültige Eingabe")
        }
    }

    val monatAlsZahl: Int = (1..12).random()
    val monatAlsText: String = when(monatAlsZahl){
        1 -> {
            "Januar"
        }
        2 -> "Februar"
        3 -> "März"
        //..
        12 -> "Dezember"
        else -> "FEHLER!"
    }


}



fun hauptmenu(){
    println("Wählen sie 1-3")
    when (readln().lowercase()){            // "Gordon" -> "gordon", "TEST" -> "test", "test" -> "test"
        "1", "01", " 1", "eins" -> {    // "Eins", "EINS", "EiNS"
            println("Continue")
        }
        "2", "zwei" -> {
            println("App beenden")
        }
        in listOf("3", "drei", "DREI", "03") ->
            println("Einstellungen")
        else -> {
            println("Falsche Eingabe")
            hauptmenu()
        }
    }
}

/**
 * Überprüft, ob ein String nur Zahlen enthält
 */
fun String.isNumeric(): Boolean{
    return this.all { it.isDigit()  }       // is Digit überprüft, ob ein Zeichen eine Zahl ist
}