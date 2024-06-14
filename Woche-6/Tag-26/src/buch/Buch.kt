package buch

class Buch (
    val alleSeiten: List<Seite>
) {
    var aktuelleSeite = alleSeiten.first()

    fun read(){
        for (seite in alleSeiten){
            seite.read()
        }
    }

    fun zurueckBlaettern(){
        val index = alleSeiten.indexOf(aktuelleSeite)
        aktuelleSeite = alleSeiten[index - 1]
    }

    fun weiterBlaettern(){
        val index = alleSeiten.indexOf(aktuelleSeite)
        aktuelleSeite = alleSeiten[index + 1]
    }


}