
fun main(){

    var text: String = "Lorem ipsum dolor sit amet, \n" +
            "consectetur adipiscing elit."

    println(text)
    text = """Lorem ipsum dolor sit amet, consectetur adipiscing elit.""".trimMargin()
    println(text)

    val zeichen: Char = text[10]

    text = text.replace(",", "")
    text = text.replace(".", "")

    val wortListe: List<String> = text.split(" ")
    println(wortListe)

    println(wortListe.joinToString(" "))

    // Println mit AsciiCode
    println("""
           {)          
        c==//\         
   _-~~/-._|_|         
  /'_,/,   //'~~~\;;,  
  `~  _( _||_..\ | ';; 
    /'~|/ ~' `\<\>  ;  
    \"  |      /  |     
       \"      \"  \"    

    """.trimIndent())

    var textMitEmoji = "😆"

    println(text.lowercase())

    /*
        name;preis;anzahl;bewertungen
        apfel;0.55;5;1,2,1,3,1
        banane;0.34;2;2,3
        zitrone;0.2;9;
     */

    val beispielZeile = "apfel,0.5,5"       // readln()
    val daten: List<String> = beispielZeile.split(",")
    daten[0] // name
    daten[1] // preis
    daten[2] // anzahl


    val product: Triple<String, Double, Int> = Triple("iPhone", 599.99, 10)

    // Nach Produkt suchen
    if (readln() in product.first)
    if (product.first.contains(readln()))
    if (product.first.lowercase().contains(readln().lowercase()))   // groß-/kleinschreibung egal

    // equal ist das selbe wie ==
    product.first.equals(readln(), true)        // groß-/kleinschreibung egal


    /*
    for zeile in datei.alleZeilen:
        daten = zeile.split(";")

        bewertungen = mutableList<Int>()
        for (bewertung in daten[3].split(",")
            bewertungen.add(bewertung)

        Produkt(
            name = daten[0]
            preis = daten[1].toDouble()
            anzahl = daten[2].toInt()
            bewertungen = bewertungen
        )
     */

}