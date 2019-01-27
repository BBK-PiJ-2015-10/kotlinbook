package com.palacios.chapter4.functions

class NobleGas (name: String) : Element(name) {

    override fun Particle.react(name: String): Unit {
        println("$name is noble, it doesn't react with particles")
    }

    override fun Electron.react(name: String): Unit {
        println("$name is noble, it doesn't react with electrons")
    }

    fun react(particle: Electron) = particle.react(name)

}