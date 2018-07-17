package day2

fun main(args: Array<String>) {
    val a: Int = 12
    val b: Int = 10
    print("Without return value and arguments : ")
    add()
    print("Without return value and with arguments : ")
    add(a, b)
    print("With return value and Without arguments : ")
    println(add3())
    print("With return value and With arguments : ")
    println(add4(a, b))


}

//no return value no arguments
fun add() {
    val a: Int = 10
    val b: Int = 12
    val c = a + b
    println(c)

}

//no return value with arguments

fun add(a: Int, b: Int) {
    val c = a + b
    println(c)
}

//return value With no arguments

fun add3(): Int {
    val a: Int = 10
    val b: Int = 12
    val c = a + b
    return c
}

//Return value With Arguments

fun add4(a: Int, b: Int): Int {
    val c = a + b
    return c
}
