package com.qd.kotlinlearning.chapter10

/**
 * Kotlin中的函数参数很灵活，具体体现在传递参数有多种形式上。
 */
fun main(args: Array<String>) {

    /**
     * 1.使用命名参数调用函数
     *
     */
    printArea(320.0, 480.0)    //没有采用命名参数函数调用
    printArea(width = 320.0, height = 480.0)//采用命名参数函数调用
    printArea(320.0, height = 480.0)//采用命名参数函数调用
    //printArea(width = 320.0,  480.0) //编译错误
    printArea(height = 480.0, width = 320.0)//采用命名参数函数调用


    /**
     * 2.参数默认值
     * 在声明函数的时候可以为参数设置一个默认值，当调用函数的时候可以忽略该参数。
     */
    val coffee1 = makeCoffee("拿铁")
    val coffee2 = makeCoffee()

    println(coffee1)//制作一杯拿铁咖啡。
    println(coffee2)//制作一杯卡布奇诺咖啡。

    /**
     * 3.可变参数
     * Kotlin中函数的参数个数可以变化，它可以接受不确定数量的输入类型参数（这些参数具有相同的类型），有点像是传递一个数组。可以通过在参数名前面加vararg关键字的方式来表示这是可变参数。
     * 注意:可变参数不是最后一个参数时，后面的参数需要采用命名参数形式传递。代码第①行30.0, 80.0是可变参数，后面multiple参数需要命名参数形式传递。
     */
    println(sum(100.0, 20.0, 30.0))      //输出151.0
    println(sum(30.0, 80.0))        //输出111.0
    println(sum(30.0, 80.0, multiple = 2))   //输出222.0

    val doubleAry = doubleArrayOf(50.0, 60.0, 0.0)
    println(sum(30.0, 80.0, *doubleAry)) //输出221.0



}

fun printArea(width: Double, height: Double): Unit {
    val area = width * height
    println("$width x $height 长方形的面积:$area")
}

fun makeCoffee(type: String = "卡布奇诺"): String {
    return "制作一杯${type}咖啡。"
}

fun sum(vararg numbers: Double, multiple: Int = 1): Double {
    var total = 0.0
    for (number in numbers) {
        total += number
    }
    return total * multiple+multiple
}