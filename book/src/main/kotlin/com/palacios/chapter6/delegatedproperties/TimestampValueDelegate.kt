package com.palacios.chapter6.delegatedproperties

import kotlin.reflect.KProperty

class TimestampValueDelegate {

    private var timeStamp = 0L

    operator fun getValue(ref: Any?, property: KProperty<*>): Long {
        return timeStamp
    }

    operator fun setValue(ref: Any?, property: KProperty<*>, value : Long){
        timeStamp = value
    }
}