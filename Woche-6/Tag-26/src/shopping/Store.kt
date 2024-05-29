package shopping

class Store (
    var name: String,
    var besitzer: String
) {
    val speisekarte = mutableListOf<Produkt>()


    fun nurGerichte(): List<Gericht>{
        return speisekarte.filterIsInstance<Gericht>()
    }

    fun nurVegi(): List<Gericht>{
        return nurGerichte().filter { it.istVegi }
    }

    fun nurVegiUndBillig(): List<Gericht>{
        return nurGerichte().filter { it.istVegi && it.preis < 5.0}
    }

    fun speiseKarteAusdrucken(){
        for (artikel in speisekarte){
            println("${artikel.name} (${artikel::class.simpleName}) für ${artikel.preis} ")
        }
    }

}