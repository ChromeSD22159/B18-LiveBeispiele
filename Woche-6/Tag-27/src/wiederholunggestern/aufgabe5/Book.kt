package wiederholunggestern.aufgabe5

class Book(
    var pages: List<Page>
) {
    var page: Page = pages[0]

    fun read() {
        page.read()
    }

    fun nextPage() {
        val currentPageIndex = pages.indexOf(page)
        if(currentPageIndex < pages.size - 1) {
            page = pages[currentPageIndex + 1]
        } else {
            println("Du bist am Ende des Buches angekommen!")
        }
    }

    fun previousPage() {
        val currentPageIndex = pages.indexOf(page)
        if(currentPageIndex > 0) {
            page = pages[currentPageIndex - 1]
        } else {
            println("Du bist am Anfang des Buches angekommen!")
        }
    }
}