package bonus

import bonusaufgabe.*
import kotlin.system.exitProcess
import kotlin.time.Duration

fun main() {
    // Init Player
    val player = Player()

    // ReadLine for PlayerName
    player.readPlayerName()

    // ReadLine for Option (Full/Generated length)
    val option = player.askForOption()

    val duration = player.askForDuration()

    // Play until User say to Exit
    while (true) {
        val isExit = generateGameInstance(option, player, duration)

        if (!isExit) exitProcess(0) // exit when restart is false
    }
}

fun generateGameInstance(option: Options, player: Player, duration: Long): Boolean {
    val states = States(option)
    states.duration = duration
    val game = Game(states, player)
    game.gameAction()
    game.printEnd()
    return game.reStart()
}



