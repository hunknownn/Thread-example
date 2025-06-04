package game.game369

class Wonju(
    players : List<Player>,
) : Game(players, "Wonju") {
    override fun next(number: Int):  Pair<String, Int> {
        val nums = number.toString()
        if (nums.contains("3") || nums.contains("6") || nums.contains("9")) {
            val claps = nums.filter { it == '3' || it == '6' || it == '9' }
                .map { "clap" }

            return claps.reduce { acc, sum ->
                acc + sum
            } to claps.size
        }
        return nums to 0
    }
}