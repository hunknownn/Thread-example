package game.game369

import kotlin.random.Random

class Player (
    val name: String,
    val errorRate : Double
) {
    fun answer() : Boolean{
        val random = Random.nextDouble(0.0, 100.0)
        return errorRate > random
    }
}