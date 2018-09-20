package com.qd.kotlinlearning.chapter16

fun main(args: Array<String>) {

    /**
     * 不可变List
     */

    val list1= listOf("ABC")
    val list2= listOf<Long?>()
    val list3= listOf<Int?>(12,32,12,45)
    val list4=list3.subList(1,3)

    println("list1 size:${list1.size}")
    println("list2是否为空:${list2.isEmpty()}")
    println("list3是否包含12:${list3.contains(12)}")
    println("第一个出现的位置:${list3.indexOf(12)},最后一个出现的位置:${list3.lastIndexOf(12)}")

    //通过下标访问
    println(list3[0])

    //for循环
    for(item in list4) print("$item  ")
    println()

    //迭代器
    val iterable=list4.iterator()

    while(iterable.hasNext())
    {
        val item=iterable.next()
        print("$item  ")
    }

    println()

    /**
     *可变List
     */
    val arrayList1= arrayListOf("ABC")
    val arrayList2= arrayListOf<String?>()
    val arrayList3=arrayListOf<Int?>(12,34,12,45,75,90)
    val arrayList4= arrayList3.subList(1,3)

    println("添加之前，arrayList1的size:${arrayList1.size}")

    arrayList1.add("DEF")
    arrayList1.add("VBN")
    println("添加之后，arrayList1的size:${arrayList1.size}")

    arrayList1.clear()
    println("删除之后,arrayList1的size:${arrayList1.size},是否为空:${arrayList1.isEmpty()}")

    //for循环
    arrayList2.add("Jack")
    arrayList2.add("Rose")

    for(item in arrayList2) print("$item  ")
    println()

    //迭代器
    val iterator = arrayList4.iterator()
    while(iterator.hasNext())
    {
        val item=iterator.next()
        print("$item  ")
    }
    println()


    val mutableList1= mutableListOf("ABC")
    val mutableList2= mutableListOf<String?>()
    val mutableList3=mutableListOf<Int?>(12,34,12,45,75,90)
    val mutableList4= mutableList3.subList(1,3)

    println("添加之前，mutableList1的size:${mutableList1.size}")

    mutableList1.add("DEF")
    mutableList1.add("VBN")
    println("添加之后，mutableList1的size:${mutableList1.size}")

    mutableList1.clear()
    println("删除之后,mutableList1的size:${mutableList1.size},是否为空:${mutableList1.isEmpty()}")

    //for循环
    mutableList2.add("Jack")
    mutableList2.add("Rose")

    for(item in mutableList2) print("$item  ")
    println()

    //迭代器
    val iteratorr =mutableList4.iterator()
    while(iteratorr.hasNext())
    {
        val item=iteratorr.next()
        print("$item  ")
    }
    println()

}