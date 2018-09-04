package com.qd.kotlinlearning.chapter10

/**
 * 匿名函数
 */
fun main(args: Array<String>) {
    println(calculateResult(6,4,'+'))

}


/**
 * Kotlin中可以使用匿名函数，匿名函数不需要函数名，需要fun关键字声明，还需要有参数列表和返回类型声明，函数体中需要包含必要的return语句。
 */
fun calculateResult(n1: Int, n2: Int, opr: Char): Int {

    val multiple = 2

    val resultFun = if (opr == '+')
    //声明相加匿名函数
        fun(a: Int, b: Int): Int {
            return (a + b) * multiple
        }
    else
    //声明相减匿名函数
        fun(a: Int, b: Int): Int = (a - b) * multiple
    return resultFun(n1, n2)
}