package com.qd.kotlinlearning.chapter11.defined_classes

class ClassForNested {

    //外部类属性
    private val x=20

    class NestedClass
    {
        fun onClick()
        {
            println("OnClick")
        }
    }

    fun test()
    {
        println("x的值为:$x")
        val inner= NestedClass()
        inner.onClick()

    }
}