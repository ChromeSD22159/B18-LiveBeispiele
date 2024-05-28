
fun main(){
    val katze = Cat("Tom", "braun")

    val chris = Person("Chris")
    val gordon = Person("Gordon", 42, 5000.0)

    val gordon2 = Person("Gordon", 21)


//    Person.geburtstag()
    Person("Tony").geburtstag()
    chris.geburtstag()

//    String.toDouble()
    "54.0".toDouble()
    "jhsdfhgh".toDouble()

    chris.geburtstag()
    gordon.geburtstag()

    chris.name = "Francesco"
    chris.alter = 7

    println(chris.name)
}