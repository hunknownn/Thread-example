package game.game369

interface Game369 : Runnable{
    fun next(number: Int) : Pair<String, Int>
}