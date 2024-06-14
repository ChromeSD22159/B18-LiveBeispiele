package shopping

open class Produkt (
    var name: String,
    var preis: Double,
    var beschreibung: String = ""
){

    open fun ausdrucken(){
        println("$name ($preis€)")
    }

    override fun toString(): String {
        return "$name ($preis€)"
    }

}