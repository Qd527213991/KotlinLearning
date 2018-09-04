package com.qd.kotlinlearning.chapter11

import com.qd.kotlinlearning.chapter11.defined_classes.Teacher
import com.qd.kotlinlearning.chapter11.defined_classes.User2

fun main(args: Array<String>) {
    val teacher=Teacher()
    teacher.firstName="Mike"
    teacher.lastName="Jackson"
    println("full name:${teacher.lastName}")

    /**
     *
     * 延时初始化属性要求：不能是可空类型；只能使用为var声明；lateinit关键字应该放在var之前。
     */

    teacher.user= User2()
    val user=teacher.user
    println("name:${user.name},password:${user.password}")

}