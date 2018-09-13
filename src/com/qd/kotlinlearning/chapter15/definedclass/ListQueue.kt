package com.qd.kotlinlearning.chapter15.definedclass

class ListQueue<T>:IQueue<T>{

    private val items:MutableList<T>

    init {
        this.items=ArrayList()
    }

    override fun queue(item: T) {

        this.items.add(item)

    }

    override fun deque(): T? {
        return if(items.isEmpty()) null else items.removeAt(0)
    }

    override fun toString(): String {
        return this.items.toString()
    }
}