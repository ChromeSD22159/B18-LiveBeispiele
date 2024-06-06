class Weapon(
    name: String,
    cost: Double,
    var subCategory: WeaponCategory,
    var damage: Int
) : Product(
    name,
    cost,
    Category.WEAPON
) {

}