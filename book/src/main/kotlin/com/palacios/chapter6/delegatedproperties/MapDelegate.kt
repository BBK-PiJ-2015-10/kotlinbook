package com.palacios.chapter6.delegatedproperties

import kotlin.reflect.KProperty

class MapDelegate {

    private val map = mutableMapOf<String,Any?>()

    operator fun <T> getValue(ref: Any?, property: KProperty<*>): T {
        // equivalent to get
        return map[property.name] as T
    }

    operator fun <T> setValue(ref: Any?, property: KProperty<*>, value :T?){
        map.put(property.name,value)
    }
}