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


    /**
     * 四、字符串查找
     * 在String类中提供了indexOf和lastIndexOf函数用于查找字符或字符。indexOf函数从前往后查找字符或字符串，返回第一次找到字符或字符串所在处的索引，没有找到返回-1。
     * lastIndexOf函数从后往前查找字符或字符串，返回第一次找到字符或字符串所在处的索引，没有找到返回-1。
     * 默认情况下，是不忽略大小写的
     */



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

    /**
     * 五、字符串比较
     * 字符串比较是常见的操作，包括比较相等、比较大小、比较前缀和后缀等。
     */

    //TODO:比较相等：在字符串比较时默认是比较两个字符串中内容是否相等，使用equals函数、==运算符和!=运算符进行比较，事实上==和!=运算符在底层还是调用equals函数进比较的。

    val as1="HaHa"
    val as2="haha"
    println("是否相等（不忽略大小写）:${as1.equals(as2,false)}")
    println("是否相等（忽略大小写）:${as1.equals(as2,true)}")

    //TODO:比较大小：String提供的比较大小的函数是compareTo。compareTo函数按字典顺序比较两个字符串。如果当前字符串等于参数字符串，则返回值 0；如果当前字符串位于参数字符串之前，则返回一个小于 0 的值；如果当前字符串位于参数字符串之后，则返回一个大于 0 的值。
    val  as3="aaa"
    val  as4="BBB"
    val as5="AAA"
    println("比较大小(不忽略大小写):${as3.equals(as5,false)}")
    println("比较大小（忽略大小写）:${as3.equals(as5,true)}")
    println("比较俩不相同的串:${as3.equals(as4,false)}")

    //TODO:比较前缀和后缀 startsWith函数是测试此字符串是否以指定的前缀开始。 endsWith函数是测试此字符串是否以指定的后缀结束。
    val url="Https://www.baidu.com"
    println("是否以https开头(不忽略大小写):${url.startsWith("https")}")
    println("是否以https开头(忽略大小写):${url.startsWith("https",true)}")
    println("是否以com结尾(不忽略大小写):${url.endsWith("com")}")
    println("是否以com结尾(忽略大小写):${url.endsWith("com",true)}")

    /**
     * 六、字符串截取
     * 字符串截取有三个版本:
     * (1) 指定整数区间截取字符串函数：String.substring(range: IntRange): String
     * (2) 从指定索引startIndex开始截取一直到字符串结束的子字符串：fun String.substring(startIndex: Int): String
     * (3) 从指定索引startIndex开始截取直到索引endIndex - 1处的字符，注意包括索引为startIndex处的字符，但不包括索引为endIndex处的字符：fun String.substring(startIndex: Int, endIndex: Int): String
     */


    val st="This is why we play?"
    println("从串中挑出的字符:${st.substring(3..9)}")
    println("从第三个字符截取字符串:${st.substring(2)}")
    println("截取4到9的对应的字符串:${st.substring(3,9)}")


}



