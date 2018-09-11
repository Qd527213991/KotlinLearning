package com.qd.kotlinlearning.chapter11

class View
{
    fun handle(listener: OnClickListener)
    {
        listener?.onClick()
    }

}

interface OnClickListener{
    fun onClick()
}

/**
 * 对象表达式
 *
 */
fun main(args: Array<String>) {
    val c=View()
    c.handle(object :OnClickListener{
        override fun onClick() {
            println("OnClickListener click")
        }

    })

    //使用对象表达式赋值
    val person=object :Person("dd",27),OnClickListener{
        override fun onClick() {
            println("Person OnClick")
        }

        override fun toString(): String {
            return "$name--$age"
        }
    }

    println(person)

    //无具体父类对象表达式
    val rectangle=object {
        var width:Int=400
        var height:Int=300

        override fun toString(): String {
            return "[width=$width,height=$height]"
        }
    }

    println(rectangle)
}

open class Person(val name:String,val age:Int)