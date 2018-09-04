package com.qd.kotlinlearning.chapter11

import com.qd.kotlinlearning.chapter11.defined_classes.Animal

fun main(args: Array<String>) {
    val animal=Animal()
    println("比较大的数为:${animal.getMaxNumber(6,4)}")

}