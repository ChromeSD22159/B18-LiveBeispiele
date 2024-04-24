fun main() {
    /*
        Ziel:
          auf Konsole einlesen:
            - wie viele Freunde kommen
            - wie viele Stücke pro Person

        ausrechnen:
            - wie viele Pizzen muss ich kaufen?
     */

    //Auf Konsole einlesen: Wie viele Freunde kommen?
    println("Wie viele Freunde kommen?")
    var freunde: Int = readln().toInt()
    println("Es kommen $freunde Freunde.")

    //Auf Konsole einlesen: Wie viele Stücke pro Person?
    println("Wie viel Stücke pro Person?")
    var stuecke: Int = readln().toInt()
    println("Jede Person isst $stuecke Stücke.")

    //Ausrechnen: Wie viele Pizzen muss ich kaufen?
    val stueckeProPizza: Int = 6
    var pizzaZahl: Int = stuecke * freunde / stueckeProPizza
    println("Wir brauchen $pizzaZahl Pizzen.")

    // Ausrechnen: Wie viele Stücke bleiben übrig?
    var restStuecke: Int = (pizzaZahl * stueckeProPizza) % (stuecke)
    println("Es bleiben dann $restStuecke Stücke übrig.")
}