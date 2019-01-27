package com.palacios.chapter10

import io.kotlintest.seconds

import io.kotlintest.specs.ShouldSpec
import io.kotlintest.specs.WordSpec

import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

fun createFile(file: String, onComplete: ()-> Unit = {}) : Unit {

}

fun createFileCallbackExample(){
    val latch = CountDownLatch(1)
    createFile("/home/davidcopperfield.txt",{ latch.countDown()})
    latch.await(5, TimeUnit.SECONDS)
    // continue with test
}

fun createFileThreadSleepExample(){
    createFile("/home/davidcopperfield.txt")
    Thread.sleep(5000)
    // continue with test
}

//class EventuallyExample : WordSpec(), Eventually{}

//class FileCreateFileEventually : ShouldSpec(), Eventually {}