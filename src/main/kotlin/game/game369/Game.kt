package game.game369

abstract class Game(
    var players: List<Player>,
    val gameType: String
) : Game369 {
    var clapCount = 0

    fun play() {
        var number = 1
        while (true) {
            val idx = (number - 1) % players.size
            val player = players.get(idx)
            val result = next(number)
            clapCount += result.second
            if (player.answer()) {
                println("[${gameType} ${Thread.currentThread().name}] ${player.name} -> ${result.first}")
                number += 1
            } else {
                println("End [${gameType} ${Thread.currentThread().name}] ${player.name} -> ${result.first}")
                return
            }
        }
    }

    override fun run() {
        play()
    }
}