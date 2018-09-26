package com.qd.kotlinlearning.chapter14

// 全局变量
var value = 10

fun main(args: Array<String>) {
    //局部变量
    var localValue = 20

    val result = { a: Int ->
        value++
        localValue++
        val c = a + value + localValue
        println(c)
    }
    result(30)      //输出结果是62
    println("localValue =$localValue")    //输出结果是localValue = 21
    println("value =$value")     //输出结果是value = 11


}