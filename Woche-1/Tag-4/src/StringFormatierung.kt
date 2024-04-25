fun main(){


    // String Formatierungsfunktion und Format templates
    var formatString: String = "Produkt %s, Preis %.2f€"
    println(formatString.format("Mars", 1.99))
    println(formatString.format("Twix", 1.5))



    // Ziel: die Zahl runden (auf gewisse Kommastellen)
    var kontostand = 1326.56576879908
    // Alt:
    println("Ihr aktuelles Guthaben: $kontostand €")
    // %.2f   -> kommazahl mit 2 nachkommastellen
    println("Ihr aktuelles Guthaben: %.2f €".format(kontostand))

    // Den eigentlichen Kontostand runden?
        // zuerst mit Hilfe von String runden, dann Komma gegen Punkt tauschen, dann zurück zu Double
    kontostand = "%.2f".format(kontostand).replace(",",".").toDouble()
    println("Gerundeter Kontostand: $kontostand")

    println("--------")



    val template: String = "Ihr aktuelles Guthaben: %,.2f €"

    var kontoStandGordon = 99999.99
    var kontoStandMarianne = -128.0
    var kontoStandFelix = 812371216.81637

    println("Ihr aktuelles Guthaben: $kontoStandGordon")
    println("Ihr aktuelles Guthaben: %,.2f €".format(kontoStandGordon))
    println(template.format(kontoStandMarianne))
    println(template.format(kontoStandFelix))


    // eine Zahl runden via format
//    println("Geben sie eine Kommazahl ein:")
    var kommaZahl = 123.123
    val zwischenErgebnis: String = "%.2f".format(kommaZahl)
    kommaZahl = zwischenErgebnis.replace(",",".").toDouble()


    var kommaZahlString = kommaZahl.toString().replace(".",",")
    println("Kommazahl: $kommaZahlString")




}