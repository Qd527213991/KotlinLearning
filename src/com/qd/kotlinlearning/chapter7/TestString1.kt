package com.qd.kotlinlearning.chapter7


fun main(args: Array<String>) {

    /**
     * 字符串字面量
     * 1.普通字符串 使用双引号(")包裹起来的字符串
     * 2.原始字符串 采用三引号(""")包裹起来的字符串
     */

    val str2= "Hello World"
    val str3= "\u0048\u0065\u006c\u006c\u006f\u0020\u0057\u006f\u0072\u006c\u0064"
    //str2等于str3  UniCode编码对应着普通字符
    println(str2==str3)

    val str4="Hello\nWorld"
    val str5="""Hello
World"""

    //相等
    println(str4==str5)

    val str6="""Hello\nWorld"""

    //并不会换行
    println(str6)

}

