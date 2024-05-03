fun main(){

    // Eine Map, bei der jeder Film ein Genre bekommt
    val genreMap: MutableMap<String, String> = mutableMapOf(
        "The Ring" to "Horror",
        "Inception" to "Drama",
        "Findet Nemo" to "Animation",
        "James Bond" to "Action",
        "Shrek" to "Animation"
    )

    // Mehrere Genres:
    val genreMapV2: Map<String, List<String>> = mapOf(
        "The Ring" to listOf("Horror", "Drama"),
        "Findet Nemo" to listOf("Animation")
    )

    val film: String = genreMapV2.keys.random()
//    val genres: List<String>? = genreMapV2[film]
    val genres: List<String> = genreMapV2[film] !!
    println("Der Film '$film' hat die genres: $genres")

    val addressBuch: Map<String, Map<String,String?>> = mapOf(
        "Mary" to mapOf("Tel" to "08876756", "Email" to null, "Handy" to "08785645123"),
        "David" to mapOf("Tel" to null)
    )
    // Filter Not Null für Maps
    addressBuch["Mary"]?.filter { it.value != null }


    // Die gesamte Map ausdrucken?
    genreMap.forEach{ it ->
        println("${it.key} (${it.value})")
    }
    println("----")
    genreMap.forEach{ (film, genre) ->
        println("$film ($genre)")
    }

    val filmListe = genreMap.keys
    // Einen zufälligen Film auswählen:
    val zufallsFilm = genreMap.keys.random()
    val zufallsGenre = genreMap.values.random()

    // Das Genre des Films ausdrucken (= Wert aus Map auslesen)
//    val genre: String? = genreMap[zufallsFilm]
//    val genre: String = genreMap[zufallsFilm] ?: "k.A."
    val genre: String = genreMap[zufallsFilm]!!

    println("Dein zufälliger Film ist $zufallsFilm (Genre: ${genre.uppercase()})")

    // Neuen Wert in Map einspeichern
    genreMap["Interstellar"] = "Drama"

    // Wert in Map verändern
    genreMap["Inception"] = "Action"

    // Einen Film aus Map auswählen?


    // Map filtern:
    val animationsFilme = genreMap.filter { (film, genre) -> genre == "Animation"}


}





/*
 val artikelListe = listOf("Mars", "Twix")
    val preisListe = listOf(1.5, 2.0)
    val angebote = artikelListe.zip(preisListe)
    println(angebote)
 */