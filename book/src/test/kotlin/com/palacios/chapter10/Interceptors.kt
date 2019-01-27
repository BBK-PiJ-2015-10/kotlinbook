package com.palacios.chapter10

import io.kotlintest.Spec
import io.kotlintest.TestCaseContext
import io.kotlintest.specs.StringSpec
import io.kotlintest.matchers.shouldBe

//The spec interceptor will be run before each method of the class
// The myInterceptor only on the tests with their added config
class SpecInterceptorTest: StringSpec() {

    val mySpecInterceptor: (Spec, ()-> Unit) -> Unit = {
        spec, tests ->
        val start = System.currentTimeMillis()
        tests()
        val end = System.currentTimeMillis()

        val duration = end - start
        println("The spec took $duration millis")
    }

    override val specInterceptors: List<(Spec, ()-> Unit)-> Unit> = listOf(mySpecInterceptor)

    init {

    val myInterceptor: (TestCaseContext, () -> Unit) -> Unit = { context, test ->
        val start = System.currentTimeMillis()
        test()
        val end = System.currentTimeMillis()
        val duration = end - start
        println("This test took $duration millis")
    }

        "this test has an interceptor"{
           "alejandroPalacio".contains("alejandro") shouldBe true
        }.config(interceptors = listOf(myInterceptor))

        "so does this test"{
        "palacios".length shouldBe 8
        }.config(interceptors = listOf(myInterceptor))

    }

}