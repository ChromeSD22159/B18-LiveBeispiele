package wiederholunggestern.aufgabe6

fun main() {
    var form = Form("Rot")
    var rechteck = Rechteck("Gelb", 5, 6)
    var kreis = Kreis("Blau", 4)


    form.info()
    rechteck.info()
    println(rechteck.umfang())
    println(rechteck.flaeche())
    kreis.info()
    println(kreis.umfang())
    println(kreis.flaeche())
}