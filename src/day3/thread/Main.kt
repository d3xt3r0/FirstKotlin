package day3.thread

fun main(args: Array<String>) {

    val task1 = Task1()
    val task2 = Task2()

    task1.start()
    task2.start()


}