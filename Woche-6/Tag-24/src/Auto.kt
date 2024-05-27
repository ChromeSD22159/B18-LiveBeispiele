class Auto (
    val marke: String,
    val modell: String,
    var aktuelleGeschwindigkeit: Int = 0
){

    fun beschleunigen(){
        aktuelleGeschwindigkeit += 5
    }

    fun bremsen(){
        aktuelleGeschwindigkeit -= 5
    }
}