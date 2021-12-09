fun main(args: Array<String>) {
    // 한번만 할당 되는 val
    val a: Int = 1
    val b = 2
    val c = 3.14
    val d: String
    d = "필수로 있어야 하는 구문"
    // d = "d의 초기값이 없으면 null이 될 수 있는데, d는 null이 될 수 없기 때문
    val e: String?

    // 여러번 값 할당이 되는 var
    var f: String = "첫번째 초기화"
    f = "두번째 초기화"
    println("Hello World!")
    println("a = "+a)
    println("b = "+b)
    println("c = "+c)
    println("d = "+d)
    println("f = "+f)

    // Byte
    // Short
    // Int : 123
    // Long : 123L
    // Float : 123.4f
    // Double : 123.4
    // Char
    // String
    var str:String = "abcd"
    str = "abcd" + 1
    println("str : " + str)
    str = "abcd" + "efg"
    println("str : " + str)

    // Boolean
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    // ?가 붙으면 true, false 외에 null 값도 가질수 있음. nullable
    val boolNull: Boolean? = null
    println("true " + myTrue)
    println("false " + myFalse)
    println("boolNull " + boolNull)
}
