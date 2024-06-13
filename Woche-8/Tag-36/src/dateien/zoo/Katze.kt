package dateien.zoo

class Katze(name: String, alter: Int): Tier(name, alter) {


    override fun save(): String {
        return super.save() + ",Katze"
    }
}