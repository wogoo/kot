fun main() {
    val coinFlip = Coin()
    println("O resultado foi ${coinFlip.flip()} e ${coinFlip.resPa}")
}

class Coin() {
    val flip = (1..2).random()
    fun flip():Int {
        return flip
    }
    val resPa = when(flip){
        1 -> "Impar"
        2 -> "Par"
        else -> "Null"
    }
}