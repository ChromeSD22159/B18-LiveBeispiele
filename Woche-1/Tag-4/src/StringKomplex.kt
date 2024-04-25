import kotlin.text.*    // Wird standardmässig immer importiert


fun main(){

    // Text Datentypen
    val zeichen: Char = 'A'
    var satz: String = "   Die Sonne scheint am blauen Himmel.\n\n"
    var gedicht: String = """
        In einem kleinen Blumenmeer,
        Blühen Farben, wunderbar und sehr.
        Die Sonne küsst die Blüten sacht,
        Ein duftend' zauberhaft' Gedicht.

        Der Wind erzählt von fernen Reisen,
        Von Abenteuern, leisen, leisen.
        Die Blumen wiegen hin und her,
        Ein zärtlich Lied im Blumenmeer.

        Und wenn der Tag sich neigt zur Ruh,
        Zieht leise Schleier die Natur.
        Die Sterne leuchten, klar und hell,
        Ein Traum in dieser Blumenwelt.

        In jeder Blume lebt ein Klang,
        Ein Lied, das Herzen sanft umfang.
        Die Welt der Blumen ist ein Buch,
        Voll Poesie, so wunderbar und fluch.
    """.trimIndent()



    println("-----------------")

    // Länge eines Strings
    println("Der Satz '$satz' ist ${satz.length} Zeichen lang")
//    println("Der Gedicht \n'$gedicht'\n ist ${gedicht.length} Zeichen lang")

    // String.trim
    println(satz.trim())

    // String.replace
    satz = satz.replace("blauen", "roten")
    println(satz)

//    println("Das Gedicht ist ${gedicht.length} Zeichen lang")
//    gedicht = gedicht.replace("\n", "")
//    println("Das Gedicht ist ${gedicht.length} Zeichen lang")


    // Eine Kommazahl runden mithilfe der Format Funktion
    "%.2f".format(2.5555555).replace(',', '.').toDouble()



    val zeilenImGedicht = gedicht.split('\n')
    println("Das Gedicht ist ${zeilenImGedicht.size} Zeilen lang")

    // Gegenteil von .split() ist .join()


    println("--------------")

    // Wie oft kommt das Wort 'Shady' in diesem Refrain vor?
    var songText = """
        'Cause I'm Slim Shady, yes, I'm the real Shady
        All you other Slim Shadys are just imitating
        So won't the real Slim Shady please stand up
        Please stand up, please stand up?
        'Cause I'm Slim Shady, yes, I'm the real Shady
        All you other Slim Shadys are just imitating
        So won't the real Slim Shady please stand up
        Please stand up, please stand up?
    """.trimIndent()

    // Sonderzeichen löschen
    songText = songText.replace(".", "")
    songText = songText.replace(",", "")
    songText = songText.replace("\n", " ")

    // Gesamter Songtext wird kleingeschrieben
    songText = songText.lowercase()
    // Option 2:
    songText = songText.replace("S", "s")

    // Mehrzahl von Shady macht noch Probleme
    songText = songText.replace("shadys", "shady")

    // Behalte nur das gesuchte Wort, dann zähle die Vorkommnisse
    var wortListe: MutableList<String> = songText.split(' ').toMutableList()
    wortListe.retainAll(listOf("shady"))
    println(wortListe)
    println(wortListe.size)

}