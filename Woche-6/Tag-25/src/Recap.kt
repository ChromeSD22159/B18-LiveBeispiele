
fun main(){

    // die erstellte Person wird nirgends abgespeichert -> wird direkt wieder gelöscht
    Person("Christian H.")

    // Instanzen von Klassen:
    val mario = Person("Mario Z.", 41)
    val sandraF = Person("Sandra F.", 33)


    // Instanz-Objekte selbst als Konstante veränderbar (ähnlich wie MutableList)
    val dennisF: Person = Person("Dennis F.", 28)
    dennisF.name = "Dennis F."
    dennisF.alter = 28
    // Nicht erlaubt: Die Konstante neu belegen
//    dennisF = Person("Identitätsdieb")

    // Andere Objekte als Eigenschaft
    dennisF.ehePartner = sandraF


//    dennisF.kinder.add(Person("Tina F.", 3))
//    dennisF.kinder.add(Person("Tina F.", 3)) // Sandra hat ein anderes Kind als Dennis!?

    val tinaF = Person("Tina F.", 3)

    dennisF.kinder.add(tinaF)
    dennisF.kinder.add(Person("Fabian F.", 1))

    // Sandra und Dennis haben dieselben Kinder
//    sandraF.kinder = dennisF.kinder
    sandraF.kinder.addAll(dennisF.kinder)

    sandraF.kinder.add(Person("Marco F", 0))

    // Klassen Methode ausführen
    dennisF.beschreibung()

    var dennisKatze: Cat = Cat("Fluffy", "rot")

//    dennisF.kinder.add(dennisKatze)
//    dennisF.kinder.add("Fluffy")

    // Datentypen beachten!
//    dennisKatze = Person("Test", 3)   // Nicht möglich!
//    sandraF = Cat("Mike", "braun")


    val dennisT = Person("Dennis T.", 68)
    dennisT.kinder.add(Person("Maria", 34))
    dennisT.kinder.add(Person("Donna", 41))
    dennisT.kinder[1].kinder.add(Person("Tony", 8))
    dennisT.kinder[0].kinder.add(Person("Jesus", 3))

    println("Enkelkinder von Dennis: ")

    println(dennisT.enkelkinder().joinToString { kind ->
        "${kind.name} (${kind.alter}), "
    })


//    dennisT.name = "Dennis T."
    dennisT.geburtstag()

    println("Dennis T. verdient ${dennisT.gehalt}€ und somit ${dennisT.jahresGehalt()}€ im Jahr!")


    println("-----")
    // Vergleich von Objekten (und ihrer Identität)
    println(dennisF)
    println(dennisT)
    println(dennisF == dennisT)
    println(dennisF.name == dennisT.name)


    val sandraT = Person("Sandra T.", 8)
    dennisT.kinder.add(sandraT)
    dennisT.kinder.add(Person("Matthias T.", 5))
    // Das Objekt Matthias T ist nur in der Liste gespeichert


    val mathias = dennisT.kinder[1]
    mathias.alter

}