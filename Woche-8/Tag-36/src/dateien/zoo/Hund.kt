package dateien.zoo

class Hund(name: String, alter: Int): Tier(name, alter) {

    override fun save(): String {
        return super.save() + ",Hund"
    }
}