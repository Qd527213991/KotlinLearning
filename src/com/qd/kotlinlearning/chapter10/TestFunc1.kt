package com.qd.kotlinlearning.chapter10

/**
 * 函数声明
 */
fun main(args: Array<String>) {


    println("320x480的长方形的面积:${rectangleArea(320.0, 480.0)}")


}

/**
 * fun 函数名(参数列表) : 返回值类型 {
函数体
return 返回值
}
 */
fun rectangleArea(width: Double, height: Double): Double {
    val area = width * height
    return area
}