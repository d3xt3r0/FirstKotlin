package day2

fun main(args: Array<String>) {
    println("Which number : ")
    val num: Int = readLine()!!.toInt()
    println("To which extend")
    val times: Int = readLine()!!.toInt()
    var count = 1

    for (i in num..times * num step num) {
        println("$num * $count = $i")
        count++
    }
}