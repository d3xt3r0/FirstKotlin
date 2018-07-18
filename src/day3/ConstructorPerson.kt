package day3

class ConstructorPerson(var Name : String , var Energy : Int){ //constructor

    fun sleep(){
        Energy++
    }

    fun work(){
        Energy--
    }

}

fun main(args:Array<String>){

    val Person1 = ConstructorPerson("Tom",100)
    val Person2 = ConstructorPerson("Jack",75)

    println("The Energy is ${Person1.Energy} ${Person2.Energy} ")
    Person1.work()
    Person2.work()
    Person1.work()
    Person2.work()
    Person1.work()
    Person2.work()
    Person1.work()
    Person2.work()

    println("Energy after working  = ${Person1.Energy} ${Person2.Energy}")

    Person1.sleep()
    Person2.sleep()
    Person1.sleep()
    Person2.sleep()
    Person1.sleep()
    Person2.sleep()
    Person1.sleep()
    Person2.sleep()
    println("Energy after sleeping = ${Person1.Energy} ${Person2.Energy}")

}