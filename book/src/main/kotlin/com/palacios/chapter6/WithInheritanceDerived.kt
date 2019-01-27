package com.palacios.chapter6

class WithInheritanceDerived(val myAvailable : Boolean) : WithInheritance() {

    override var isAvailable: Boolean = myAvailable
        get() {
            // do something before returning the value
            return myAvailable
        }
        set(value) {
            // do something before setting the value
            println("WithInheritanceDerived isAvailable")
            field = value
        }

    fun doSomething(){
        isAvailable = true
    }
}
