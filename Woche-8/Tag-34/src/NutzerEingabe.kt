
fun main(){
    val candy = mutableMapOf<String, Double> (
        "Mars" to 1.5,
        "Twix" to 1.5,
        "Lays" to 2.0,
        "Chio Chips" to 2.0,
        "Coca Cola" to 2.5,
        "Sprite" to 2.5,
        "Fanta" to 2.5
    )

    // Wir wollen ausdrucken, welche Eingabe für welches Produkt.
    candy.keys.forEachIndexed { i, name ->
        val preis = candy[name]
        println("Drücken sie ${i+1} für $name ($preis€)")
    }
    // (Andere Schleifen auch möglich)
//    for ((name, preis) in candy)
//    for (i in candy.keys.indices)
//    for (i in 0 until candy.size)

    // Nutzer wählt eines der Produkte
    val eingabe = readInt(1..candy.size) - 1         // -1, weil indices bei 0 Anfangen, nicht bei 1
    val produkt = candy.keys.elementAt(eingabe)
    val preis = candy[produkt]
    println("Sie haben sich für $produkt ($preis€) entschieden.")


    when (readln()){
        "1", "one", "eins", "a", "A" -> {}
        "2" -> {}
        else -> {//eingabeNeu...
        }
    }
}

//fun readInt(minZahl: Int, maxZahl: Int): Int{
fun readInt(erlaubteZahlen: IntRange): Int{
    /* Können wir alle Laufzeitfehler verhindern?
        - Leere Eingabe
        - Eingabe enthält nicht nur Zahlen?
        - Zahl zu groß für Int?      (größte mögliche Zahl ist 2147483647)
        - Eingabe nicht eine der Möglichkeiten?  (hier zB 1..7)
     */
    val eingabe: String = readln()

    if (eingabe.length == 0) {
        println(" Sie haben eine leere Eingabe gemacht, versuchen sie es nochmal")
        return readInt(erlaubteZahlen)
    }

    if (eingabe.any { !it.isDigit()}){
        println("Sie können nur ganze Zahlen eingeben, versuchen sie es nochmal")
        return readInt(erlaubteZahlen)
    }

    if (eingabe.length > 9){
        println(" Sie haben eine zu große Zahl eingegeben, versuchen sie es nochmal")
        return readInt(erlaubteZahlen)
    }

    val zahl = eingabe.toInt()

    if (zahl !in erlaubteZahlen){
        println(" Sie haben eine ungültige Zahl eingegeben, versuchen sie es nochmal")
        return readInt(erlaubteZahlen)
    }

    return zahl
}

fun readDouble(): Double{
    // Alle versch. Fehler Ursachen abzufangen dauert zu lange?
    // Einfach probieren, wenn ein Fehler auftaucht, dann kümmern wir uns drum
    try {
        return readln().toDouble()
    } catch (e: Exception){
        println("Versuchen sie es nochmal")
        return readDouble()
    }
}

fun readBoolean(): Boolean{
    var result: Boolean?  = null
    while (result == null){
        val eingabe = readln()

        result = when (eingabe.lowercase()){
            "ja", "true", "j" -> true
            "nein", "no", "n" -> false
            else -> null
        }
    }
    return result
}