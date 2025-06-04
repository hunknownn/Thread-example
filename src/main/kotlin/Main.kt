import game.typing.TypingGaminRunnable
import java.util.*

fun main(args: Array<String>) {
    val runnable = TypingGaminRunnable()
    val gameThread = Thread(runnable)
    gameThread.start()


    val scanner = Scanner(System.`in`)
    while (true) {
        val input = scanner.nextLine()
        if ("exit".equals(input, ignoreCase = true)) {
            gameThread.interrupt()
            break
        }
        if (input == runnable.getCurrentWord()) {
            println("✅ 정답!")
        } else {
            println("❌ 오답! 다시 도전해봐.")
        }
    }

//    val gameThread = game.typing.TypingGameThread()
//    gameThread.start()
//
//    val sc = Scanner(System.`in`)
//    while (true) {
//        val input = sc.nextLine()
//        if ("exit".equals(input)) {
//            gameThread.interrupt()
//            break;
//        }
//        if (input.equals(gameThread.currentWord)) {
//            println("You Win!!")
//        } else{
//            println("ㅠㅠ")
//        }
//    }
}