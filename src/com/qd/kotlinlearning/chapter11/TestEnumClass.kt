package com.qd.kotlinlearning.chapter11

/**
 * 枚举类
 */
fun main(args: Array<String>) {

    val days=WeekDays.FRIDAY
    println(days)
    when(days)
    {
        WeekDays.MONDAY->println("星期一")
        WeekDays.TUESDAY->println("星期二")
        WeekDays.WEDNESDAY->println("星期三")
        WeekDays.THURSDAY->println("星期四")
        else->println("星期五")

    }

    val days2=WeekDays2.THURSDAY
    println(days2)


    /**
     * 枚举常用属性和函数
     * 枚举本身有一些函数和属性:
     * ordinal属性。返回枚举常量的顺序。这个顺序根据枚举常量声明的顺序而定，顺序从零开始。
     * values()函数。返回一个包含全部枚举常量的数组。
     * valueOf(value: String)函数。value是枚举常量对应的字符串，返回一个包含枚举类型实例。
     * 在普通类中===比较的是两个引用是否指向同一个对象，==是比较对象内容是否相同。但是，枚举引用类型中===和==都是一样的，
     * 都是比较两个引用是否指向同一个实例，枚举类中每个枚举常量无论何时都只有一个实例，即单例的。
     */
    val allValues=WeekDays2.values()
    for(value in allValues)
    {
        println("${value.ordinal}  $value")
    }

    val day1 = WeekDays2.FRIDAY
    val day2 = WeekDays2.valueOf("FRIDAY")

    println(day1==WeekDays2.FRIDAY)
    println(day1===WeekDays2.FRIDAY)
    println(day1===day2)

}

/**
 * Kotlin中是使用enum和class两个关键词声明枚举类
 */
enum class WeekDays {
    // 枚举常量列表
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY

}

/**
 * 枚举类构造函数
 * 枚举类中可以像其他类一样包含属性和函数，可以通过构造函数初始化属性。
 * 在枚举类中如果有其他属性或函数等成员时，枚举常量列表必须是类体中的第一行，而且语句结束一定不能省略分号（;）
 */
enum class WeekDays2(private val wname:String,private val index:Int)
{
    MONDAY("星期一",0), TUESDAY("星期二",1), WEDNESDAY("星期三",2), THURSDAY("星期四",3), FRIDAY("星期五",4);

    override fun toString(): String {
        return "$wname--$index"
    }

}


