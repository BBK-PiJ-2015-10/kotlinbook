package com.palacios.chapter10

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.FunSpec
import io.kotlintest.specs.WordSpec
import io.kotlintest.specs.ShouldSpec
import io.kotlintest.specs.BehaviorSpec
import io.kotlintest.specs.FeatureSpec
import io.kotlintest.specs.StringSpec
import io.kotlintest.mock.`when`
import java.util.Stack


class StringTest : FunSpec() {

  init{
        test("String.startsWith should be true for a prefix") {
            "helloworld".startsWith("hello") shouldBe  true
        }
    }

}

class MyTests : WordSpec() {

    init{
        "String.length" should {
            "return the length of the string" {
                "hello".length shouldBe 5
                "".length shouldBe 0
            }
        }
    }

}

class MyShouldExpect : ShouldSpec() {

    init {
        "String.length" {
            should("return the length of the string"){
                "hello".length shouldBe 5
            }
            should ("support empty strings"){
                "".length shouldBe 0
            }
        }
    }

}

class MyBehaviourSpec : BehaviorSpec() {
    init {
        given("a stack"){
            val stack = Stack<String>()
            `when`("an item is pushed"){
                stack.push("kotlin")
                then("the stack should not be empty"){
                    stack.isEmpty() shouldBe false
                }
            }
            `when`("the stack is popped"){
                stack.pop()
                then("it should be empty"){
                    stack.isEmpty() shouldBe false
                }
            }
        }
    }
}

class MyFeatureSpec : FeatureSpec() {

    init {
        feature("a stack"){
            val stack = Stack<String>()
            scenario("should be non-empty when an item is pushed"){
                stack.push("kotlin")
                stack.isEmpty() shouldBe false
            }
            scenario("should be empty when the item is popped"){
                stack.pop()
                stack.isEmpty() shouldBe true
            }
        }
    }

}

class MyString : StringSpec(){

    init {
        "strings.length should return size of the string" {
            "hello".length shouldBe 5
        }
    }
}

