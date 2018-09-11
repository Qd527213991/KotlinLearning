package com.qd.kotlinlearning.chapter11.defined_classes

class Rectangle constructor(w:Int,h:Int) {

    // 矩形宽度
    var width: Int
    // 矩形高度
    var height: Int
    // 矩形面积
    var area: Int

    init {   //初始化代码块
        width = w
        height = h
        area = w * h// 计算矩形面积
    }
}