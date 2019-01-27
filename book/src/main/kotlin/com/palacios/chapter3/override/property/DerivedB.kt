package com.palacios.chapter3.override.property

import com.palacios.chapter3.override.property.BaseB

class DerivedB : BaseB("") {

    private var other: String = "default behaviour"

    override var propertyFoo: String
        get() = other
        set(value){
            other = value
        }
}