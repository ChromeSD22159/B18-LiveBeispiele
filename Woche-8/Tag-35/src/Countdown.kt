import java.time.LocalTime
import java.time.Duration

fun main(){
    println("Ein Simpler Countdown: ")
    readln()
    simpleCountdown(10)

    println("\n-----")

    println("Ein Countdown mit java.time: ")
    readln()
    complexCountdown(10)
}


fun simpleCountdown(seconds: Int) {
    for (i in seconds downTo 0){
        if (i ==9){
            print("\b") // \b löscht ein Zeichen, was vorher in der Zeile stand (=backspace).
        }
        print("\b$i")
        Thread.sleep(999)
    }
}


fun complexCountdown(seconds: Int){
    val startTime = LocalTime.now()
    val endTime = startTime.plusSeconds(seconds.toLong())

    var counter = seconds
    do {
        val currentTime = LocalTime.now()

        if (currentTime.isAfter(endTime.minusSeconds(counter.toLong()))){
            if (counter == 9) print("\b")   // Zum löschen der 1 von der 10
            print("\b$counter")
            counter--
        }
    } while (currentTime.isBefore(endTime))
//    } while {counter != 0}
}
