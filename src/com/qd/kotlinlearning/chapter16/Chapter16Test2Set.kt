package com.qd.kotlinlearning.chapter16

fun main(args: Array<String>) {

    /**
     * 1.不可变Set集合
     */

    val set1= setOf<Long?>()

    val set2= setOf("ABC")

    val set3= setOf(12,23,14)

    val set4= setOf<Char?>('h','e','l','l','o')

    println(set1.isEmpty())
    println(set2.size)

    //for循环
    println("for循环的结果:")
    for(item in set3) print("$item  ")
    println()

    //迭代器
    val iterable = set4.iterator()
    while(iterable.hasNext())
    {
        val item=iterable.next()
        print("$item  ")
    }
    println()

    /**
     * 2.可变的Set集合
     */
    val sett1= mutableSetOf<String>()

    val sett2= mutableSetOf(12,34,54,12)

    val sett3= hashSetOf<Long?>()
    val sett4= hashSetOf(12,34,54,12)

    val b="B"

    sett1.add("A")
    sett1.add(b)
    sett1.add("C")
    sett1.add("D")
    sett1.add(b)


    println(sett1.size)

    sett1.remove(b)

    println("sett1 contains:${sett1.contains(b)}")
    println(sett1)

    sett1.clear()

    println("sett1 is empty:${sett1.isEmpty()}")

    println("sett2 is empty:${sett2.isEmpty()}")


    sett3.add(13)
    sett3.add(34)
    sett3.add(54)
    sett3.add(12)

    //for循环
    for(item in sett3) print("$item  ")

    println()

    //迭代器
    val iterator=sett4.iterator()

    while(iterator.hasNext())
    {
        val item=iterator.next()
        print("$item  ")
    }
    println()

}