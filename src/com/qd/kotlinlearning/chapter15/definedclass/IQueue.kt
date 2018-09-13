package com.qd.kotlinlearning.chapter15.definedclass

interface IQueue<T> {

    fun queue(item:T)

    fun deque():T?
}