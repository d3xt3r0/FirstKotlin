package day3

class Person{

    var Energy : Int = 100

    fun work(){
        Energy--
    }

    fun sleep(){
        Energy++
    }

}

fun main(args:Array<String>){

    val Vinod = Person()

    println("Energy of Vinod = ${Vinod.Energy}")

    Vinod.work()
    Vinod.work()
    Vinod.work()
    Vinod.work()
    Vinod.work()
    Vinod.work()

    println("Energy of Vinod after working  = ${Vinod.Energy}")

    Vinod.sleep()
    Vinod.sleep()
    Vinod.sleep()
    Vinod.sleep()
    Vinod.sleep()
    Vinod.sleep()
    Vinod.sleep()
    Vinod.sleep()
    Vinod.sleep()
    Vinod.sleep()
    Vinod.sleep()

    println("Energy of Vinod after sleeping = ${Vinod.Energy}")

}