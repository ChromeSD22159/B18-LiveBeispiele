fun main() {

    val streichelzoo: Streichelzoo = Streichelzoo()
    // TODO: Erstelle min. 6 Besucher
    val besucher1: Besucher = Besucher("Seb", 26)
    val besucher2: Besucher = Besucher("Boris", 4)
    val besucher3: Besucher = Besucher("Timo", 5)
    val besucher4: Besucher = Besucher("Miriam", 18)
    val besucher5: Besucher = Besucher("Sahel", 14)
    val besucher6: Besucher = Besucher("Marek", 9)


    // TODO: Jeder der Besucher versucht in den Streichelzoo zu gehen.
    streichelzoo.neuerBesucher(besucher1)
    streichelzoo.neuerBesucher(besucher2)
    streichelzoo.neuerBesucher(besucher3)
    streichelzoo.neuerBesucher(besucher4)
    streichelzoo.neuerBesucher(besucher5)
    streichelzoo.neuerBesucher(besucher6)

    // TODO:  Alle Besucher wollen zuerst auf einem der Ponys reiten.
    for (besucher in streichelzoo.besucher) {
        // Wählt ein zufälliges Pony pro Besucher
        val pony = streichelzoo.tiere.filterIsInstance<Pony>().random()
        pony.reiten(besucher)
    }

    // TODO: Ein Besucher füttert das Schaf.
    // Problem: Methoden von Unterklassen verwenden
//    val schaf1: Tier = streichelzoo.tiere[1]
    val schaf1: Schaf = streichelzoo.tiere[1] as Schaf
    schaf1.bewegung()
    schaf1.wolleSauber
    schaf1.baden()

    val zufallsTier = streichelzoo.tiere.random()
    when(zufallsTier){
        is Schaf -> (zufallsTier as Schaf).baden()
        is Kuh -> zufallsTier.gibtMilch
    }

    // alternative Lösung: Die Tiere filtern
    val schafe: List<Schaf> = streichelzoo.tiere.filterIsInstance<Schaf>()   // .first() oder .random()
    val schafe2: List<Tier> = streichelzoo.tiere.filter {it is Schaf}    // .first() oder .random()
    schafe2.random() as Schaf

    // z.B:

    // TODO: Ein Besucher füttert das Schaf.
    streichelzoo.tiere.filterIsInstance<Schaf>().first().fuettern(besucher3)
    // TODO: Eines der Hühner läuft durchs Gehege.
    streichelzoo.tiere.filterIsInstance<Huhn>().random().bewegung()

    // TODO: Ein paar Besucher streicheln die Kuh
    repeat(2) {
        val kuh = streichelzoo.tiere.filterIsInstance<Kuh>().random()
        val besucher = streichelzoo.besucher.random()
        kuh.streicheln(besucher)
    }

    // TODO: 2 Besucher verlassen den Streichelzoo
    streichelzoo.exit(besucher1)
    streichelzoo.exit(besucher2)


    // TODO: Ein Besucher versucht die Kuh zu melken.
    streichelzoo.tiere.filterIsInstance<Kuh>().random().melken(streichelzoo.besucher.random())

    // TODO: Fütterungszeit. Ein Besucher füttert alle Tiere
    for (tier in streichelzoo.tiere) {
        tier.fuettern(besucher3)
    }

    // TODO: Ein Zoowärter kontrolliert alle Schafe, ob sie sauber sind. Wäscht die dreckigen.
    for (schaf in streichelzoo.tiere.filterIsInstance<Schaf>()) {
        if (!schaf.wolleSauber)
            schaf.baden()
    }

    // TODO: Zuletzt haben die beiden Ponys ein Rennen.
    val pony1 = streichelzoo.tiere[2] as Pony
    val pony2 = streichelzoo.tiere.filterIsInstance<Pony>().last()
    streichelzoo.rennen(pony1, pony2)

    // TODO: Die restlichen Besucher verlassen den Zoo
    while (streichelzoo.besucher.isNotEmpty()) {
        streichelzoo.exit(streichelzoo.besucher.first())
    }
}



    