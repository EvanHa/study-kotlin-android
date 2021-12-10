// lateinit
// NullSafe한 코드를 작성하기 위해서 non-null type으로 변수를 선언하는데,
// 초기값이 없는 경우에는, 이 type을 사용할 수 없는 문제가 있음
// 이럴 때 lateinit을 사용
// val, primitive type에서는 사용 불가능
// lateinit val area: Area // compile error
// lateinit var width: Int // compile error
// 초기화를 하지 않고 사용할 수는 없음. 선언은 해두고 나중에 초기화해서 사용할때 사용

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
