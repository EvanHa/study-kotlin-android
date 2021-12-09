// Lambda expression

// JAVA
/*
button.setOnClickListener(new View.OnClickListener()) {
    @Override
    public void onClick(View view) {
        ...
    }
}
*/

// Kotlin
// button.setOnClickListener { v-> }

fun main(args: Array<String>) {
    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    println(sum(1,2))
}
