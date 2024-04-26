
fun main(){

                        //  0123456
    var beispiel: String = "passwort123456#12351234"
    // slice erlaubt uns den String auszuschneiden

    // von .. bis
    var ausschnitt: String = beispiel.slice(0..14)  // von 3 .. bis 14
    println(ausschnitt)


    ausschnitt = beispiel.substring(0, 15)
    println(ausschnitt)



}