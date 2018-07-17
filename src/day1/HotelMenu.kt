package day1

fun main(args : Array<String>) {
    println("Choose your order\n1.Porotta\n2.Beef\n3.Chappathy\n4.Biriyani\n5.Meals")
    print("Item:")
    val a: Int = readLine()!!.toInt()

    if (a == 1) {
        print("How Many item you need:")
        val itemNo : Int = readLine()!!.toInt()
        print("Porotta ")
        print("price = " + (itemNo * 10) )
    }
    else if (a==2){
        print("How Many item you need:")
        val itemNo : Int = readLine()!!.toInt()
        print("Beef ")
        print("price = " + (itemNo * 100) )
    }
    else if (a==3){
        print("How Many item you need:")
        val itemNo : Int = readLine()!!.toInt()
        print("Chapathy ")
        print("price = " + (itemNo * 8) )
    }
    else if(a==4){
        print("How Many item you need:")
        val itemNo : Int = readLine()!!.toInt()
        print("Biriyani ")
        print("price = " + (itemNo * 130) )
    }
    else if (a==5){
        print("How Many item you need:")
        val itemNo : Int = readLine()!!.toInt()
        print("Meals ")
        print("price = " + (itemNo * 50) )
    }
    else
        print ("Invalid Selection")
}