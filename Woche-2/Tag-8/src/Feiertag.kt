// Diese Klasse (aka dieser Datentyp) repräsentiert ein Datum
import java.time.LocalDate

fun main(){

    // Batch 18 Start und Enddatum
    val modulStartBatch18: LocalDate = LocalDate.of(2024,4,22)
    val modulEndeBatch18: LocalDate = LocalDate.of(2024,6,21)

    // Alle Feiertage in Berlin im Jahr 2024
    val feiertage2024Berlin: Map<LocalDate, String> = mapOf(
        LocalDate.of(2024,1,1) to "Neujahr",
        LocalDate.of(2024,3,8) to "Weltfrauentag",
        LocalDate.of(2024,3,29) to "Karfreitag",
        LocalDate.of(2024,4,1) to "Ostermontag",
        LocalDate.of(2024,5,1) to "Tag der Arbeit",
        LocalDate.of(2024,5,9) to "Christi Himmelfahrt",
        LocalDate.of(2024,5,20) to "Pfingstmontag",
        LocalDate.of(2024,10,3) to "Tag der Deutschen Einheit",
        LocalDate.of(2024,12,25) to "1. Weihnachtsfeiertag",
        LocalDate.of(2024,12,26) to "2. Weihnachtsfeiertag",
    )

    // Feiertage im Grundlagen Modul für Batch 18
    val kursFeiertage: List<LocalDate> = feiertage2024Berlin.filter { (datum, name) ->
        datum.isAfter(modulStartBatch18) && datum.isBefore(modulEndeBatch18)
    }.keys.toList()

    // Ferientage im Grundlagen Modul, Batch 18
    val ferientageBatch18: List<LocalDate> = listOf(
        LocalDate.of(2024,5,10),
        LocalDate.of(2024,5,21),
    )

    // Druckt die gefilterten Feiertage aus
    println("Alle kursfreien Tage im Grundlagen Modul:")
    val alleFreienTage = (ferientageBatch18 + kursFeiertage).sorted()
    for (datum in alleFreienTage){
        if (datum in feiertage2024Berlin) {
            val name = feiertage2024Berlin[datum]
            println("\t${datum.deutschesFormat()}\t- $name")
        } else {
            println("\t${datum.deutschesFormat()}")
        }
    }
}

fun LocalDate.deutschesFormat(): String {
    return "${this.dayOfMonth}.${this.monthValue}.${this.year}"
}