package com.qd.kotlinlearning.chapter13

import com.qd.kotlinlearning.chapter13.definedclass.IFigure


class Rect:IFigure
{
    override fun onDraw() {
        println("绘制矩形")
    }

    override val cname: String
        get() = "矩形"
}

class Cir(override val cname:String):IFigure
{
    override fun onDraw() {
        println("绘制圆形")
    }
}

fun main(args: Array<String>) {

    val figure1:IFigure=Rect()
    figure1.onDraw()
    println(figure1.cname)

    val figure2=Cir("圆形")
    figure2.onDraw()
    println(figure2.cname)
}