import java.time.LocalDate

enum class Color(val code: String) {
    RED( "\u001B[31m"),
    GREEN( "\u001B[32m"),
    WHITE("\u001B[37m"),
    RESET( "\u001B[0m")
}

fun main(){
    val currentDate: LocalDate = LocalDate.now()

    // Batch 18 Start und Enddatum
    val modulStartBatch18: LocalDate = LocalDate.of(2024,2,26)
    val modulEndeBatch18: LocalDate = LocalDate.of(2025,2,27)

    // Alle Feiertage in Berlin im Jahr 2024
    val feiertage2024Berlin: Map<LocalDate, String> = mapOf(
        LocalDate.of(2024, 1, 1) to "🎉 Neujahr",
        LocalDate.of(2024, 3, 8) to "💃 Weltfrauentag",
        LocalDate.of(2024, 3, 29) to "✝️ Karfreitag",
        LocalDate.of(2024, 4, 1) to "🐰 Ostermontag",
        LocalDate.of(2024, 5, 1) to "🛠️ Tag der Arbeit",
        LocalDate.of(2024, 5, 9) to "🌤️ Christi Himmelfahrt",
        LocalDate.of(2024, 5, 20) to "🌊 Pfingstmontag",
        LocalDate.of(2024, 10, 3) to "🇩🇪 Tag der Deutschen Einheit",
        LocalDate.of(2024, 12, 25) to "🎄 1. Weihnachtsfeiertag",
        LocalDate.of(2024, 12, 26) to "🎄 2. Weihnachtsfeiertag",
        LocalDate.of(2025, 1, 1) to "🎉 Neujahr",
    )

    // Feiertage im Grundlagen Modul für Batch 18
    val kursFeiertage: List<LocalDate> = feiertage2024Berlin.filter { (datum, name) ->
        datum.isAfter(modulStartBatch18) && datum.isBefore(modulEndeBatch18)
    }.keys.toList()

    // Ferientage im Grundlagen Modul, Batch 18
    val ferientageBatch18: List<LocalDate> = listOf(
        LocalDate.of(2024,4,2),
        LocalDate.of(2024,4,3),
        LocalDate.of(2024,4,4),
        LocalDate.of(2024,4,5),
        LocalDate.of(2024,5,10),
        LocalDate.of(2024,5,21),
        LocalDate.of(2024,7,29),
        LocalDate.of(2024,7,30),
        LocalDate.of(2024,7,31),
        LocalDate.of(2024,8,1),
        LocalDate.of(2024,8,2),
        LocalDate.of(2024,10,4),
        LocalDate.of(2024,10,21),
        LocalDate.of(2024,10,22),
        LocalDate.of(2024,10,23),
        LocalDate.of(2024,10,24),
        LocalDate.of(2024,10,25),
        LocalDate.of(2024,12,23),
        LocalDate.of(2024,12,24),
        LocalDate.of(2024,12,27),
        LocalDate.of(2024,12,30),
        LocalDate.of(2024,12,31),
        LocalDate.of(2025,1,2),
        LocalDate.of(2025,1,3),
    )

    // Druckt die gefilterten Feiertage aus
    println("Alle kursfreien Tage im Grundlagen Modul:")
    val alleFreienTage = (ferientageBatch18 + kursFeiertage).sorted()
    for (datum in alleFreienTage){
        var col: String
        var icon: String

        if(datum == currentDate) {
            col = Color.WHITE.code
            icon = "✅"
        } else if (currentDate < datum) {
            col = Color.GREEN.code
            icon = "✅"
        } else {
            col = Color.RED.code
            icon = "☑\uFE0F"
        }

        if (datum in feiertage2024Berlin) {
            val name = feiertage2024Berlin[datum]
            println("\t${col} ${icon} ${datum.deutschesFormatFixed()}\t- $name${Color.RESET.code}")
        } else {
            println("\t${col} ${icon} ${datum.deutschesFormatFixed()}\t- \uD83C\uDF34 FerienTag${Color.RESET.code}")
        }
    }
}

fun LocalDate.deutschesFormat(): String {
    return "${this.dayOfMonth}.${this.monthValue}.${this.year}"
}

fun LocalDate.deutschesFormatFixed(): String {
    val day = String.format("%02d", this.dayOfMonth)
    val month = String.format("%02d", this.monthValue)
    return "$day.$month.${this.year}"
}