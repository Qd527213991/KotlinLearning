package com.qd.kotlinlearning.chapter26

import kotlin.reflect.full.createInstance
import kotlin.reflect.full.functions

//声明Person类
class Person2{

    var name: String? = null
    var age: Int = 0

    fun setNameAndAge(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "Person [name=$name, age=$age]"
    }
}

//声明相加函数
fun add(a: Int, b: Int): Int = a + b

//声明相减函数
fun sub(a: Int, b: Int) = a - b

fun calculate(opr: Char): (Int, Int) -> Int = if (opr == '+') ::add else ::sub

fun main(args: Array<String>) {

    val fn1 = ::add
    val fn2 = ::sub
    val fn3 = calculate('+')
    println(fn1.call(10, 5))
    println(fn1(10, 5)) //输出结果是15
    println(fn2(10, 5)) //输出结果是5
    println(fn3(10, 5)) //输出结果是15

    val clz = Person2::class
    val person = clz.createInstance()

    clz.functions.forEach { println(it.name) }
    val pfn1 = clz.functions.first()
    pfn1.call(person, "Tom", 20)
    println(person)

    val pfn2 = Person2::setNameAndAge
    pfn2(person, "Tony", 18)
    println(person)
    pfn2.call(person, "Ben", 28)
    println(person)

}