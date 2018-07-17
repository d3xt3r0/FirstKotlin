package day2

fun main(args: Array<String>) {

    println("Enter the three numbers:")
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    val c: Int = readLine()!!.toInt()

    val largest: Int

    if (a > b) {
        if (a > c)
            largest = a
        else
            largest = c
    } else {
        if (b > c)
            largest = b
        else
            largest = c
    }

    print("Largest = $largest")

}