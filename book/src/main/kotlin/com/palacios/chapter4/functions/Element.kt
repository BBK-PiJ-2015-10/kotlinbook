package com.palacios.chapter4.functions

open class Element(val name: String) {

    open fun Particle.react(name: String): Unit {
        println("$name is reacting with a particle")
    }

    open fun Electron.react(name: String): Unit {
        println("$name is reacing with an electron to make an isotope")
    }

    fun react(particle: Particle) = particle.react(name)
}