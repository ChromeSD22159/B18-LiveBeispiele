fun main(){

    val namensListe = listOf(
        "Tobias",
        "Mike",
        "Daniella",
        "Sandra",
        "Marvin",
        "Akira",
        "Mary",
        "Maria"
    )

    val produktListe = listOf(
        "Rhabarber",
        "Tomaten",
        "Tequila",
        "Zitrone"
    )

    produktListe.forEach{ produkt ->
        println(produkt)
    }

    println("-----")
    produktListe.forEach{ it ->
        println(it)
    }
    println("----")
    namensListe.forEach { it ->
        println(it)
    }
    println("-----")
    namensListe.forEachIndexed { index, name ->
        println("Drücken sie $index für $name")
    }




}