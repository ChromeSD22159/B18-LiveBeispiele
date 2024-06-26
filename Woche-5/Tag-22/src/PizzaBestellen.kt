val pizzaMenu: Map<String, Double> = mapOf(
    "Hawaii" to 14.99,
    "Margarita" to 12.99,
    "Salami" to 13.99,
    "Tonno" to 15.99,
    "Prosciutto" to 13.99,
    "Ale Verdure" to 14.50,
    "Pepperoni" to 14.99
)

fun main(){

    println("Das Menu der Pizzeria:")
    for ((pizza, preis) in pizzaMenu){
        println("Pizza ${pizza} kostet ${preis} €")
    }

    println("--------------")


    // Eine Pizza bestellen
    val zufallsPizza: String = pizzaMenu.keys.random()
    val preisDavon: Double = pizzaMenu[zufallsPizza]!!

    // -------------

    val bestellung: MutableList<String> = mutableListOf()
    // Variante 1: Repeat
    repeat(100){ it ->  //iteration == wiederholung
        val zufallsPizza = pizzaMenu.keys.random()
        bestellung.add(zufallsPizza)
        println("Die ${it+1}. Pizza ist $zufallsPizza")
    }

    println(bestellung.size)
    bestellung.clear()

    // Variante 2:  While
    var i = 1
    while (bestellung.size < 100){
        var zufallsPizza = pizzaMenu.keys.random()
        bestellung.add(zufallsPizza)
        println("Die $i. Pizza ist $zufallsPizza")
        i++
    }


    // Pizzen bis Bestelllimit
    val bestellLimit = 500.0
    var gesamtPreis = 0.0
    bestellung.clear()
    do{
        val zufallsPizza = pizzaMenu.keys.random()
        val preis = pizzaMenu[zufallsPizza]!!
        bestellung.add(zufallsPizza)
        gesamtPreis += preis
    } while (gesamtPreis < bestellLimit - pizzaMenu.values.max())


    println("--------------")   // Alles hier drunter ist bereits mit for-Schleifen
    println("Das Menu der Pizzaria")
    for ((pizza, preis) in pizzaMenu){
        println("Pizza $pizza kostet $preis €")
    }

    println("--------------")   // Alles hier drunter ist bereits mit for-Schleifen


    // Die Pizzen der Reihe nach ausdrucken:
    gesamtPreis = 0.0
    for (pizza in bestellung){
        val preisFürPizza = pizzaMenu[pizza]!!
        gesamtPreis += preisFürPizza
        println("Pizza $pizza kostet $preisFürPizza€")
    }

    println("Gesamtpreis: $gesamtPreis")


    // Wieviele Salami Pizzen haben wir bestellt?
    var zaehler = 0
    for (pizza in bestellung){
        if (pizza == "Salami")
            zaehler++
    }
    println("Wir haben $zaehler Salami Pizzen bestellt.")


    // Wieviele von allen Pizzen haben wir bestellt
    for (pizzaSorte in pizzaMenu.keys){
        var zaehler = 0
        for (pizza in bestellung){
            if (pizza == pizzaSorte)
                zaehler++
        }
        println("Wir haben $zaehler $pizzaSorte Pizzen bestellt.")
    }
}