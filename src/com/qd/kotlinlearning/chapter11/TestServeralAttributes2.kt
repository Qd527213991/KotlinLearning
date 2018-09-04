package com.qd.kotlinlearning.chapter11

import kotlin.reflect.KProperty

class User {
    var name: String by Delegate()

    var password:String by Delegate2()
}

class Delegate {
    operator fun getValue(thisRef: Any, property: KProperty<*>): String = property.name

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println(value)
    }
}

class Delegate2 {
    operator fun getValue(thisRef: Any, property: KProperty<*>): String =property.name

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println(value)
    }
}



fun main(args: Array<String>) {
    val user = User()
    user.name = "Tom"
    println(user.name)

    user.password="123456"
    println(user.password)
}