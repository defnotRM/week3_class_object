fun buildAquarium() {
    val myAqurium = Aquarium(length = 25, width = 25, height = 40)
    myAqurium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()


}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()

    println("Plecostous: ${pleco.color}")
    pleco.eat()
}

fun makeDecorations(){
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))

    val d5 = Decoration2("crystal","wood","diver")
    println(d5)

    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

}

fun tryEnum(){
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}



fun main() {
    //buildAquarium()
    //makeFish()
    //makeDecorations()
    tryEnum()
}


