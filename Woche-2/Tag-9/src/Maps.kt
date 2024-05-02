
fun main(){
    var cocaColaPreis = 1.5
    val automat: MutableMap<String, Double> = mutableMapOf(
        "Snickers" to cocaColaPreis,
        "Mars" to cocaColaPreis,
        "Twix" to cocaColaPreis,
        "Milky Way" to 1.00,
        "Kitkat" to 1.00,
        "Haribo Goldbären" to 2.00,
        "Haribo Balla Balla" to 2.00
    )

    val automat2: Map<Int, Pair<String, Double>> = mapOf(
        11 to Pair("Snickers", 1.5),
        12 to Pair("Milky Way", 2.0),
        13 to Pair("Milky Way", 2.0)
    )



    val addressBuchV1: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Meik" to mutableListOf(),
        "David" to mutableListOf("09017832617", "david@bethelem.com")
    )

    addressBuchV1["David"]?.get(0)

    if (addressBuchV1.contains("David")){
        val telNr = addressBuchV1["David"]!![0]

    }
    addressBuchV1["David"] = mutableListOf()

    // Name -> Tel, Email, Addrese
    val addressBuchV3: Map<String, Triple<String?, String?, String?>> = mapOf(
        "Safa" to Triple("00876756454", "safa@cool.de", null),
        "Mary" to Triple(null, "mary@cool.de", "Testweg 123"),
    )
    val telNr = addressBuchV3["Test"]?.first


//    val haustiere: Map<String, List<Tier>>

    // Günstigste Produkt finden:
    val minPreis = automat.values.min()

    // Variante 1: .indexOf         -> Nachteil: findet nur 1 günstigstes Produkt
    val indexVonMinPreis = automat.values.indexOf(minPreis)
    val guenstigstesProdukt = automat.keys.elementAt(indexVonMinPreis)
    println("Das günstigste Produkt ist $guenstigstesProdukt ($minPreis€")

    // Variante 2:
    val guenstigsteProdukte = automat.filter { it.value == minPreis}.keys
    println(guenstigsteProdukte)

    // ----------------------
    val obstLaden: MutableMap<Int, String> = mutableMapOf(
        1 to "Apfel",
        2 to "Banane",
        3 to "Tomate",
        4 to "Kartoffel"
    )

    println(obstLaden)

    obstLaden[4] = "Süßkartoffel"               // überschreibt altes Paar
    obstLaden[obstLaden.size + 1] = "Karotte"       // fügt neues Paar ein

    println("---")
    println(obstLaden)


    val alleObst: List<String> = obstLaden.values.toList()
    val index = alleObst.indexOf("Tomate")
    val schluessel = obstLaden.keys.elementAt(index)

    // Ändert das die Preise in der Map?
    cocaColaPreis = 2.0

    // Werte in der Map abfragen:
    var twixPreis: Double? = automat["Twix"]        // Werteabfragen in Maps sind potenziell null

    println(
        "Twix kostet ${twixPreis ?: "? €"} \n" +
        "Snickers kostet ${automat["Snickers"]} €" + "\n" +
        "2 Snickers kosten ${2 * automat["Snickers"]!!} €" + // Null-Safety Operator nötig
        "Tequila kostet ${automat["Tequila"]} €" + "\n"
    )

    // Preis von Artikel anpassen
    automat["Kitkat"]  = 1.5

    // neuen Artikel hinzufügen
    automat["Chio Chips"] = 2.0

    println("Automat: $automat")


    // Paare löschen aus Maps
    val ergebnis1: Double? = automat.remove("Twix")
    val ergebnis2: Boolean = automat.remove("Mars", 1.5)



    // Schlüssel sollten einzigartig sein
    val falscherAutomat = mutableMapOf<Double, String>(
        1.5 to "Snickers",
        1.5 to "Mars",
        1.0 to "Kitkat"
    )
    falscherAutomat[1.0] = "Milky Way"
    println("Falscher Automat: $falscherAutomat")

    var productKatalog: Map<Int, Pair<String, Double>>

    var addressBuch: Map<String, List<String>> = mutableMapOf(
        "Okan" to listOf("0123-4567890"),
        "Max" to listOf("0111-22334455", "Teststr 2"),
        "Gordon" to listOf("0987-6543210", "test@test.de"),
        "Anna Müller (fussball)" to listOf(),
        "Anna Müller (arbeit)" to listOf("9632741231")
    )


    val freund1 = "Michi"
    val freund2 = "Nick"

    var addressBuchV2: Map<String, Map<String, String>> = mutableMapOf(
        "Timo" to mutableMapOf("Tel" to "02387423434", "Email" to "hfjdshfajh@shj.de"),
        "Sandra" to mutableMapOf(),
        "Spiderman" to mutableMapOf("Adresse" to "NY C..."),
        freund1 to mutableMapOf("Tel" to "191231234")
    )


    val userNames = addressBuch.keys

    var filmGenresV1 = mapOf(
        "Inception" to "Drama",
        "The Ring" to "Horror",
        "The Ring 2" to "Horror"
    )

    var filmGenresV2 = mapOf(
        "Drama" to listOf("Inception"),
//        "Blockbuster" to listOf("Drama", "Horror"),
        "Horror" to listOf("The Ring", "The Ring 2"),
        "Comedy" to listOf("Inception", "Rush Hour")
    )

    // Zufälliger Film aus genre
    val genre = "Horror"

    // V1: ?: Elvis Operator
    var horrorFilmeV1: List<String> = filmGenresV2[genre] ?: listOf()
    println(horrorFilmeV1)
    println(horrorFilmeV1.random())

    // V2: !!   Not-null assertion
    var horrorFilmeV2: List<String> = filmGenresV2[genre]!!
    println(horrorFilmeV2.random())

    // V3: ?.   Safe Calls
    var horrorFilmeV3: List<String>? = filmGenresV2[genre]
    println(horrorFilmeV3?.random())
}