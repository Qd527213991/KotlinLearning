package com.qd.kotlinlearning.chapter13.definedclass

abstract class Figure {

    abstract val cname:String

    val name:String="几何图形"

    abstract fun onDraw()

    fun display()
    {
        println(name)
    }
}