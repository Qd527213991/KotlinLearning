package com.qd.kotlinlearning.chapter16

fun main(args: Array<String>) {

    /**
     * 不可变Map
     */

    val map1= mapOf(1 to "Jack",2 to "Rose")
    val map2= mapOf<Int,String>()
    val map3= mapOf<Int?,String?>(1 to "Kobe")

    println(map1[1])

    println(map1.isEmpty())

    println(map1.size)

    println(map1.containsKey(1))

    println(map1.containsValue("Alice"))

    println(map2.isEmpty())

    //for循环
    val keys=map1.keys
    for(key in keys)   print("key=$key,value=${map1[key]}   ")
    println()

    //迭代器
    val it=map3.iterator()

    while(it.hasNext())
    {
        val item=it.next()
        print("key=${item.key},value=${item.value}   ")
    }

    println()


    /**
     * 可变Map
     */
    val mapp1= mutableMapOf(1 to "Jerry",2 to "John")
    val mapp2= mutableMapOf<Int,String>()
    val mapp3= hashMapOf(1 to "pear",2 to "banana",3 to "orange")
    val mapp4= hashMapOf<Int,String>()

    mapp2.put(1,"aa");mapp2.put(2,"bb")

    println(mapp2.size)

    mapp4[1]="VVV";mapp4[2]="BBB";mapp4[3]="CCC"

    println(mapp4)

    mapp4.remove(1)

    println(mapp4)

    mapp2.clear()

    println(mapp2.isEmpty())





}