package day1

fun main(args : Array<String>){
    print ("Enter a number:")
    val a : Int = readLine()!!.toInt()
    if (a % 2 ==  1)
        print("Odd")
    else
        print("Even")
}