package com.qd.kotlinlearning.chapter14

//累加求和函数
fun sum(vararg num: Int): Int {

    var total = 0
    num.forEach {
        if (it == 10) return@forEach//返回Lambda表达式函数
        total += it
    }
    return total
}

fun main(args: Array<String>) {
    val n = sum(1, 2, 10, 3)
    println(n)     //6

    val add = label@ {
        val a = 1
        val b = 2
        return@label 17
        a+b

    }
    //调用Lambda表达式add
    println(add())  //10
}