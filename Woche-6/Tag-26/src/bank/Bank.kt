package bank

class Bank (
    var jahresZins: Double = 0.03
){

    val register = mutableListOf<Konto>()
    val aktuellerLogin: Konto? = null

    fun einloggen(){}

    fun ausloggen(){}

    fun hauptmenu(){}

    fun kontoOeffnen(){}

    fun kontoSchliessen(){}

    fun geldAbheben(){}
}