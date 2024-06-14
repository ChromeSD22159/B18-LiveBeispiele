fun main() {
    var shop = Shop()
    shop.greetUserAndShowCategories()


    var cardList = mutableListOf<Card>()

    Value.values().forEach { value ->
        Color.values().forEach { color ->
            cardList.add(Card(value, color))
        }
    }
}