package com.qd.kotlinlearning.chapter10

import java.io.IOException

/**
 * 返回特殊数据
 */
fun main(args: Array<String>) {
    printArea1(320.0, 480.0)
    printArea2(320.0, 480.0)

    readDate()


}


/**
 * 1. 无返回类型或者Unit类型
 * 有的函数只是为了处理某个过程，不需要返回具体数据，例如println函数。此时可以将函数返回类型声明为Unit，相当于Java中的void类型，即表示没有实际意义的数据。
 */
fun printArea1(width: Double, height: Double): Unit { //可以省略Unit
    val area = width * height
    println("$width x $height 长方形的面积:$area")
    return //可以省略return
}

fun printArea2(width: Double, height: Double) { //省略Unit
    val area = width * height
    println("$width x $height 长方形的面积:$area")
    //省略return
}

/**
 * 2.永远不会正常返回数据与Nothing类型
 * Kotlin中提供一种特殊的数据类型Nothing，Nothing只用于函数返回类型声明，不能用于变量声明。Nothing声明的函数永远不会正常的返回，只会抛出异常。
 */
fun readDate(): Nothing {
    throw IOException()
}

