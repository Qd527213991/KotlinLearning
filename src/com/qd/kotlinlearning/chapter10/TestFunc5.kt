package com.qd.kotlinlearning.chapter10

/**
 *局部函数
 */
fun main(args: Array<String>) {

    println("2*(6+4)=${calculate(6,4,'+')}")
    println("2*(6-4)=${calculate(6,4,'-')}")

}

fun calculate(n1: Int, n2: Int, opr: Char): Int {

    val multiple = 2

    //声明相加函数
    fun add(a: Int, b: Int): Int {
        return (a + b) * multiple
    }

    //声明相减函数
    fun sub(a: Int, b: Int): Int = (a - b) * multiple

    return if (opr == '+') add(n1, n2) else sub(n1, n2)
}

