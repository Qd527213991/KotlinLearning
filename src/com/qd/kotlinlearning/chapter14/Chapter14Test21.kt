package com.qd.kotlinlearning.chapter14


fun rectangleArea(width:Double,height:Double):Double=width*height

fun main(args: Array<String>) {

    //函数类型
    val getArea:(Double,Double)->Double=::rectangleArea

    //调用函数
    println("矩形的面积为:${getArea(40.0,30.0)}")

}