
fun main(){

    var alter: Int = 54
    val person1: Person = Person(
        "Lucas",
        "Gordon",
        76,
        "m",
        "grau",
        mutableListOf("Zocken", "Golf")
    )

    var person4: Person = Person(
        "Lucas",
        "Gordon",
        76,
        "m",
        "grau",
        mutableListOf("Zocken", "Golf")
    )

    val person3 = Person(alter = 44, haarfarbe = "grün")
    person3.vorstellen()

    person1.geburtstag()
    person1.vorname = "Obi Wan"

    person1.vorstellen()

    val auto1 = Auto("Audi", "A4")
    auto1.beschleunigen()
    auto1.beschleunigen()
    auto1.beschleunigen()
    val auto2 = Auto("Audi", "A4")
    val auto3 = Auto("VW", "Golf", 50)

    while (auto3.aktuelleGeschwindigkeit > 0) {
        auto3.bremsen()
    }

    val person2: Person = Person(
        "Magdalena",
        "Maria",
        24,
        "f",
        "blond",
        mutableListOf("Zocken", "Kartenspielen", "Tanzen")
    )

    person2.vorstellen()

    val altersListe: List<Int> = listOf(
        44,
        54
    )
    val personen: List<Person>  = listOf(
        person1,
        person2, person3,
        Person("Beispiel", "Toni", 34, "m", "braun")
    )
}