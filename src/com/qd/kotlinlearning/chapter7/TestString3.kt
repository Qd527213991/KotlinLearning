package com.qd.kotlinlearning.chapter7

/**
 * 可变字符串
 */
fun main(args: Array<String>) {

    /**
     * 一、StringBuilder
     * 可变字符串在追加、删除、修改、插入和拼接等操作不会产生新的对象。
     * Kotlin提供可变字符串类是kotlin.text.StringBuilder，StringBuilder的中构造函数有4个：
     * (1) StringBuilder()。创建字符串内容是空的StringBuilder对象，初始容量默认为16个字符。
     * (2)  StringBuilder(seq: CharSequence)。指定CharSequence字符串创建StringBuilder对象。CharSequence接口类型，它的实现类有：String和StringBuilder等，所以参数seq可以是String和StringBuilder等类型。
     * (3) StringBuilder(capacity: Int)。创建字符串内容是空的StringBuilder对象，初始容量由参数capacity指定的。
     * (4)StringBuilder(str: String)。指定String字符串创建StringBuilder对象。
     */

    val  sb1=StringBuilder()
    println("字符串长度:${sb1.length}")
    println("字符串容量:${sb1.capacity()}")

    val s="Hello World"
    val sb2=StringBuilder(s)
    println("字符串长度:${sb2.length}")
    println("字符串容量:${sb2.capacity()}")

    val sb3=StringBuilder("Hello World")
    println("字符串长度:${sb3.length}")
    println("字符串容量:${sb3.capacity()}")

    val sb4=StringBuilder(20)
    sb4.append("Hello World AAA  BBB CCC DDD EEE")
    println("字符串长度:${sb4.length}")
    println("字符串容量:${sb4.capacity()}")

    /**
     * 二、字符串追加、插入、删除和替换
     * StringBuilder在提供了很多修改字符串的函数，追加、插入、删除和替换等，对应的函数分别是append、insert、delete和replace函数，
     * 这些函数不会产生新的字符串对象，而且它们的返回值还是StringBuilder。
     */

    //添加字符串  字符
    val sBuilder1=StringBuilder()
    sBuilder1.append("Hello").append(" ").append("World").append('.')
    println("StringBuilder1:$sBuilder1")

    //添加数组 对象  转移字符
    val obj:Any?=null
    val sBuilder2=StringBuilder()
    sBuilder2.append(obj).append(8).append('\t').append(10)
    println("StringBuilder2:$sBuilder2")

    //插入操作
    val sBuilder3=StringBuilder("Hello  World")
    sBuilder3.insert(6,"Java")
    println("StringBuilder3:$sBuilder3")

    //删除操作
    val sBuilder4=StringBuilder("Hello World")
    sBuilder4.delete(5,11)
    println("StringBuilder4:$sBuilder4")

}