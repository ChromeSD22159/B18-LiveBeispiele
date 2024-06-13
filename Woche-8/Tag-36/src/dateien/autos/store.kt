package dateien.autos

fun main(){

    var fahrzeugListe: MutableList<Fahrzeug> = mutableListOf()

    while(true){
        println("\n--------------\n")
        println("""
            Was möchten Sie tun? 
             1 -> laden
             2 -> speichern
             3 -> Fahrzeuge anzeigen
             4 -> Fahrzeug hinzufügen
             5 -> Programm beenden
             """.trimIndent())


        when(readln().toIntOrNull()){
            1 -> {  // Laden
                println("Bitte geben Sie den Dateipfad ein:")
                val dateipfad = readln()

                try {
                    val geladeneFahrzeuge = loadFahrzeuge(dateipfad)
                    fahrzeugListe.clear()
                    fahrzeugListe.addAll(geladeneFahrzeuge)
                    println("Fahrzeuge geladen.")
                } catch (e: Exception){
                    println("Datei wurde nicht gefunden.")
                }
            }
            2 -> { // Speichern
                println("Bitte geben Sie den Dateipfad ein:")
                val dateipfad = readln()
                try {
                    save(dateipfad, fahrzeugListe)
                    println("Fahrzeuge gespeichert.")
                } catch (e: Exception){
                    println("Fehler beim Speichern der Fahrzeuge.")
                }
            }
            3 -> { // Aktuelle Liste anzeigen
                if (fahrzeugListe.isEmpty()) {
                    println("Keine Fahrzeuge geladen.")
                } else {
                    for (fahrzeug in fahrzeugListe) {
                        println(fahrzeug)
                    }
                }
            }
            4 -> {  // Fahrzeug hinzufügen
                println("Welches Fahrzeug möchten Sie hinzufügen? (Auto/Motorrad)")
                val typ = readln()

                println("Modell:")
                val modell = readln()
                println("Preis:")
                val preis = readln().toDouble()
                println("Marke (BMW/AUDI/MERCEDES/TOYOTA/HONDA/TESLA):")
                val marke = Marke.valueOf(readln().uppercase())

                when (typ.lowercase()) {
                    "auto" -> {
                        println("Anzahl Sitze:")
                        val anzahlSitze = readln().toInt()
                        fahrzeugListe.add(Auto(modell, preis, marke, anzahlSitze))
                    }
                    "motorrad" -> {
                        println("Hat Beiwagen? (true/false):")
                        val hatBeiwagen = readln().toBoolean()
                        fahrzeugListe.add(Motorrad(modell, preis, marke, hatBeiwagen))
                    }
                    else -> {
                        println("Unbekannter Fahrzeugtyp.\n Kein ")
                    }
                }
                println("Fahrzeug hinzugefügt.")
            }
            5 -> {  // beenden
                println("Programm beendet")
                break
            }
            else -> {
                Thread.sleep(10)
                println("\n\n")
            }
        }
    }


}