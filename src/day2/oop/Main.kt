package day2.oop

fun main(args: Array<String>) {

    var lux: Soap = Soap()
    var pears: Soap = Soap()

    println("Thickness lux =  ${lux.thickness} , pears = ${pears.thickness}")

    lux.shower()
    lux.shower()
    pears.shower()
    pears.shower()
    pears.shower()
    pears.shower()

    println("After shower")

    println("Thickness lux =  ${lux.thickness} , pears = ${pears.thickness}")

}