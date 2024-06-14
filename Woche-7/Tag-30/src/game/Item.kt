package game

open class Item {
    // Kein primärer Konstruktor, damit es leichter ist verschiedene sekundäre zu erstellen

    // init Blöcke gehören zum Haupt-Konstruktor (und dadurch zu allen!)
    init{
        // Diese Zeile druckt aus, welche Sorte von Item grade erstellt wird
        println("${this::class.simpleName} wird generiert")
    }

    var name: String
    var wert: Int? = null           // Wert in Goldstücken, standardmässig hat ein Item keinen Wert
    var description: String = ""    // Eine Beschreibung des Items, standardmässig ist sie leer


    // Dieser Konstruktor erlaubt mir ein Item mit einem Namen zu initialisieren
    constructor(name: String){
        this.name = name
    }
    
    // Sekundärer Konstruktor, der mir erlaubt ebenfalls einen Gold-Wert zu initialisieren
    constructor(name: String, value: Int){
        if (value < 0){
            throw Exception("Ein Item kann kein negativen Wert haben")
        }
        this.name = name
        this.wert = value
    }

    // Sekundärer Konstruktor, der mir erlaubt eine Beschreibung und ggf. einen Wert zu setzen
    constructor(name: String, description: String, value: Int? = null){ // Value als letztes um Aufruf zu erleichtern
        this.name = name
        this.wert = value
        this.description = description
    }

    // Sekundärer Konstruktor (ohne Parameter), der mir eins von 3 zufälligen Item generiert:
    constructor(): this(""){
         when ((1..6).random()) {
             1,2,3 -> {
                 this.name = "Wertloser Stein"
                 this.wert = 0
                 this.description = "An diesem Stein ist wirklich nichts besonders."
             }
             4, 5 -> {
                 this.name = "Perle"
                 this.wert = 15
                 this.description = "Eine seltene und schöne Perle"
             }
             6 -> {
                 this.name = "Mit Runen versierter Stein"
                 this.description = """
                     Dieser mysteriöse Stein scheint Magisch angehaucht zu sein. 
                     Der Wert dieses Steins ist aktuell noch unbekannt. 
                     """.trimIndent()
//                  this.wert = null  // null ist sowieso der Standard Wert für wert
             } // Ende case 6
         }  // Ende When
    }   // Ende Konstruktor


}   // Ende der Klasse