package store

fun main(){

    val sortiment = mutableListOf<Produkt>()

    sortiment.add(Equipment("Yoga Matte", 40.0, true))
    sortiment.add(Equipment("Yoga Kissen", 25.0, false, true))
    sortiment.add(Equipment("Kopfmassagespinne", 5.0, false))

    sortiment.add(Tee("Bio Kräutertee", 4.44, "Österreich", 200))
    sortiment.add(Tee("Yogi Glückstee", 3.5, "Deutschland", 340))
    sortiment.add(Tee("Oolongtee", 5.25, "Taiwan", 200))
    sortiment.add(Tee("Grüntee classic", 5.25, "China", 200))
    sortiment.add(Tee("Grüntee Jasmin", 5.25, "China", 200))


    for (product in sortiment){
//        println("${product.name} kostet ${product.preis}")
        println("$product")
    }




}