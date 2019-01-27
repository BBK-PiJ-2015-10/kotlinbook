package com.palacios.chapter6.delegatedproperties

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

data class TrivialProperty(private val const: Int) : ReadOnlyProperty<Trivial,Int> {

    override fun getValue(thisRef: Trivial, property: KProperty<*>): Int {
        return const
    }

}

