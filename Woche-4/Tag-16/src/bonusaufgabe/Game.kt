package bonusaufgabe

class Game(private var states: States, private val player: Player) {

    fun gameAction(){

        if(states?.simHungry!!) eat()

        if(states?.simTired!!) sleep()

        if(states?.houseDirty!!) clean()

        if(states?.simWork!!) work()

        if(states?.simDoSports!!) doSports()

        if(states?.simGoShopping!!) goShopping()

        if(states?.simHobby!!) pursueHobby()

        if(states?.simLonely!!) {
            socialize()
        }

        if(
            states?.simTired == false &&
            states?.simLonely == false &&
            states?.simHungry == false &&
            states?.houseDirty == false &&
            states?.simWork == false &&
            states?.simDoSports == false &&
            states?.simGoShopping == false &&
            states?.simHobby == false

        ) {
            reStart()
        }
    }

    private fun eat(){
        divider(Alignment.BEFORE)
        println("$red${player?.name} hat was gegessen$reset \uD83C\uDF54")

        this.waitForAction(states.duration)
        states?.simHungry = false
        states?.houseDirty = true

        println("\n${yellow}nachdem der ${player?.name} gegessen hat, ist die Küche schmutzig${reset}")
        divider(Alignment.AFTER)
    }

    private fun clean(){
        divider(Alignment.BEFORE)
        println("$red${player?.name} hat geputzt$reset \uD83E\uDDF9")

        this.waitForAction(states.duration)
        states?.houseDirty = false
        states?.simTired = true

        println("\n${yellow}Putzen ist anstrengend, danach ist ${player?.name} müde${reset}")
        divider(Alignment.AFTER)
    }

    private fun sleep(){
        divider(Alignment.BEFORE)
        println("$red${player?.name} hat sich schlafen gelegt$reset \uD83D\uDE34")

        this.waitForAction(states.duration)
        states?.simTired = false
        states?.simHungry = true

        println("\n${yellow}nach dem Aufwachen ist ${player?.name} hungrig${reset}")
        divider(Alignment.AFTER)
    }

    private fun work() {
        divider(Alignment.BEFORE)
        println("${red}${player?.name} geht zur Arbeit$reset \uD83D\uDCBC")

        this.waitForAction(states.duration)
        states?.simWork = false
        states?.simDoSports = true

        println("\n${yellow}nach dem Arbeiten möchte ${player?.name} Sport machen${reset}")
        divider(Alignment.AFTER)
    }

    private fun doSports() {
        divider(Alignment.BEFORE)
        println("${red}${player?.name} treibt Sport$reset \uD83C\uDFCB\uFE0F\u200D♂\uFE0F")

        this.waitForAction(states.duration)
        states?.simDoSports = false
        states?.simGoShopping = true

        println("\n${yellow}nach dem Sport möchte ${player?.name} Shoppen gehen${reset}")
        divider(Alignment.AFTER)
    }

    private fun goShopping() {
        divider(Alignment.BEFORE)
        println("${red}${player?.name} geht einkaufen$reset \uD83D\uDECD\uFE0F")

        this.waitForAction(states.duration)
        states?.simGoShopping = true
        states?.simHobby = true

        println("\n${yellow}nach dem Einkaufen möchte ${player?.name} seinem Hobby nachgehen${reset}")
        divider(Alignment.AFTER)
    }

    private fun pursueHobby() {
        divider(Alignment.BEFORE)
        println("${red}${player?.name} übt ein Hobby aus$reset \uD83C\uDFA8")

        this.waitForAction(states.duration)
        states?.simHobby = false
        states?.simLonely = true

        println("\n${yellow}nach seinem Hobby möchte ${player?.name} Freunde treffen${reset} ")
        divider(Alignment.AFTER)
    }

    private fun socialize(){
        println("\n${yellow}${player?.name} hat sich mit Freunden unterhalten$reset \uD83E\uDD29")
        Thread.sleep(states.duration / 4)
        divider(Alignment.AFTER)
        states?.simLonely = false
    }

    fun printEnd() {
        divider(Alignment.BEFORE)
        println("\n${green} \uD83E\uDD73 HURRA, ${player?.name} ist komplett glücklich${reset}")
        divider(Alignment.AFTER)
    }

    fun reStart(): Boolean {
        println("\n${blue}Möchtest du noch einmal Spielen? (j/n)${reset}")
        val input = readlnOrNull()?.first()?.lowercase()
        return input == "j"
    }

    fun divider(alignment: Alignment) {
        if (alignment == Alignment.BEFORE) println("\n- - - - - - - - - - - - - - - - - - - - - ")
        if (alignment == Alignment.AFTER) println("- - - - - - - - - - - - - - - - - - - - - \n")
    }

    fun waitForAction(duration: Long) {
        Thread.sleep(duration / 4)
        println(".")
        Thread.sleep(duration / 4)
        println(". .")
        Thread.sleep(duration / 4)
        println(". . .")
        Thread.sleep(duration / 4)
    }
}