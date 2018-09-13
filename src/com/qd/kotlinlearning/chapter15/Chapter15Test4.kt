package com.qd.kotlinlearning.chapter15

import com.qd.kotlinlearning.chapter15.definedclass.ListQueue

fun main(args: Array<String>) {
    val listQueue=ListQueue<String>()
    println(listQueue.deque())
    listQueue.queue("AA")
    listQueue.queue("BB")
    listQueue.queue("CC")
    println(listQueue)
    println(listQueue.deque())
    println(listQueue)

}