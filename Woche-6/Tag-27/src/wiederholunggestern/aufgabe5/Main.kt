package wiederholunggestern.aufgabe5

fun main() {
    val book = Book(
        listOf(
            Page("Seite 1"),
            Page("Seite 2"),
            Page("Seite 3"),
            Page("Seite 4"),
        )
    )

    book.read()
    book.nextPage()
    book.read()
    book.nextPage()
    book.read()
    book.nextPage()
    book.read()
    book.nextPage()
}