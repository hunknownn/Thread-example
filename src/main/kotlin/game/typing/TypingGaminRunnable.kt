package game.typing

import kotlin.concurrent.Volatile
import kotlin.random.Random

class TypingGaminRunnable : Runnable {
    private val words = arrayOf("java", "thread", "runnable", "hello", "world", "spring", "kotlin", "gpt")
    private val random: Random = Random.Default

    private var currentWord = "" // 멀티스레드 환경에서 안전하게 공유


    fun getCurrentWord(): String {
        return currentWord
    }

    override fun run() {
        while (!Thread.currentThread().isInterrupted) {
            currentWord = words[random.nextInt(words.size)]
            println("💬 Type this word: $currentWord")
            try {
                Thread.sleep(3000)
            } catch (e: InterruptedException) {
                println("게임 종료!")
                break
            }
        }
    }
}