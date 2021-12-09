fun main(args: Array<String>) {
    // kotlin에서는 switch가 없고, when이 있음

    var x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    x = 0
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        in 1..10 -> println("x는 1부터 10 범위 안에 있음")
        !in 10..20 -> println("x는 10부터 20 범위 안에 없음")
        else -> println("otherwise")
    }

    when (x) {
        is Int -> println("x는 인트형")
        else -> println("x는 인트형이 아님")
    }
}
