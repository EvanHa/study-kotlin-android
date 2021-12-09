fun main(args: Array<String>) {
    var x = 5
    while ( x > 0 ) {
        print("$x ")
        x--
    }
    println("")
    // 5 4 3 2 1

    x = 0
    while(x > 0) {
        println(x)
        x--
    }
    // 출력 없음

    var y = 0
    do {
        print(y)
        y--
    } while (y > 0)
    println("")
    // 0
}
