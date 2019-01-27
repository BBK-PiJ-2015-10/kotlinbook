package com.palacios.chapter9

import java.util.Date;
import java.net.URI;

fun main(args: Array<String>) {

    /*
    val blogEntry = BlogEntry(
        "Data classes are here",
        "Because Kotlin rules",
        Date(),
        true,
        Date(),
        URI("HTTP://packt.com/blog/programming_kotlin/data_classes"),
        0,
        emptyList(),
        null)

    val blogEntry2 = blogEntry.copy(title = "Properties in Kotlin",description="Propeties are awesome too")

    //Here you are creating a tuple of the field values of the data class
    val (title, description, publishedTime, approved, lastUpdated, url, comments, tags, email) = blogEntry

    println("Here are the vaues for each field in the entry: title=$title, description $description")

    */

    //Example of manual deconstruction

    for ((a,b,c) in listOf(Vector3(0.2,0.1,0.5), Vector3(-12.0,3.1245,5.100))){
        println("Coordinates: x=$a, y=$b,, z=$c")
    }

    for ((sensorId, sensorValue) in listOf(Sensor("DS18B20",29.2),Sensor("DS18B21",32.1))){
        println("Sensor $sensorId reading is $sensorValue degrees Celsius")
    }

}


operator fun Sensor.component1() = this.id
operator fun Sensor.component2() = this.value