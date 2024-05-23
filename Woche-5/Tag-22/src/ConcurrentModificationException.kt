fun main(){

    var warteschlange: MutableList<String> = mutableListOf(
        "Aykut", "Robert", "Mohammed", "Patrizio"
    )

    for (person in warteschlange){
        println("Jetzt ist $person dran.")
        warteschlange.remove(person)
    }
//    warteschlange.clear()



}