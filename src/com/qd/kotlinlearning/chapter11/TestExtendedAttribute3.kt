package com.qd.kotlinlearning.chapter11

// 部门类
class Department2 {
    var no: Int = 0        // 部门编号属性
    var name: String = ""  // 部门名称属性
    var desc: String = "成员：${no} - ${name}"  // 描述属性

    fun display() : String {
        return  "成员: [no=${this.no}, name=${this.name}]"
    }
}

val Department2.desc: String
get() {
    return "扩展: [no=${this.no}, name=${this.name}]"
}

fun Department2.display() : String {
    return  "扩展: [no=${this.no}, name=${this.name}]"
}

fun Department2.display(f: String): String {
    return "扩展: $f, [no=${this.no}, name=${this.name}] "
}

fun main(args: Array<String>) {

    val dept = Department2()
    dept.name = "智捷课堂"
    dept.no = 100

    println(dept.desc)
    println(dept.display())
    println(dept.display("My"))

}