package com.qd.kotlinlearning.chapter26

import kotlin.reflect.full.superclasses

//声明数据类
data class Person(val name: String)

fun main(args: Array<String>) {

    //1.获得“类名::class”引用类
    val clz1 = Int::class
    val clz2 = Person::class
    val person = Person("Tom")
    //2.获得“对象::class”引用类
    val clz3 = person::class

    println("clz1类名：" + clz1.simpleName)
    println("clz1类全名：" + clz1.qualifiedName)

    println("clz2是否为抽象类或接口：" + clz2.isAbstract)
    println("clz2是否为数据类：" + clz2.isData)
    println("clz2所有成员：")
    clz2.members.forEach { println("   ${it.name}") }

    println("clz3父类名称：")
    clz3.superclasses.forEach {
        println("    ${it.simpleName}")
    }
}