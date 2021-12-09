fun main(args: Array<String>) {
    println("max : " + maxJavaStyle(1,2))
    println("max : " + maxKotlinStyle(1,2))
}

fun maxJavaStyle(a:Int, b:Int):Int {
    var max:Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    return max
}

fun maxKotlinStyle(a:Int, b:Int):Int {
    val max = if (a>b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    return max
}