package com.palacios.chapter6

open class WithInheritance {

    open var isAvailable: Boolean = false
        get() = field
        protected set(value){
            field = value
        }

}