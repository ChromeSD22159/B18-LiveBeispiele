package buch

class Buch (
    val pages: List<Seite>
) {
    var aktuelleSeite = pages.first()

    fun read(){
        for (seite in pages){
            seite.read()
        }
    }

    fun zurueckBlaettern(){
        val index = pages.indexOf(aktuelleSeite)
        aktuelleSeite = pages[index - 1]
    }

    fun weiterBlaettern(){
        val index = pages.indexOf(aktuelleSeite)
        aktuelleSeite = pages[index + 1]
    }


}