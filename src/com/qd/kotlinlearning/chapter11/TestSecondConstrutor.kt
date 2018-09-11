package com.qd.kotlinlearning.chapter11

class Rectangle(var width: Int, var height: Int) {
    // 矩形面积
    var area: Int

    init {//初始化代码块
        area = width * height// 计算矩形面积
    }

    constructor(width: Int, height: Int, area: Int) : this(width, height) {
        this.area = area
    }

    constructor(area: Int) : this(200, 100) {//width=200 height=100
        this.area = area
    }
}

fun main(args: Array<String>) {
    val rect1 = Rectangle(100, 90)
    val rect2 = Rectangle(10, 9,900)
    val rect3 = Rectangle(20000)

    println("Rect1 area:${rect1.area}")
    println("Rect2 area:${rect2.area}")
    println("Rect3 area:${rect3.area}")
}