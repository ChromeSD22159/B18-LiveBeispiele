package bank

class Konto (
    // "Mindestanforderungen"
    val inhaber: String,
    var betrag: Double = 0.0
)
{

    var PIN: String
    var hatKreditkarte: Boolean = false

        // init = Code der beim Instanziieren ausgeführt
        // init gehört zu den Konstruktoren

    init {
        println("Neues Konto für $inhaber angelegt.")
        println("Wählen Sie Ihre PIN:")
        PIN = readln()
    }

    // "Zusatz features"
    constructor(inhaber: String, kreditkarte: Boolean): this(inhaber){
        hatKreditkarte = kreditkarte
    }

    constructor(inhaber: String, betrag: Double, kreditkarte: Boolean): this(inhaber, betrag){
        hatKreditkarte = kreditkarte
    }

    fun pinAendern(){
        println("Geben Sie Ihre alte PIN ein: ")
        val oldPIN = readln()

        if (oldPIN == PIN){
            println("Authentifizierung erfolgreich.")
            println("")
            println("Geben Sie Ihre neue PIN ein:")
            val neuePIN = readln()
        } else {
            println("Authentifizierung fehlgeschlagen")
            println("Vorgang abgebrochen")
        }
    }


}