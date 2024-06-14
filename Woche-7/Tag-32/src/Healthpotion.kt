class Healthpotion(
    name: String,
    rarity: Int,
    value: Double,
    var healingValue: Int
) : Equipment(
    name,
    rarity,
    value
) {

}