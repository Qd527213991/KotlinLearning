package com.qd.kotlinlearning.chapter11

import com.qd.kotlinlearning.chapter11.defined_classes.ClassForInner
import com.qd.kotlinlearning.chapter11.defined_classes.ClassForNested

fun main(args: Array<String>) {
    val nestedClass= ClassForNested()
    nestedClass.test()

    val innerClass= ClassForInner()
    innerClass.testSpecialInner()


}