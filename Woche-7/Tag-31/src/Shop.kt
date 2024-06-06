class Shop {
    val sortiment = mutableListOf<Product>(
        Product("Schwert", 2.99, Category.WEAPON),
        Product("Mana Potion", 0.99, Category.POTIONS),
    )

    fun greetUserAndShowCategories() {
        println("Welcome to the shop, please select the category you are interested in:")
        Category.values().forEachIndexed { index, category ->
            println("${index + 1}. ${category.displayName}")
        }
        val input = readln()
        if (input == "1") showWeaponCategories()
    }

    fun showWeaponCategories() {
        println("Ok, now please select the category of weapons you are interested in:")
        WeaponCategory.values().forEachIndexed { index, category ->
            println("${index + 1}. ${category.displayName}")
        }
    }

    fun showAllPotions() {
        sortiment.forEach { product ->
            if(product.category == Category.POTIONS) println(product.name)
        }
    }
}