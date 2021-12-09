// Scope Function
// https://kotlinlang.org/docs/scope-functions.html#function-selection

data class Person(var name: String, var age: Int=0, var city: String="") {
    fun moveTo(newcity: String) { city = newcity }
    fun incrementAge() { age++ }
}

fun main(args: Array<String>) {

    // Apply
    // return이 없고, 객체의 멤버를 초기화할때 주로 사용
    // this를 생략하고 사용할 수 있음
    // return시 Context Object(자기자신)을 리턴
    val person = Person("adam").apply {
        age = 32
        city = "London"
    }
    println(person)

    // Also
    // Lambda 입력값을 받고, 값의 유효성 검사나 디버깅의 용도로 사용하기 좋다
    val numbers = mutableListOf("one", "two", "three")
    numbers.also { println("The list elements before adding new one: $it") }
        .add("four")
    println(numbers)

    numbers.also { value -> println("The list elements before adding new one: $value") }

    // let
    // nullsafe한 코드를 작성하기 위해 사용
    // ?.let 을 하면, 객체가 null이 아닌 경우에만 실행되고, let으로 전달되는 값은 null이 아니게 된다.
    // ?.let {}.orEmpty() 와 함께 쓰면, Null 값인 경우에는 공백을 넣어, null이 아닌 값으로 바꿀수 있다. nullsafe 하도록.
    println("\n")
    val str: String? = "Hello"
    val length = str?.let {
        println("let() called on $it")
        it.length
    }
    println("result : $length")

    // With
    println("\n")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }

    // Run
    println("\n")
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
        println(match.value)
    }
}
