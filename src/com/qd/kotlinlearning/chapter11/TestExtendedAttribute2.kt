package com.qd.kotlinlearning.chapter11

fun main(args: Array<String>) {

    val message = (-7).errorMessage
    println("Error Code: -7 , Error Message:  $message")

    val dept = Department()
    dept.name ="智捷课堂"
    dept.no = 100
    println(dept.desc)

}

// 部门类
class Department {
    var no: Int = 0        // 部门编号属性
    var name: String = ""  // 部门名称属性
}

var Department.desc: String
    get() {
          return "Department [no=${this.no}, name=${this.name}]"
    }
    set(value) {
        println(value)
    }

val Int.errorMessage: String
    get() = when (this) {
         -7 -> "没有数据。"
         -6 -> "日期没有输入。"
         -5 -> "内容没有输入。"
        -4 -> "ID没有输入。"
        -3 -> "数据访问失败。"
        -2 -> "您的账号最多能插入10条数据。"
        -1 -> "用户不存在，请到http://51work6.com注册。"
    else -> ""
}