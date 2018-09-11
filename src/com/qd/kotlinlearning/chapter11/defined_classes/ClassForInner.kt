package com.qd.kotlinlearning.chapter11.defined_classes

class ClassForInner {

    private val x=20

    fun printOuter()
    {
        println("print Outer")
    }

    inner  class SpecialInnerClass
    {
        val x=10

        fun testInner()
        {
            println("内部类的属性:$x")
            println("内部类的属性:${this.x}")
            println("外部类的属性:${this@ClassForInner.x}")

            //调用外部方法
            printOuter()

            this@ClassForInner.printOuter()
        }
    }

    fun testSpecialInner()
    {
        val inner=SpecialInnerClass()
        inner.testInner()
    }
}