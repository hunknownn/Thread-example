import game.game369.Player
import game.game369.Seoul
import game.game369.Wonju

fun main(args: Array<String>) {

    // ------- 369 Game --------
    val players = listOf(
        Player("player1", 99.0),
        Player("player2", 99.0),
        Player("player3", 99.0)
    )

    val seoul = Seoul(players)
    val wonju = Wonju(players)

    val sThread = Thread(seoul)
    val wThread = Thread(wonju)
    println("Thread.currentThread().name = ${Thread.currentThread().name}")
    sThread.start()
    wThread.start()

    sThread.join()
    wThread.join()
    val allClapCount = seoul.clapCount + wonju.clapCount
    println("allCount = ${allClapCount}")


    // ------- Typing Game --------
//    val runnable = TypingGaminRunnable()
//    val gameThread = Thread(runnable)
//    gameThread.start()
//
//
//    val scanner = Scanner(System.`in`)
//    while (true) {
//        val input = scanner.nextLine()
//        if ("exit".equals(input, ignoreCase = true)) {
//            gameThread.interrupt()
//            break
//        }
//        if (input == runnable.getCurrentWord()) {
//            println("✅ 정답!")
//        } else {
//            println("❌ 오답! 다시 도전해봐.")
//        }
//    }

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