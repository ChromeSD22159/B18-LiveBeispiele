
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.Period


fun main() {
    // heutiges Datum
    println("---Heutiges Datum---")
    var today: LocalDate = LocalDate.now()
    println(today)


    // heutiges Datum mit Uhrzeit
    println("---Heutiges Datum mit genauer Uhrzeit---")
    var todayWithTime: LocalDateTime = LocalDateTime.now()
    println(todayWithTime)


    println("---In Variable gespeicherter Geburtstag---")
    // Datum in einer Variable speichern
    val birthday: LocalDate = LocalDate.of(1999,11,1)
    val birthday2: LocalDateTime = LocalDateTime.of(1999,11,1, 12, 30)
    println(birthday)


    println("---Geburtsdatum selber eingeben, als LocalDate speichern ---")
    println("Tag:")
    val day: Int = readln().toInt()
    println("Monat:")
    val month: Int = readln().toInt()
    println("Jahr:")
    val year: Int = readln().toInt()

//    val datum: List<String> = readln().split(".")
//    datum[0].toInt()  // Tag
//    datum[1].toInt()  // Monat
//    datum[2].toInt()  // Jahr

    val newBirthday: LocalDate = LocalDate.of(year,month,day)
    println("NewBirthday: $newBirthday")



    println("---Eingegebenes Geburtsdatum volljährig?---")
    // checken, ob newBirthday über 18 Jahre her ist
    var todayMinus18 = today.minusYears(18).plusDays(1)

    if (newBirthday.isBefore(todayMinus18)) {
        println("ist volljährig")
    } else {
        println("ist unter 18")
    }

    // Alter ausrechnen:
    val age = Period.between(newBirthday, LocalDate.now())
    println("Mit dem eingegebenen Alter ist man: ${age.years} Jahre alt")

    // check, ob über 18?
    age.years > 18


    // Formatierung
    println("--Vor dem Formatieren--")
    println(today)


    println("--Nach dem Formatieren:--")
    val formatMonatAlsZahl: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val formattedDateZahl = today.format(formatMonatAlsZahl)
    println(formattedDateZahl)


    // ohne variable, mit monat als text format:
    val formattedDateText: String = today.format(DateTimeFormatter.ofPattern("dd.MMM.yyyy"))
    println(formattedDateText)


}