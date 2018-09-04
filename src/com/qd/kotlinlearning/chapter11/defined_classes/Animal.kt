package com.qd.kotlinlearning.chapter11.defined_classes

class Animal {

    //年龄
    var age=1
    //性别
    var sex=false
    //体重
    private var weight=0.0

    //私有函数体
    private fun test()
    {

    }

    fun run():Int{
        return 20
    }

    fun getMaxNumber(n1: Int, n2: Int) = if (n1 > n2) n1 else n2

}