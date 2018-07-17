package day1

fun main(args: Array<String>) {

    var a: Int = 5
    var b: Int = 10
    println("Before swapping")
    println(a)
    println(b)
    val temp: Int = a
    a = b
    b = temp
    println("After swapping")
    println(a)
    println(b)

}