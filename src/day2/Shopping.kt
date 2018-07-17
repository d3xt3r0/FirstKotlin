package day2

fun main(args: Array<String>) {
    println("""
        Choose your order
        ________________

        1.Saree     200
        2.Shirt     300
        3.Dhoti     400
        4.Pants     300
        5.Churidhar 250
        _______________
        """)
    val order: Int = readLine()!!.toInt()
    val count: Int = readLine()!!.toInt()

    when (order) {
        1 -> {
            println("you selected $count Saree , price = ${200 * count}")
        }
        2, 4 -> {
            println("You selected $count Shirt or Pants , price = ${300 * count}")
        }
        3 -> {
            println("You selected $count Dhoti , price = ${400 * count}")
        }
        5 -> {
            println("You selected $count  Churidar , price = ${250 * count}")
        }
        else -> {
            println("Wrong selection")
        }
    }
}