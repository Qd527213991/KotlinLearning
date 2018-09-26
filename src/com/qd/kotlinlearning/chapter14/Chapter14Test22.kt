package com.qd.kotlinlearning.chapter14

fun calculate(opr:Char):(Int,Int)->Int{

    fun add(a:Int,b:Int):Int=a+b

    fun sub(a:Int,b:Int):Int=a-b

    val result: (Int, Int) -> Int =
            when(opr)
            {
                '+'->::add
                '-'->::sub
                '*' -> {
                    //乘法匿名函数
                    fun(a: Int, b: Int): Int=a*b
                }
                else -> { a, b ->a/b }
            }

    return result

}

fun main(args: Array<String>) {

    val f1 = calculate('+')
    println(f1(10, 5))  //调用f1变量
    val f2 = calculate('-')
    println(f2(10, 5))
    val f3 = calculate('*')
    println(f3(10, 5))
    val f4 = calculate('/')
    println(f4(10, 5))

}