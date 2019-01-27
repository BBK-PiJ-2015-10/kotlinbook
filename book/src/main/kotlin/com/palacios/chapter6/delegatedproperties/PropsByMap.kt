package com.palacios.chapter6.delegatedproperties

class PropsByMap () {

    private val mapDelegate = MapDelegate()

    var p1: Int by mapDelegate

    var p2: SomeData by mapDelegate

    init {
        mapDelegate.setValue(this,PropsByMap::p1,0)
        mapDelegate.setValue(this,PropsByMap::p2,SomeData('K'))
    }

}