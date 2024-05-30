package wiederholunggestern.aufgabe8

fun main() {
    var student = Student("Jürgen", 44)
    var course = Course("App Dev", mutableListOf(student))
    var dozent = Dozent("Gordon", 30, mutableListOf(course))
    dozent.printCourses()
    dozent.gradeStudent(student, 2.0)
    println(student.avgGrade())
}