package day2

fun  main(args:Array<String>){

    val array = IntArray(10)
    var i =0
    while(i<10){
        array[i] = readLine()!!.toInt()
        i++
    }

    for (item in array){
        println(item)
    }
}