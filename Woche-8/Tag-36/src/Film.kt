class Film(
    val titel: String,
    var preis: Double,
    val genre: Genre
) {

    fun printInfo(){
        if (preis < 10.0)
            println("ANGEBOT: $titel (${genre}) für $preis 💶")
        else
            println("$titel (${genre}) für $preis 💶")
    }
}