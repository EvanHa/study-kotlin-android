fun main(args: Array<String>) {
    println("Hello World!")
    println("1 + 2 = " + sum(1, 2))
    println("1 + 2 = " + sum2(1, 2))
    println("1, 2 max ? " + max(1, 2))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun max(a: Int, b: Int) = if (a > b) a else b

