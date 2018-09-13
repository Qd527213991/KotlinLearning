package com.qd.kotlinlearning.chapter15

val <T>ArrayList<T>.first:T?
    get() = if(this.size>1) this[0] else null

val <T>ArrayList<T>.second:T?
    get() = if(this.size>2) this[1] else null

fun main(args: Array<String>) {

    val array1=ArrayList<Int>()
    //都为null
    println(array1.first)
    println(array1.second)

    val array2= arrayListOf("AA","BB","CC","DD")

    println(array2.first)
    println(array2.second)
}

