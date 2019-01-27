package com.palacios.chapter3.inheritance

class AmphibiousCar (val name: String) : Drivable, Sailable {

    override fun drive() {
        println("Driving")
    }

    override fun sail() {
       println("Sailing")
    }
}