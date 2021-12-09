fun main(args: Array<String>) {
    for (i in 1..5) {
        print("" + i + " ")
        if (i==5) println("")
    }
    // 1 2 3 4 5

    for (i in 6 downTo 0 step 2) {
        print("" + i + " ")
        if (i==0) println("")
    }
    // 6 4 2 0

    for (i in 1..5 step 3) {
        print("" + i + " ")
    }
    println("")
    // 1 4

    val numberList = listOf(100, 200, 300)
    for (number in numberList) {
        println(number)
    }
    // 100 200 300
}
