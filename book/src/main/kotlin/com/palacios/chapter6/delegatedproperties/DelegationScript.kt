package com.palacios.chapter6.delegatedproperties

fun main(args: Array<String>) {

    //val record = Record("111")
    //println(record.id)

    val measure = Measure()
    measure.writeTimeStamp = System.currentTimeMillis()

    //Example of map-backed properties

    val propsByMap = PropsByMap()
    println("Props with map: p1=${propsByMap.p1}")
    println("Props with map: p2=${propsByMap.p2}")
    propsByMap.p1 =100
    println("Props with map: p1=${propsByMap.p1}")

    // Example of class with read-only properties by map using kotlin default support

    val player = Player(mapOf("name" to "Alex Jones","age" to 28, "height" to 1.82))
    println("Player ${player.name} is ${player.age} years old and is ${player.height} cm tall")

    val trivial = Trivial()
    println("Trivial flast is :${trivial.flag}")

}