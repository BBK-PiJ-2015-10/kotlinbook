package com.palacios.chapter3.override.finals

class CesnaAirplane : SingleEngineAirplane() {

    final override fun fly() {
        println("Flying a Cesna")
    }
}