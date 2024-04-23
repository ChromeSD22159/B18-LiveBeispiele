fun main() {
    /*
        Dieses kleine Programm simuliert einen Registrierungsprozess:
            Zuerst fragt es nach einem Usernamen,
            dann nach einem Passwort;
            als Letztes wird eine Bestätigung ausgedruckt.
     */
    var appName = "Twitter"
    appName = "X"

    val tageInJuni: Int = 30
    println("Der Juni hat $tageInJuni Tage")

    // Username abfragen
    println("Username: (bestätigen mit Enter)")
    val username = readln()

    // Passwort abfragen
    println("Password: ")
    val passwort = readln()

    // Bestätigung
    println("Ihr neuer Account wurde erstellt mit den folgenden Daten: ")
    println(" Username: $username \n Passwort: $passwort")

}


