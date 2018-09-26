package com.qd.kotlinlearning.chapter14

fun makeArray(): (Int) -> Int {

    var ary = 0

    //局部函数捕获变量
    fun add(element: Int): Int {
        ary += element
        return ary
    }

    return ::add

}


fun makeArray2(): (Int) -> Int {

    var ary = 0

    //匿名函数形式捕获变量
    return fun(element: Int): Int {
        ary += element
        return ary
    }


}

fun makeArray3(): (Int) -> Int {

    var ary = 0

    //Lambda表达式形式捕获变量
    return { element ->
        ary += element
        ary
    }

}


fun main(args: Array<String>) {

    val f1 = makeArray()
    println("---f1---")
    println(f1(10))//累加ary变量，输出结果是10
    println(f1(20))//累加ary变量，输出结果是30
    println(f1(30))//累加ary变量，输出结果是60

    println("---f2---")
    val f2= makeArray2()
    println(f2(10))//累加ary变量，输出结果是10
    println(f2(20))//累加ary变量，输出结果是30
    println(f2(30))//累加ary变量，输出结果是60

    println("---f3---")
    val f3= makeArray3()
    println(f3(10))//累加ary变量，输出结果是10
    println(f3(20))//累加ary变量，输出结果是30
    println(f3(30))//累加ary变量，输出结果是60


}
