package shopping

class Store (
    // Eigenschaft
    // Gleichzeitig auch Parameter (des primären Konstruktor)
    var name: String,
    var besitzer: String
) {
    val speisekarte = mutableListOf<Produkt>()

    override fun toString(): String {
        return name
    }


    fun nurGerichte(): List<Gericht>{
        return speisekarte.filterIsInstance<Gericht>()
    }

    fun nurVegiGerichte(): List<Gericht>{
        return nurGerichte().filter { it.istVegi }
    }

    fun nurVegiUndBillig(): List<Gericht>{
        return nurGerichte().filter { it.istVegi && it.preis < 5.0}
    }

    fun speiseKarteAusdrucken(){
        for (artikel in speisekarte){
//            println("${artikel.name} (${artikel::class.simpleName}) für ${artikel.preis} ")

            // Besser:
            artikel.ausdrucken()

            // Am Besten:  artikel.toString()
//            println("${artikel.toString()}")
        }
    }

}