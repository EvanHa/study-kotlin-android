// Lazy initialization
// 선언할때, 초기화도 같이 넣는다.
// 다만 실제로 처음 사용될때 초기화 구문이 실행되면서 초기값이 할당됨.
// val property만 사용할 수 있음
// primitive type(Int, Boolean등)도 사용 가능
// Non-null, Nullable 모두 사용 가능

class Account() {
    val balance: Int by lazy {
        // 처음 사용할때 한번만 호출되고, 그뒤로는 호출되지 않는다.
        println("Setting balance!")
        100
    }
}

fun main(args: Array<String>) {
    val account = Account()
    println(account.balance)
    println(account.balance)
}
