fun main(){

    /*
        TODO:
         Gegeben sind eine Liste von Spielern und Punktzahlen
         Die Indices der beiden Listen stehen für die selbe SpielerIn
         Finde die 3 SpielerInnen mit den höchsten Punktzahlen,
         und geb sie auf der Konsole aus. (sowohl Name als auch Punkte)
     */

    val players = mutableListOf<String>(
        "Nadia",
        "Anna",
        "Christian",
        "Marco",
        "Davide",
        "Killian",
        "Theresa",
        "Augusto",
        "Julian",
        "Maria"
    )

    val points = mutableListOf<Int>(
        (50..100).random(),
        (50..100).random(),
        (50..100).random(),
        (50..100).random(),
        (50..100).random(),
        (50..100).random(),
        (50..100).random(),
        (50..100).random(),
        (50..100).random(),
        (50..100).random(),
    )
    println("""
        ---------------------------
        ${players[0]}: ${points[0]}
        ${players[1]}: ${points[1]}
        ${players[2]}: ${points[2]}
        ${players[3]}: ${points[3]}
        ${players[4]}: ${points[4]}
        ${players[5]}: ${points[5]}
        ${players[6]}: ${points[6]}
        ${players[7]}: ${points[7]}
        ${players[8]}: ${points[8]}
        ${players[9]}: ${points[9]}
        ---------------------------
    """.trimIndent())
    println()

    val sortedPoints = points.sortedDescending()

    val ersterPlatzPunkte = sortedPoints.first()
    val zweiterPlatzPunkte = sortedPoints[1]
    val dritterPlatzPunkte = sortedPoints[2]

    val indexPlatz1: Int = points.indexOf(ersterPlatzPunkte)
    val ersterPlatz = players[indexPlatz1]

    val indexPlatz2: Int = points.lastIndexOf(zweiterPlatzPunkte)
    val zweiterPlatz = players[indexPlatz2]

    val indexPlatz3: Int = points.indexOf(dritterPlatzPunkte)
    val dritterPlatz = players[indexPlatz3]

    println("Top 3: ")
    print("Auf Platz 3:")
    Thread.sleep(500)
    println(" $dritterPlatz mit $dritterPlatzPunkte Punkten")

    Thread.sleep(2000)
    print("Auf Platz 2:")
    Thread.sleep(500)
    println(" $zweiterPlatz mit $zweiterPlatzPunkte Punkten")

    Thread.sleep(2000)
    print("Und der Gewinner ist:")
    Thread.sleep(1000)
    println(" $ersterPlatz mit $ersterPlatzPunkte Punkten")
}
