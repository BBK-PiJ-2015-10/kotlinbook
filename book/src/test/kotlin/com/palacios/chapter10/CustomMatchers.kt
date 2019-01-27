package com.palacios.chapter10

import java.io.File

import io.kotlintest.matchers.Matcher
import io.kotlintest.matchers.Result
import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.should
import io.kotlintest.specs.FunSpec


class MatcherTest: FunSpec() {
    init {
        test("testing our file matcher"){
            val file = File("/home/packt/kotling.jpg")
            file shouldBe anImageFile()
        }
    }
}

fun anImageFile()= object: Matcher<File>{
    private val suffixes = setOf("jpeg","jpg","png","gif")
    override fun test(file: File): Result {
        val fileExists = file.exists()
        val hasImageSuffix = suffixes.any{
            file.name.toLowerCase().endsWith(it)}
        if (fileExists.not()){
            return Result(false,"File $file should exists")
        }
        if (!hasImageSuffix){
            return Result(false,"File $file should have a well known image suffix")
        }
        return Result(true,"TestPassed")
    }
}

fun exist2() = object : Matcher<File>{
    override fun test(file: File): Result {
        val fileExists = file.exists()
        if (!fileExists){
            return Result(false,"File $file should exists")
        }
        return Result(true,"Test passed")
    }
}

fun ofFileType(ext: String) = object : Matcher<File> {
    override fun test(file: File): Result {
        val isOfType = file.name.toLowerCase().endsWith(ext)
        if (!isOfType){
            return Result(false,"$file is not of type $ext")
        }
        return Result(true, "Test passed")
    }
}

class MultipleMatcherTest: FunSpec(){

    init {
        test("testing our file matcher"){
            val dir = File("/home/packt/images")
            for (file in dir.listFiles()){
                file should (exist2() and ofFileType("jpeg"))
            }
        }
    }

}