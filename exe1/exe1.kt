fun main() {

    val firstDice = Dice(6)
    println("Seu primeiro dado de ${firstDice.nSides} lados > deu: ${firstDice.roll()} cor: ${firstDice.color}!")

    val secondDice = Dice(10)
    println("Seu segundo dado de ${secondDice.nSides} lados > deu: ${secondDice.roll()} cor: ${secondDice.color}!")
}

class Dice(val nSides: Int) {
    val rNum = (1..nSides).random()  
    fun roll(): Int {              
        return rNum
    }
    
    val color =  when(rNum) {
        in 1..4 -> "yellow"
        in 5..9 -> "red"
        else -> "dark"
    }
}