package day2

fun main(args: Array<String>) {

    val size = readLine()!!.toInt()

    val array = IntArray(size)
    var sum = 0
    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
        if (array[i] % 2 == 0) {
            sum += array[i]
        }

    }

    println("The sum of even numbers are $sum")



    val res: Int = array.find {
        it % 2 == 0
    }?:0

    val index = array.indexOf(res)

    println(index)


}