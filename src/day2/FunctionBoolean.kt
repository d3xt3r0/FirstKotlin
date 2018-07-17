package day2

fun main(args: Array<String>) {

    val a: Int = 23

    print("Without return value and without parameters : ")
    isEven()
    print("Without return value and with parameters : ")
    isEven(a)
    print("With return value and without parameters : ")
    println(isItEven())
    print("With return value and with parameters : ")
    println(isItEven(a))
}

//Without return value Without parameters
fun isEven() {
    val a: Int = 23
    if (a % 2 == 0)
        println(true)
    else
        println(false)
}

//Without return value and With arguments
fun isEven(a: Int) {
    if (a % 2 == 0) {
        println(true)
    } else
        println(false)
}

//With return value without parameters

fun isItEven(): Boolean {
    val res: Boolean
    val a: Int = 23

    if (a % 2 == 0)
        res = true
    else
        res = false
    return res
}

//With return value and with return value

fun isItEven(a: Int): Boolean {
    val res: Boolean
    if (a % 2 == 0)
        res = true
    else
        res = false
    return res
}