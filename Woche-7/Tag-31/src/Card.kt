class Card(
    var value: Value,
    var color: Color
) {
}

enum class Value {
    ONE,
    TWO,
    THREE
}

enum class Color {
    ROT,
    BLAU,
    GRUEN,
    GELB
}