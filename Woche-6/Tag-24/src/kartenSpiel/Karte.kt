package Kartenspiel

class Karte (
    val suit: String, // farbe, zB "Herz"
    val wert: String  // wert,  zB "7"
){
    var aufgedeckt: Boolean = false


    fun umdrehen(){
        this.aufgedeckt = !this.aufgedeckt
    }

    /**
     * Diese Funktion gibt einen String an,
     * mit dem man die Karte schön auf der Konsole ausdrucken kann.
     * Z.B [♠A]
     */
    fun printKarte(): String{
        if (!this.aufgedeckt)
            return "[x]"

        var teil1: String = when(this.suit) {
            "Herz" -> "♥"
            "Karo" -> "♦"
            "Pik" -> "♠"
            "Kreuz" -> "♣"
            else -> "unbekannt"
        }
        var teil2: String = when (this.wert){
            "Ass" -> "A"
            "König" -> "K"
            "Dame" -> "D"
            "Bube" -> "B"
            else -> this.wert
        }

        return "[$teil1$teil2]"
    }


    fun wertInBlackjack(): Int{
        return when (this.wert){
            "A" -> 11
            "B", "K", "D", "10" -> 10
            else -> this.wert.toInt()
        }
    }



}