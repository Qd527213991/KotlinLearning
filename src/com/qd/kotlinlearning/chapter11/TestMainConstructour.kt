package com.qd.kotlinlearning.chapter11

class Animal(val age: Int = 0, val sex: Boolean = false)

fun main(args: Array<String>) {
    val animal1 = Animal()
    val animal2 = Animal(10)
    val animal3 = Animal(sex = true)
    val animal4 = Animal(10,true)
}