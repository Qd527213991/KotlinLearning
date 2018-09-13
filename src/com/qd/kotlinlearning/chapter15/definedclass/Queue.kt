package com.qd.kotlinlearning.chapter15.definedclass

class Queue<T> {

    private val items:MutableList<T>
    init {
        this.items=ArrayList()
    }

    fun queue(item:T)
    {
        this.items.add(item)
    }

    fun deque():T?
    {
        return if (items.isEmpty()) {
            null
        } else {
            this.items.removeAt(0)
        }
    }

    override fun toString(): String {
        return this.items.toString()
    }


}