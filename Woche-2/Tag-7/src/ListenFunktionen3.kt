fun main(){

    val points: List<Int> = listOf(
        (50..60).random(),
        (70..80).random(),
        (50..100).random(),
        (50..100).random(),
        (-30..-10).random()
    )

    // Es gibt viele Funktionen mit { } statt ()
    // lasst euch davon nicht verwirren


    points.last()
/*    points.last {  }
    points.first {  }
    points.indexOfFirst {  }
    points.indexOfLast {  }*/

}