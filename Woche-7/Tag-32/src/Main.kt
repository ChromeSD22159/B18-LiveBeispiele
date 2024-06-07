fun main() {
    var tupel = Tupel<String, Int>("Test", 10)

    val player: Player = Player(
        mutableListOf(
            Sword("Schwert1", 1, 21.0, 20),
            Sword("Greyskull", 3, 46.0, 40),
            Sword("Frostmourne", 5, 200.0, 120),
            Sword("Klappschwert", 2, 25.0, 25),
            Healthpotion("Kleiner Heiltrank", 1, 10.0, 10)
        )
    )
    player.listItemsWithinPrice((20.0..50.0))
    player.listAllSwords()
}