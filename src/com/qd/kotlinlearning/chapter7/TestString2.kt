package com.qd.kotlinlearning.chapter7

import java.util.*

/**
 * 在Kotlin中默认的字符串类是String，String是一种不可变字符串，当字符串进行拼接等修改操作时，
 * 会创建新的字符串对象，而可变字符串不会创建新对象。在Kotlin中可变字符串类是StringBuilder。
 */
fun main(args: Array<String>) {

    /**
     * 一、获取字符串
     * 获取String有两种方式:1.字符串字面值
     * 2.使用转换函数 转换函数都是顶层函数，不需要对象就可以直接使用，具体分为三种：
     * (1) 字节数组转换  (2)字符数组转换  (3)StringBuilder转换
     */

    val chars= charArrayOf('a','b','c','d','e','f','g')

    //输出真个chars
    val str1=String(chars)
    println(str1)
    //输出2-5字符
    val str2=String(chars,1,4)
    println(str2)

    val bytes= byteArrayOf(99,100,101,102)
    //输出全部
    val str3=String(bytes)
    println(str3)
    //输入2-3字节
    val str4=String(bytes,1,2)
    println(str4)

    //使用StringBuilder
    val sb=StringBuilder()
    sb.append("Hello ")
    sb.append("wolrd")


    val str5=String(sb)
    println(str5)

    /**
     * 二、拼接字符串
     * String字符串虽然是不可变字符串，但也可以进行拼接，只是会产生一个新的对象。
     * String字符串拼接可以使用+和+=运算符。+和+=运算符是可以连接任何类型数据拼接成为字符串。
     */

    val s1="Hello"
    val s2=s1+" World"
    //Hello World
    println(s2)

    var s3="Hello"
    s3+=" World"
    //Hello World
    println(s3)

    val age=20

    val s4="年龄:"+age
    //年龄：20
    println(s4)

    val grade='A'
    val s5="成绩:"+grade
    //成绩:A
    println(s5)

    val date=Date()
    //自动调用对象的toString方法
    val s6="当前日期是:"+date
    println(s6)

    /**
     * 三、字符串模板
     * 字符串拼接对于字符串追加和连接是比较方便，但是如果字符串中有很多表达式结果需要连接起来，采用字符串拼接就有点力不从心了。
     * 此时可以使用字符串模板，它是可以将一些表达式结果在运行时插入到字符串中。
     * 字符串模板是以$开头，语法如下: $变量或常量   ${表达式}  //任何表达式，也可以是单个变量或常量
     */

    val height=178

    val ss1="他的身高为:$height"
    println(ss1)

    val score='A'
    val ss2="她的成绩等级为:$score"
    println(ss2)

    val name="Jack"
    val ss3="他的英文名字:$name"
    println(ss3)

    val dateNow=Date()
    println("当前日期:${dateNow.year+1900}.${dateNow.month}.${dateNow.day}")



    val sourceStr = "There is a string accessing example."
    val len = sourceStr.length //获得字符串长度
    val ch = sourceStr[16]  //获得索引位置16的字符

    //查找字符和子字符串
    val firstChar1 = sourceStr.indexOf('r')
    val lastChar1 = sourceStr.lastIndexOf('r',ignoreCase = true)
    val firstStr1 = sourceStr.indexOf("ing")
    val lastStr1 = sourceStr.lastIndexOf("ing")
    val firstChar2 = sourceStr.indexOf('e', 15)
    val lastChar2 = sourceStr.lastIndexOf('e', 15)
    val firstStr2 = sourceStr.indexOf("ing", 5)
    val lastStr2 = sourceStr.lastIndexOf("ing", 5)

    println("原始字符串:$sourceStr")
    println("字符串长度:$len")
    println("索引16的字符:$ch")
    println("从前往后查找r字符，第一次找到它所在索引:$firstChar1")
    println("从后往前查找r字符，第一次找到它所在索引:$lastChar1")
    println("从前往后查找ing字符串，第一次找到它所在索引:$firstStr1")
    println("从后往前查找ing字符串，第一次找到它所在索引:$lastStr1")
    println("从索引为15位置开始，从前往后查找e字符，第一次找到它所在索引:$firstChar2")
    println("从索引为15位置开始，从后往前查找e字符，第一次找到它所在索引:$lastChar2")
    println("从索引为5位置开始，从前往后查找ing字符串，第一次找到它所在索引:$firstStr2")
    println("从索引为5位置开始，从后往前查找ing字符串，第一次找到它所在索引:$lastStr2")

}



