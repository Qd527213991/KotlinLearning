package com.qd.kotlinlearning.chapter14

fun rectanArea(a:Double,b:Double):Double=a*b

fun traArea(a:Double,b:Double):Double=a*b/2

fun getSolidArea(c:(Double,Double)->Double,a:Double,b:Double):Double
{
    return c(a,b)
}

fun main(args: Array<String>) {

    println("40*30矩形的面积:${getSolidArea(::rectanArea,40.0,30.0)}")

    println("底为40，高为30的三角形面积为:${getSolidArea(::traArea,40.0,30.0)}")

}