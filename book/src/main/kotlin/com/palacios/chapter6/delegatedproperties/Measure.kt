package com.palacios.chapter6.delegatedproperties

class Measure {

    var writeTimeStamp: Long by TimestampValueDelegate()
}