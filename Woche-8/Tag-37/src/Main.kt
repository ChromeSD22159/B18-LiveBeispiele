import units.Gegner
import units.Mage
import units.Warrior
import java.io.File
import javax.sound.sampled.AudioSystem

fun main() {
    val mage = Mage("Günni")
    val krieger = Warrior("Lisa")
    val gegner = Gegner("Olaf")

    mage.fireBall(gegner)
    krieger.schwertHieb(gegner)
    gegner.mockHeroes()
}

fun playSound(file: String): Thread {
    return Thread {
        val clip = AudioSystem.getClip()
        val stream = AudioSystem.getAudioInputStream(File("Woche-8/Tag-37/src/files/$file.wav"))
        clip.open(stream)
        clip.start()
        Thread.sleep(clip.microsecondLength / 1000)
        clip.close()
        stream.close()
    }
}