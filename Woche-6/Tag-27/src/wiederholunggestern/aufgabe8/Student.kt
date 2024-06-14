package wiederholunggestern.aufgabe8

class Student(
    name: String,
    age: Int
) : Person(
    name,
    age
) {
    var grades: MutableList<Double> = mutableListOf()

    fun avgGrade(): Double {
        return grades.average()
    }
}