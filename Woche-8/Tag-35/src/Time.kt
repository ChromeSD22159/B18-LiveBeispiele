import java.time.Duration
import java.time.LocalTime
import java.time.format.DateTimeFormatter


fun main() {

    // aktueller Zeitpunkt: now
    val aktuelleZeit: LocalTime = LocalTime.now()


    // Zeitpunkte definieren
    // konkrete Zeitpunkte:
    var mittagsPauseStart: LocalTime =  LocalTime.of(12,0)
    var mittagsPauseEnde: LocalTime = LocalTime.of(13,0,0)
    val feierabend = LocalTime.of(17, 0)

    // Zeitpunkt ausdrucken
    println("Aktuelle Uhrzeit: $aktuelleZeit")
    println("Die Mittagspause ist von ${mittagsPauseStart} bis ${mittagsPauseEnde}")

    // Zeit relativ zu einem anderen Zeitpunkt
    // zB jetzt + 5 minuten
    val endZeit: LocalTime = LocalTime.now().plusMinutes(5)
    println("In 5 Minuten ist es: $endZeit")

    // Datum nach Wunsch formatieren: *DateTimeFormatter*
    val formatter = DateTimeFormatter.ofPattern("HH-mm")
    println("In 5 Minuten ist es: ${endZeit.format(formatter)}")

    print("-----")
    readln()
    // Zeitspannen programmiert man mit der Klasse *Duration*
    var mittagsPauseDauer: Duration = Duration.between(mittagsPauseStart,mittagsPauseEnde)
    println("Dauer der Mittagspause: $mittagsPauseDauer")

    println("Die Mittagspause dauert: ${mittagsPauseDauer.toMinutes()} Minuten")

    val dauerBisFeierabend: Duration = Duration.between(LocalTime.now(), feierabend)
    println("Bis Feierabend sind es noch ${dauerBisFeierabend.toHours()} h und ${dauerBisFeierabend.toMinutes() % 60} min.")
    // Besser: die Stunden und übrigen Minuten ausrechnen
    var dauerMin = dauerBisFeierabend.seconds / 60
    val dauerH = dauerMin / 60  // oder: dauerBisFeierabend.toHours()
    dauerMin %= 60
    println("Bis Feierabend sind es noch $dauerH h und $dauerMin min.")
}
