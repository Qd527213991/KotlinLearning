package com.qd.kotlinlearning.chapter17

/**
 * 遍历操作
 */
fun main(args: Array<String>) {

    val array= arrayOf(1,2,3,4)

    val arraylist= arrayListOf("aa","bb","cc","dd")

    val set= setOf("cc","dd","ee")

    val map= mapOf(1 to "Jack",2 to "marry")


    array.forEach {
        print("$it ")
    }
    println()

    arraylist.forEach {
        print("$it ")
    }

    println()

    set.forEach {
        print("$it ")
    }

    println()

    map.forEach{
        k,v->print("key:$k,value:$v")
    }

    println()

    map.forEach{
        print("key:${it.key},value:${it.value}")
    }

    println()

    array.forEachIndexed { index, i ->
        print("$index-$i  ")
    }






}