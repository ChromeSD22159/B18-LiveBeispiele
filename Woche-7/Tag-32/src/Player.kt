
class Player(
    var inventory: List<Equipment>
) {

    fun listAllSwords() {
        // inventory.filter { it is Sword }
        val sortedSwordList = inventory
            .filterIsInstance<Sword>()
            .sortedBy { it.rarity }
            .sortedBy { it.attackValue }
        printList(sortedSwordList)
        /*
        for (it in inventory) {
            if(it is Sword) {
                println("${it.name} hat einen Angriffswert von ${it.attackValue} und eine Rarity von ${it.rarity}")
            }
        }

         */
    }

    fun listAllHealthpotions() {
        val sortedHealthPotionList = inventory
            .filterIsInstance<Healthpotion>()
            .sortedBy { it.rarity }
            .sortedBy { it.healingValue }
        printList(sortedHealthPotionList)
    }

    fun printList(list: List<Equipment>) {
        list.forEach {
            if(it is Sword) {
                println("${it.name} hat einen Angriffswert von ${it.attackValue} und eine Rarity von ${it.rarity}")
            } else if (it is Healthpotion) {
                println("${it.name} hat einen Heilungswert von ${it.healingValue} und eine Rarity von ${it.rarity}")
            }
        }
    }

    fun listItemsWithinPrice(priceRange: ClosedRange<Double>) {
        val sortedValueList = inventory
            .filter {
                it.value in priceRange
            }
            .sortedByDescending { it.value }
            .sortedByDescending { it.rarity }

        sortedValueList.forEach {
            println("${it.name} hat Verkaufswert von ${it.value} und eine Seltenheit von ${it.rarity}")
        }
        println("Was möchtest du verkaufen?")
        val input = readln()

    }
}