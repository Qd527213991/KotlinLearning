package com.qd.kotlinlearning.chapter13.definedclass

interface IFigure {

    abstract fun onDraw()

    abstract val cname:String

    val name:String
        get() = "几何图形"
}