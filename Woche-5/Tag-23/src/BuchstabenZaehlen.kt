fun main(){

    val songText = """
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    I want your ugly, I want your disease
    I want your everything as long as it's free
    I want your love
    Love, love, love, I want your love (hey)
    I want your drama, the touch of your hand (hey)
    I want your leather-studded kiss in the sand
    I want your love
    Love, love, love, I want your love (love, love, love)
    (I want your love)
    You know that I want you
    And you know that I need you
    I want it bad, your bad romance
    I want your love, and I want your revenge
    You and me could write a bad romance (oh-oh-oh-oh-oh)
    I want your love and all your lover's revenge
    You and me could write a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    I want your horror, I want your design
    'Cause you're a criminal as long as you're mine
    I want your love
    Love, love, love, I want your love
    I want your psycho, your vertigo shtick (hey)
    Want you in my rear window, baby, you're sick
    I want your love
    Love, love, love, I want your love (love, love, love)
    (I want your love)
    You know that I want you
    And you know that I need you ('cause I'm a free bitch, baby)
    I want it bad, your bad romance
    I want your love, and I want your revenge
    You and me could write a bad romance (oh-oh-oh-oh-oh)
    I want your love and all your lover's revenge
    You and me could write a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    Walk, walk, fashion baby
    Work it, move that bitch crazy
    Walk, walk, fashion baby
    Work it, move that bitch crazy
    Walk, walk, fashion baby
    Work it, move that bitch crazy
    Walk, walk, passion baby
    Work it, I'm a free bitch, baby
    I want your love, and I want your revenge
    I want your love, I don't wanna be friends
    J'veux ton amour, et je veux ta revanche
    J'veux ton amour, I don't wanna be friends (oh-oh-oh-oh-oh, oh-oh-oh-oh)
    No, I don't wanna be friends (oh-oh-oh, caught in a bad romance)
    I don't wanna be friends (oh-oh-oh-oh-oh, oh-oh-oh-oh)
    Want your bad romance (oh-oh-oh)
    Caught in a bad romance
    Want your bad romance
    I want your love, and I want your revenge
    You and me could write a bad romance (oh-oh-oh-oh-oh)
    I want your love and all your lover's revenge
    You and me could write a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    (Want your bad romance)
    Caught in a bad romance
    (Want your bad romance)
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    (Want your bad romance)
    Caught in a bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
""".trimIndent()

//  für jeden Buchstabe im Alphabet:
    for (buchstabe in 'a'..'z'){
        //    anzahl = 0
        var anzahl = 0
        //    für jedes Zeichen im Text (lowercase):
        for (zeichen in songText){
            //    falls Zeichen der gesuchte Buchstabe ist:
            if (zeichen == buchstabe) {
                //    anzahl erhöhen
                anzahl++
            }
        }
        // ausdrucken: “der $Buchstabe kommt $anzahl mal vor”)
        println("Der $buchstabe kommt $anzahl mal vor.")

    }


}