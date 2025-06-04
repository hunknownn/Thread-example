package game.typing

import kotlin.random.Random

internal class TypingGameThread : Thread() {
    private val words = arrayOf("java", "thread", "concurrent", "hello", "world", "gpt", "spring", "kotlin")
    var currentWord = ""
        private set
    private val random: Random = Random.Default
    override fun run() {
        while (true) {
            currentWord = words[random.nextInt(words.size)]
            println("💬 Type this word: $currentWord")
            try {
                sleep(3000) // 3초마다 단어 바꿈
            } catch (e: InterruptedException) {
                println("게임 종료!")
                return
            }
        }
    }
}