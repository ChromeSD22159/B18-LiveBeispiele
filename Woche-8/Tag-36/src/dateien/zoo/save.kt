package dateien.zoo


import java.io.File

val SAVE_PFAD = "Woche-8/Tag-36/Tiere.csv"

fun main(){

    var tierListe: List<Tier> = listOf(
        Tier("Fofo",(1..6).random()),
        Tier("Tina",(1..6).random()),
        Tier("Milo",(1..6).random()),
        Tier("Dylan",(1..6).random()),
        Tier("Sabi",(1..6).random()),
        Tier("Barbs",(1..6).random()),
        Hund("Bello", (1..6).random()),
        Hund("Bruno", (1..6).random()),
        Hund("Brian", (1..6).random()),
        Hund("Bellina", (1..6).random()),
        Katze("Micha", (2..8).random()),
        Katze("Ali", (2..8).random()),
        Katze("Viktor", (2..8).random()),
        Katze("Sandra", (2..8).random()),
        Katze("Uwe", (2..8).random())
    ).shuffled()

    val saveDatei = File(SAVE_PFAD)
    saveDatei.writeText("Name,Alter,Tierart\n")

    for (tier in tierListe){
        saveDatei.appendText(tier.save()+"\n")
    }

}