package dateien.autos
import java.io.File

val SAVE_PFAD = "Woche-8/Tag-36/Fahrzeuge.csv"

fun main() {
    var fahrzeugListe: List<Fahrzeug> = listOf(
        Auto("Model S", 79999.99, Marke.TESLA, 5),
        Auto("3er", 35000.00, Marke.BMW, 5),
        Auto("Civic", 25000.00, Marke.HONDA, 5),
        Motorrad("R1200", 15000.00, Marke.BMW, false),
        Motorrad("Goldwing", 30000.00, Marke.HONDA, true)
    ).shuffled()


    save(SAVE_PFAD, fahrzeugListe)

}


fun save(pfad: String, fahrzeugListe: List<Fahrzeug>){
    val saveDatei = File(pfad)
    saveDatei.writeText("Modell,Preis,Marke,Typ,Spezial\n")

    for (fahrzeug in fahrzeugListe) {
        saveDatei.appendText(fahrzeug.save() + "\n")
    }
}
