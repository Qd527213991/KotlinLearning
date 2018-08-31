package com.qd.kotlinlearning.chapter7

/**
 * 正则表达式
 */
fun main(args: Array<String>) {

    /**
     * 一、Regex类
     * Kotlin提供的正则表达式类是kotlin.text.Regex。创建Regex对象可以通过如下两种方式：通过构造函数创建。
     * Regex 默认构造函数是Regex(pattern: String)，其中pattern是正则表达式模式字符串。使用toRegex()扩展函数。
     * String提供扩展函数toRegex()返回Regex对象。
     */


    val pattern = """\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}"""

    val string = "eoreint@sina.com"
    val regex = pattern.toRegex()
    println(regex.matches(string))


    val string2="1234676@qq.com"
    val regex2=Regex(string2)
    println(regex2.matches(string2))


    /**
     * 二、字符串匹配
     * 正则表达式通过字符串匹配能够字符串格式的有效性，例如：邮箱、日期、电话号码等格式的有效性。Regex通过的正则表达式字符串匹配相关函数如下:
     * matches(input: CharSequence): Boolean。精确匹配函数，测试输入字符串是否完全匹配正则表达式模式。
     * containsMatchIn(input: CharSequence): Boolean。包含匹配函数，测试输入字符串是否部分匹配正则表达式模式。　
     */

    //全部是数字模式
    val regex3 = Regex("""\d+""")

    val input1 = "1000"
    val input2 = "￥1000"

    println(regex3.matches(input1))//true
    println(regex3.matches(input2))//false

    println(regex3.containsMatchIn(input1))//true
    println(regex3.containsMatchIn(input2))//true

    /**
     * 三、字符串查找
     *
     * 正则表达式还经常用于字符串查找。Regex中字符串查找相关函数如下：
     * find(input: CharSequence, startIndex: Int): MatchResult?。查找第一个匹配模式的字符串，返回MatchResult?类型。
     * findAll(input: CharSequence, startIndex: Int): Sequence。查找所有匹配模式的字符串，返回Sequence类型，Sequence是可进行迭代集合类型，其中可以放置的元素是MatchResult类型。
     */

    val string3 = "AB12CD34EF"

    val regex4 = Regex("""\d+""")
    val result = regex4.find(string3)
    println("第1个匹配字符串：${result?.value}")

    regex4.findAll(string3).forEach { e ->
        println("匹配的字符串:${e?.value}")
    }


    /**
     * 四、字符串替换
     * 正则表达式还经常用于字符串替换。Regex中字符串替换相关函数如下：
     * replace(input: CharSequence, replacement: String): String。input参数是输入字符串，replacement要替换的新字符串，返回值替换之后的字符串。
     */
    val string4= "AB12CD34EF"
    val regex5= Regex("""\d+""")
    val result2= regex5.replace(string4, " ")
    println(result2)//AB CD EF


    /**
     * 五、字符串分割
     * 正则表达式还经常用于字符串替换。Regex中字符串替换相关函数如下：
     * replace(input: CharSequence, replacement: String): String。input参数是输入字符串，replacement要替换的新字符串，返回值替换之后的字符串。
     */
    val string5 = "AB12CD34EF"
    val regex6= Regex("""\d+""")

    val result3= regex6.split(string5)
    println(result3) //[AB, CD, EF]


}