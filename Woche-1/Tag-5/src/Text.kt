fun main(){

    val password = readln()
    var enthaeltRaute: Boolean = password.contains('#')
    enthaeltRaute = '#' in password

    String

    var enthaeltZiffer: Boolean = password.any { buchstabe -> buchstabe in '0'..'9'}
    enthaeltZiffer = password.any { buchstabe -> buchstabe.isDigit()}

    println("Ist das Passwort gültig: $enthaeltRaute")

    println("Überweise mir 1000000€ auf mein Konto")


}