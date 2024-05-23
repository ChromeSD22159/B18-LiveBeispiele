fun main() {
    try {
        // Fehler aufgekommen durch unserer Fehlerfunktion
        //problemFunction("risky")

        //val result = divide(10, 0)
        //println("Ergebnis: $result")

        //val numbers = listOf(1, 2, 3)
        //println(numbers[99])

        val value: String? = null
        println(value!!.length)

    } catch (e: ArithmeticException) {
        println("Mathefehler mit der Nachricht: ${e.message}")
    } catch (e: IndexOutOfBoundsException) {
        println("Indexfehler mit der Nachricht: ${e.message}")
    } catch(e: NullPointerException) {
        println("Nullpointer Fehler mit der Nachricht ${e.message}")
    } catch (e: Exception) {
        println("Fehler aufgetreten mit der Nachricht: ${e.message}")
    } finally {
        println("Dieser Block wird immer ausgeführt")
    }
}

// Selbstgeschriebene Funktion die einen Fehler schmeißt
fun problemFunction(operation: String) {
    if (operation == "risky") {
        throw Exception("Ein Fehler ist aufgetreten")
    }
    println("Gab kein Problem!")
}

fun divide(x: Int, y: Int): Int {
    if (y == 0) {
        throw ArithmeticException("Teilen durch Null geht nicht!")
    }
    return x/y
}