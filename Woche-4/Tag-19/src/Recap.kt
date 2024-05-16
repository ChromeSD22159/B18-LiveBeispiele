fun main() {

    // Try Catch für den generischen Fehler.
    try {
        throwGeneralException()
    } catch (e: Exception) {
        println("Generischen Fehler abgefangen mit der Nachricht: ${e.message}")
    }

    // Try Catch für den mathematischen Fehler.
    try {
        throwArithmeticException()
    } catch (e: ArithmeticException) {
        println("Mathematischer Fehler abgefangen mit der Nachricht: ${e.message}")
    }

    // Try Catch für den Index Fehler.
    try {
        throwIndexException()
    } catch (e: IndexOutOfBoundsException) {
        println("Index Fehler abgefangen mit der Nachricht: ${e.message}")
    }

    // Try Catch für den Null Pointer Fehler.
    try {
        throwNullPointerException()
    } catch (e: NullPointerException) {
        println("Null Pointer Fehler abgefangen mit der Nachricht: ${e.message}")
    }

    // Try Catch mit mehreren Catch Fällen.
    /*try {
        throwGeneralException()
        throwArithmeticException()
        throwIndexException()
        throwNullPointerException()
    } catch (e: ArithmeticException) {
        println("Mathematischer Fehler abgefangen mit der Nachricht: ${e.message}")
    } catch (e: IndexOutOfBoundsException) {
        println("Index Fehler abgefangen mit der Nachricht: ${e.message}")
    } catch (e: NullPointerException) {
        println("Null Pointer Fehler abgefangen mit der Nachricht: ${e.message}")
    } catch (e: Exception) {
        println("Generischen Fehler abgefangen mit der Nachricht: ${e.message}")
    } finally {
        println("Finally Block wird immer ausgeführt!")
    }*/

}

// Funktion, die den generischen Fehler für uns ausschmeißt.
fun throwGeneralException() {
    throw Exception("Bin eine generische Exception.")
}

// Funktion, die den mathematischen Fehler für uns ausschmeißt.
fun throwArithmeticException() {
    throw ArithmeticException("Bin eine mathematische Exception.")
}

// Funktion, die den Index Fehler für uns ausschmeißt.
fun throwIndexException() {
    throw IndexOutOfBoundsException("Bin eine Index Exception.")
}

// Funktion, die den Null Pointer Fehler für uns ausschmeißt.
fun throwNullPointerException() {
    throw NullPointerException("Bin eine Null Pointer Exception.")
}