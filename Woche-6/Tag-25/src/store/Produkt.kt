package store

class Produkt {
    var artikelName: String
    var preis: Double

    constructor(name: String, preis: Double){
        this.artikelName = name
        this.preis = preis
    }

    constructor(name: String){
        this.artikelName = name
        println("Geben sie den Preis für $name ein:")
        this.preis = readln().toDouble()
    }

    // Zufallsgenerator:
    /*constructor(){
        this.artikelName = namensListe.random()
        this.preis = Random.nextDouble(1.0, 3.0)
    }*/


}