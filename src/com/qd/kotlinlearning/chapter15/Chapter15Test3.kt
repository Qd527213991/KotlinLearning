package com.qd.kotlinlearning.chapter15

import com.qd.kotlinlearning.chapter15.definedclass.Queue


fun main(args: Array<String>) {
    val queue= Queue<String>()
    println(queue.deque())
    queue.queue("A")
    queue.queue("B")
    queue.queue("C")
    println(queue.deque())
    println(queue)


}