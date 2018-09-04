package com.qd.kotlinlearning.chapter10

/**
 * 表达式函数体
 */
fun main(args: Array<String>) {

    println("400.0*300的矩形面积为:${rectangleAreas(400.0,300.0)}")
}

//正常函数体
//fun rectangleAreas(width: Double, height: Double): Double {
//    val area = width * height
//    return area
//}

//表达式函数体
fun rectangleAreas(width:Double,height:Double):Double=width*height



