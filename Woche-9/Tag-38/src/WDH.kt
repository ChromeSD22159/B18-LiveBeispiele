import kotlin.random.Random
fun main(){

    println()

//    val ergebnis: String = readln()



    for (i in 1..100){
        println(i)

        if (i % 5 == 0){
            Thread.sleep(5000)
        }
    }


    val i = (1..100).random()

    val produkte = listOf<Produkt>(
        Produkt("Nike Schuhe", 30.0, true),
        Produkt("Adidas Schuhe", 30.0, false),
    )


    for (produkt in produkte){

        println("$produkt")
    }

    produkte.forEach { produkt ->

    }





}


fun readInt(): Int {

    if (Random.nextBoolean()){
        return readInt()
    } else {
        return 0
    }
}

fun produktMitAnzahl(): Pair<String, Int>{

    return Pair("Nike Schuhe", 3)
}


fun produkteAusdrucken(produkte: List<Produkt>){

    for (produkt in produkte){
        if (!produkt.verfuegbar) {
            continue
        }
        println("$produkt")
        Thread.sleep(100)

    }


    for (produkt in produkte){
        if (produkt.verfuegbar) {
            println("$produkt")
        }
    }


}