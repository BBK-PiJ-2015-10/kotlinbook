package com.palacios.chapter6

class Container {

    lateinit var delayedInitProperty: DelayedInstance

    fun initProperty(instance: DelayedInstance): Unit {
        this.delayedInitProperty = instance
    }
}