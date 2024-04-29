
fun main(){
    // Ein Paar erstellen
    val ehePaar: Pair<String, String> = "Brad Pitt" to "Jennifer Anniston"  // Variante A
    val ehePaar2: Pair<String, String> = Pair("Brad Pitt", "Angie Jolie")   // Variante B
    var productMitPreis: Pair<String, Double> = Pair("Apfel", 0.44)

    val productSortiment: List<Pair<String, Double>> = listOf(
        Pair("Apfel", 0.44),
        Pair("Banane", 0.5),
        "Zitrone" to 0.3
    )

    val produktMitPreisUndAnzahl: Triple<String, Double, Int> = Triple("Twix", 1.99, 24)

    // erster Wert:
    ehePaar.first

    // zweiter Wert:
    ehePaar.second

    // Liste aus Pairs
    var productKatalog: MutableList<Pair<String, Double>> = mutableListOf(
        "Twix" to 1.50,
        "Mars" to 1.50,
        "Coca Cola 0.33l" to 2.5
    )

    productKatalog.add(Pair("Nestea 0.33", 2.99))

    val erstesProduct = productKatalog[0]
    val nameProduct = erstesProduct.first
    val preisProduct = erstesProduct.second
    println("$nameProduct: $preisProduct")

    // Für 3 Werte: Triple
    var triple: Triple<String, Int, Double>  = Triple("Apfel", 4, 0.44)


}