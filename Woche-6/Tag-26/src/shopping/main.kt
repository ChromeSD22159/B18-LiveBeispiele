package shopping

fun main(){

    val essen: List<Gericht> = listOf(
        Gericht("Schnitzel mit Pommes", 9.99, false),
        Gericht("Döner mit Soße", 4.0,  false),
        Gericht("Spagetti Carbonara", 12.99, false, "Eine Sahnesoße mit Schinken"),
        Gericht("Vegane Lasagne", 11.50, true)
    )

    val meinLieblingsGetraenk = Getraenk("Bier", 0.0, false)
    meinLieblingsGetraenk.istAlk

    val pizzaria = Store("Luigi's Pizza", "Luigi")
    pizzaria.speisekarte.add(Getraenk("Cola", 2.0, false))
    pizzaria.speisekarte.add(Getraenk("Bier", 2.5, true))
    pizzaria.speisekarte.add(Gericht("Pizza Salame", 8.5, false))
    pizzaria.speisekarte.add(Gericht("Pizza Margarita", 8.5, true))

    // Produkte nach Preis sortiert
    pizzaria.speisekarte.sortBy { produkt ->  produkt.preis }

    // Produkte nach Sorte sortiert
    pizzaria.speisekarte.sortBy { it::class.simpleName }
    println("----")
    println("Speisekarte nach Sorte sortiert:")
    println(pizzaria.speisekarte)
    pizzaria.speiseKarteAusdrucken()

    val pizzaria2 = Store("Mario's Pizza", "Mario")
    pizzaria2.speisekarte.addAll(pizzaria.speisekarte)
    pizzaria2.speisekarte.add(Gericht("Pizza Tonno", 8.5, false))


    // Nur Gerichte ansehen
    val nurGerichte = pizzaria.speisekarte.filterIsInstance<Gericht>()

    // Nur vegetarische Gerichte
    val nurVegi = nurGerichte.filter {it.istVegi}


    val doenerLaden = Store("Omar's Kebab", "Ahmed")
    doenerLaden.speisekarte.add(Getraenk("Cola", 2.0, false))
    doenerLaden.speisekarte.add(Getraenk("Fanta", 2.0, false))
    doenerLaden.speisekarte.add(Gericht("Döner mit Soße", 4.0, false))
    doenerLaden.speisekarte.add(Gericht("Dönerbox", 5.0, false))

    pizzaria.speisekarte.sortBy { it.name }




}