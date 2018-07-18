package day3

fun main(args: Array<String>) {

    val Dell = Laptop(50)
    val Hp = Laptop(50)
    val Asus = Laptop("Asus",75,2,"Grey")

   // println("The power is : ${Dell.power} ${Hp.power}")

    Dell.use()
    Hp.use()
    Dell.use()
    Hp.use()
    Dell.use()
    Hp.use()
    Hp.use()
    Dell.use()

    Asus.use()
    Asus.display()

  //  println("The power is  : ${Dell.power} ${Hp.power}")

}