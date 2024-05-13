package bonusaufgabe

class Player {
    var name: String? = ""

    private fun setPlayerName(name: String) {
        this.name = name
    }

    fun readPlayerName() {
        println("\n${blue}Geben sie dem Sim einen Namen:${reset}")
        this.setPlayerName(readlnOrNull() ?: "")
    }

    fun askForOption(): Options {
        println("\n${blue}Möchtest du die Spiellänge generieren (1) oder volle länge(2)?${reset}")

        return when(readlnOrNull()?.toIntOrNull()) {
            1 -> Options.GENERATED
            2 -> Options.STATIC
            else -> Options.GENERATED
        }
    }

    fun askForDuration(): Long {
        println("\n${blue}Wielange soll eine Runden dauern?${reset}")

        val durations: List<Long> = listOf(1500L, 2000L, 2500L, 3000L)

        durations.forEachIndexed() { index, duration ->
            println("$index: $duration")
            Thread.sleep(100)
        }

        val input = readlnOrNull()?.toIntOrNull()

        return if (input in durations.indices) {
            durations[input ?: 0]
        } else {
            durations[0]
        }
    }
}