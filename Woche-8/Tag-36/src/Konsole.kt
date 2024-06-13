import farben.rot
import farben.rotBack
import farben.reset

import farben.*

fun main(){

    val beispiel = """
        Das hier ist ${rot}rot${reset} mit ${rotBack}rotem Hintergrund${reset}. 
        Jetzt ist wieder alles normal."""

    println(beispiel)

    println(textInFarbe("Blablabla", blau))
    println("blablabla2".farbe(bold))


    val filme = listOf(
        Film("Harry Potter", 14.99, Genre.fantasy),
        Film("Herr der Ringe", 12.99, Genre.fantasy),
        Film("Inception", 14.99, Genre.drama),
        Film("TED", 9.99, Genre.comedy),
    )

    var ansicht: List<Film> = filme
    printProducts(ansicht)


    println("Unsere Fantasy Filme:")
    ansicht = filme.filter{it.genre == Genre.fantasy}
    printProducts(ansicht)

    ansicht = ansicht.sortedBy { it.preis }
    printProducts(ansicht)



    val spieler: Hero = Hero("Superman", 200, 20)
    val spieler2: Hero = Hero("Batman", 220, 22)
    val gegner: Hero = Hero("Dr. Chaos", 250, 16)

    spieler.attacke(gegner)
    spieler2.attacke(gegner)
    spieler2.attacke(gegner)
    gegner.attacke(spieler)

    printGameStatus(listOf(spieler, spieler2), listOf(gegner))
    
}


fun textInFarbe(text: String, farbe: String): String{
    return "$farbe$text$reset"
}

fun String.farbe(farbe: String): String{
    return "$farbe$this$reset"
}

fun printGameStatus(heroes: List<Hero>, gegner: List<Hero>){
    println("--------")
    println("So sieht es um dein Team aus:")
    for (hero in heroes) {
        hero.printStatus()
        Thread.sleep(500)
    }
    println("\nDas Gegnerteam")
    for (enemy in gegner) {
        enemy.printStatus()
        Thread.sleep(500)
    }

    println("--------")

}

fun printProducts(products: List<Film>){
    println("--------")
    for (film in products){
        film.printInfo()
        Thread.sleep(250)
    }
    println("--------")

}
