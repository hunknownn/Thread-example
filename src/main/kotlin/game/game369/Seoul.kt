package game.game369

class Seoul(
    players: List<Player>,
) : Game(players, "Seoul") {
    override fun next(number: Int):  Pair<String, Int> {
        val nums = number.toString()
        if (nums.contains("3") || nums.contains("6") || nums.contains("9")) {
            return "clap" to 1
        } else {
            return nums to 0
        }
    }
}