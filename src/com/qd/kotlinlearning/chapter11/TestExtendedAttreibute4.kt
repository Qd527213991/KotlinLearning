package com.qd.kotlinlearning.chapter11

//定义中缀函数interestBy
infix fun Double.interestBy2(interestRate: Double): Double {
    return this * interestRate
}

// 部门类
class Department3 {
    var no: Int = 10

    //定义中缀函数rp
    infix fun rp(times: Int) {
        repeat(times) {
            println(no)
        }
    }
}

fun main(args: Array<String>) {

    //函数调用
    val interest1 = 10_000.00.interestBy(0.0668)
    println("利息1: $interest1")

    //中缀运算符interestBy
    val interest2 = 10_000.00 interestBy2 0.0668
    println("利息1: $interest2")

    val dept = Department3()
    dept rp 3 //中缀运算符rp
}