package wiederholunggestern.aufgabe8

class Dozent(
    name: String,
    age: Int,
    var courses: MutableList<Course>
) : Person(
    name,
    age
) {

    fun printCourses() {
        courses.forEach { println(it.name) }
    }

    fun gradeStudent(student: Student, grade: Double) {
        student.grades.add(grade)
    }
}