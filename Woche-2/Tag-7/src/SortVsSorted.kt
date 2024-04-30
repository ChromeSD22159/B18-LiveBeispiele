fun main(){

    var products: MutableList<String> = mutableListOf(
        "Mars",
        "Twix",
        "Bounty",
        "Haribo Goldbären",
        "Haribo Ballaballa",
        "Milka Vollmilch",
        "Milka Erdbeere"
    )
    val prices: MutableList<Double> = mutableListOf(
        1.0,
        1.0,
        1.0,
        2.0,
        2.0,
        2.5,
        2.5
    )

    products.sort()         // sortieren
    val sortedProducts: List<String> = products.sorted()       // sortiert     // gibt eine sortierte Kopie wieder

    products.sortDescending()       // absteigend sortieren
    products.sortedDescending()       // absteigend sortiert


    val index1 = products.indexOf("Mars")
    val index2 = products.indexOfFirst { it.contains("Haribo") }

    products.shuffle()      // mischen
    val shuffledProducts: List<String> = products.shuffled()     // gemischt

    products.reverse()      // umkehren
    products.reversed()     // umgekehrt

}