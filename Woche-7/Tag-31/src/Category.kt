enum class Category(var displayName: String) {
    WEAPON("Weapons"),
    ARMOUR("Armour"),
    POTIONS("Potions"),
    MAGIC_SCROLLS("Magic Scrolls")
}

enum class WeaponCategory(var displayName: String) {
    SWORD("Swords"),
    BOW("Bows"),
    LANCE("Lance"),
    DAGGER("Daggers")
}

enum class ArmourCategory {
    HELMET,
    BODY_ARMOR,
}

enum class PotionCategory {
    HEALTH,
    MANA
}