package bonus

import kotlin.random.Random

/**
 *  Die heutige Bonusaufgabe simuliert ein Auto-Rennen.
 *  Es sind zwei Autos gegeben.
 *  Die Autos haben gewisse Eigenschaften.
 *
 *  Eure Aufgabe ist, die notwendigen Funktionen zu schreiben,
 *  sodass der Spielfluss in [game] richtig funktioniert.
 */
fun main(){

    game()
}

val car1: MutableMap<String, Int> = mutableMapOf(
    "Fortschritt" to 0,
    "MaxTank" to 50,
    "Tank" to 50,
    "Tempo" to 5,
    "Zeit" to 0
)

val car2: MutableMap<String, Int> = mutableMapOf(
    "Fortschritt" to 0,
    "MaxTank" to 65,
    "Tank" to 65,
    "Tempo" to 3,
    "Zeit" to 0
)

const val maxProgress = 20



fun game() {
    if (!raceOver()) {
        drive(car1, "Car1")
        drive(car2, "Car2")
        Thread.sleep(500)
        game()
    } else {
        declareWinner()
        Thread.sleep(5000)
    }

}

fun drive(car: MutableMap<String, Int>, name: String){
    if (car["Fortschritt"]!! < maxProgress) {
        val newFortschritt = car["Fortschritt"]!! + randomProgress(car["Tempo"]!!)
        val newTime = car["Zeit"]!! + 1
        val newTank = car["Tank"]!! - randomTankReduce(3, 7)

        car["Fortschritt"] = newFortschritt
        car["Zeit"] = newTime
        car["Tank"] = newTank

        println("- - -")
        println("$name:")
        println("Fortschritt: $newFortschritt")
        println("Zeit: $newTime")
        println("Tank: $newTank")
        println("- - -\n")
    }

    if (car["Tank"]!! <= 7) {
        pitStop(car)
        println("$name macht einen Boxenstopp...")
    }
}

fun randomProgress(max: Int): Int {
    return Random.nextInt(1,max)
}

fun randomTankReduce(from: Int, until: Int): Int {
    return Random.nextInt(from,until)
}

fun pitStop(car: MutableMap<String, Int>){
    car["Zeit"] = car["Zeit"]!! - 3
    car["Tank"] = car["MaxTank"]!!
}

fun raceOver(): Boolean {
    val raceState = car1["Fortschritt"]!! >= maxProgress && car2["Fortschritt"]!! >= maxProgress
    return raceState
}

fun declareWinner(){
    if (car1["Fortschritt"]!! >= maxProgress && car2["Fortschritt"]!! >= maxProgress) {
        if (car1["Zeit"]!! < car2["Zeit"]!!)
            println("Auto 1 hat gewonnen!")
        else if (car2["Zeit"]!! < car1["Zeit"]!!)
            println("Auto 2 hat gewonnen!")
        else
            println("Es ist ein Unentschieden!")
    }
}

