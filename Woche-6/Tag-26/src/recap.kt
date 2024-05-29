import bank.*

fun main(){

    val guteBank = Bank(0.05)
    val schlechteBank = Bank(0.01)
    val standardBank = Bank()
    val bank = Bank()

    println("Die Bank hat einen Zins von ${bank.jahresZins}")

    val testKonto = Konto("Mike")
    testKonto.pinAendern()


    bank.register[0] = Konto("Felix", 40000.0)
    bank.register[1] = Konto("Birol", 30000.0,true)
    bank.register[2] = Konto("Dennis", false)





    /*val test = "Hallo"
    test = "Hi"
    */

}