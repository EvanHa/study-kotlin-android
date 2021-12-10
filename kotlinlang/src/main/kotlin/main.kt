// lateinit
// NullSafe한 코드를 작성하기 위해서 non-null type으로 변수를 선언하는데,
// 초기값이 없는 경우에는, 이 type을 사용할 수 없는 문제가 있음
// 이럴 때 lateinit을 사용

class Rectangle {
    //var area: Area // Error
    lateinit var area: Area
    fun initArea(param: Area): Unit {
        this.area = param
    }
}

class Area(val value: Int)

fun main(args: Array<String>) {
    val rectangle = Rectangle()
    rectangle.initArea(Area(10))
    println(rectangle.area.value)
}
