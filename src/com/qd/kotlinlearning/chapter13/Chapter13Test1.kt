package com.qd.kotlinlearning.chapter13

import com.qd.kotlinlearning.chapter13.definedclass.Figure


class Rectangle:Figure()
{
    override fun onDraw() {
        println("绘制矩形")
    }

    override val cname: String
        get() = "矩形"
}

class Circle:Figure()
{
    override fun onDraw() {

        println("绘制圆形")

    }

    override val cname: String
        get() = "圆形"
}

fun main(args: Array<String>) {

    val rectangle=Rectangle()
    rectangle.onDraw()
    println(rectangle.cname)

    val circle=Circle()
    circle.onDraw()
    println(circle.cname)

}