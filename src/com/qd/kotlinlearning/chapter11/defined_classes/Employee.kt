package com.qd.kotlinlearning.chapter11.defined_classes

/**
 * 属性本身并不真正的保存数据，数据被保存到支持字段（backing field）中，支持字段一般是不可见的，
 * 支持字段只能应用在属性访问器中，通过系统定义好的field变量访问。
 */
class Employee {

    var no: Int = 0           // 员工编号属性
    var job: String? = null     // 工作属性
    var firstName: String = "Tony"
    var lastName: String = "Guan"
    /**
     * 并不是所有的属性都有支持字段（backing field）的，例如上述代码中的fullName属性是通过另外属性计算而来，它没有支持字段，声明时不需要初始值。
     * 这种属性有点像是一个函数。这种属性在Swift语言中称为计算属性。
     */
    var fullName: String      //全名
        get() {
            return firstName + "." + lastName
        }
        set (value) {
            val name = value.split(".")
            firstName = name[0]
            lastName = name[1]
        }

    var salary: Double = 0.0    // 薪资属性
        set(value) {
            if (value >= 0.0) field = value
        }
}