package dateien.autos

import java.io.File

fun main(){
    val fahrzeuge = loadFahrzeuge(SAVE_PFAD)

    for (fahrzeug in fahrzeuge){
        println(fahrzeug)
    }
}

fun loadFahrzeuge(saveDatei: String): MutableList<Fahrzeug> {
    val file = File(saveDatei)
    val fahrzeugListe: MutableList<Fahrzeug> = mutableListOf()

    val alleZeilen: List<String> = file.readLines()
    for ((index, zeile) in alleZeilen.withIndex()) {
        if (index == 0) continue  // Skip header


        val daten: List<String> = zeile.split(",")
        val modell = daten[0]
        val preis = daten[1].toDouble()
        val marke = Marke.valueOf(daten[2])
        val typ = daten[3]

        when (typ) {
            "Auto" -> {
                val anzahlSitze = daten[4].toInt()
                fahrzeugListe.add(Auto(modell, preis, marke, anzahlSitze))
            }
            "Motorrad" -> {
                val hatBeiwagen = daten[4].toBoolean()
                fahrzeugListe.add(Motorrad(modell, preis, marke, hatBeiwagen))
            }
            else -> {
                fahrzeugListe.add(Fahrzeug(modell, preis, marke))
            }
        }
    }
    return fahrzeugListe
}