package day3

class Laptop(var power: Int) {

    var Name: String = ""
    var weight: Int = 100
    var color: String = "Grey"


    constructor(Name: String, power: Int) : this(power) {

        this.Name = Name
    }

    constructor(Name: String, power: Int, weight: Int, color: String) : this(power) {

        this.Name = Name
        this.weight = weight
        this.color = color

    }

    fun use() {
        power--
    }

    fun display() {
        println("""
            Name = $Name
            Weight = $weight
            Color = $color
            Power = $power
        """)
    }

}