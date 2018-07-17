package day1

fun main(args: Array<String>) {

    print("Enter a number :")
    val a: Int = readLine()!!.toInt() // !! for  overriding null problem

    if (a < 0)
        print("Negative")
    else if (a > 0)
        print("Positive")
    else
        print("Zero")
}