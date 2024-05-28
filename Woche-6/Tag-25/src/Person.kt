// JEDE Klasse in eine EIGENE Datei
import farben.gelb
import farben.reset

// KlassenNamen werden Großgeschrieben
class Person (  // Runde Klammer sind der Konstruktor

    // 3 Eigenschaften: Name, Alter und Kinder
    var name: String = "",
    var alter: Int = 0,
)
{
    // 2 Eigenschaften: Gehalt und Ehepartner
    val kinder: MutableList<Person> = mutableListOf()
    var gehalt: Double = 0.0
    var ehePartner: Person? = null

    constructor(name: String, alter: Int, gehalt: Double): this(name, alter){
        this.gehalt = gehalt
    }

    fun geburtstag(){
        println("${gelb}Hurra!$reset $name hat heute Geburtstag")
        this.alter++
    }

    fun beschreibung(){
        println("------")
        println("Ich heiße '$name' und bin $alter Jahre alt.")

        if (ehePartner != null) {
//            println("Mein Ehepartner ist ${ehePartner?.name}")
            println("Mein Ehepartner ist ${ehePartner!!.name}.")
        }

        if (kinder.size == 1){
            println("Ich habe ${kinder.size} Kind.")
        }
        else if (kinder.size > 1)
            println("Ich habe ${kinder.size} Kinder.")
        else
            println("Ich hab keine Kinder.")

        print("Meine Kinder heißen: ")
        println(kinder.joinToString{
            "${it.name} (${it.alter}), "
        })

        /*for (it in kinder){
            print("${it.name} (${it.alter}), ")
        }*/
        println("")
//        println("Meine Kinder : $kinder")
        println("------")




    }

    fun jahresGehalt(): Double{
        return 12 * this.gehalt
    }

    fun enkelkinder(): List<Person>{
        val dennisTEnkelKinder = mutableListOf<Person>()

        for (kind in this.kinder){
            dennisTEnkelKinder.addAll(kind.kinder)
        }

        return dennisTEnkelKinder
    }

}