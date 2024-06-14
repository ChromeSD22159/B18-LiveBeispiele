import store.*

val sortiment = mutableListOf<Produkt>()


fun main(){


    sortiment.add(Equipment("Yoga Matte", 40.0, true))
    sortiment.add(Equipment("Yoga Kissen", 25.0, false, true))
    sortiment.add(Equipment("Kopfmassagespinne", 5.0, false))

    sortiment.add(Tee("Bio Kräutertee", 4.44, "Österreich", 200))
    sortiment.add(Tee("Yogi Glückstee", 3.5, "Deutschland", 340))
    sortiment.add(Tee("Oolongtee", 5.25, "Taiwan", 200))
    sortiment.add(Tee("Grüntee classic", 5.25, "China", 200))
    sortiment.add(Tee("Grüntee Jasmin", 5.25, "China", 200))


    startMenu()
}

fun startMenu(){
    println("""
        
        Wählen sie:
            1 für Registration
            2 für Einloggen
            3 für Beenden
    """.trimIndent())
    when (readln().toIntOrNull()){
        1 -> println("...registrierung...")
        2 -> kundenmenu()
        3 -> System.exit(0)
        else -> startMenu()
    }
}

fun kundenmenu(){
    println("""
        Wählen sie:
            1 für Produkte sehen
            2 für Warenkorb verändern
            3 für Profil bearbeiten
            4 für ausloggen
    """.trimIndent())

    when (readln()){
        "1", "a", "A" -> {
            produkteAnsehen()
        }
        "2" -> println("...produkte")
        "3" -> {
            println("profil bearbeiten...")
            kundenmenu()
        }
        "4" -> startMenu()
        else -> kundenmenu()
    }
}

fun ausloggen(){
    println("Sie sind erfolgreich ausgeloggt")
    startMenu()
}

fun produkteAnsehen(){
    sortiment.forEachIndexed{ i, produkt ->
        println("${i+1} für $produkt")
    }

    var kundenEingabe = readln().toInt() - 1
    var gewaehltesProdukt = sortiment[kundenEingabe]

    println("Sie haben ${gewaehltesProdukt.name} zum Warenkorb hinzugefügt")


    kundenmenu()
}