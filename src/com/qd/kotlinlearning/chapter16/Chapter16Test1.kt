package com.qd.kotlinlearning.chapter16

fun main(args: Array<String>) {

    /**
     * 1.对象数组
     */

    val intArray1= arrayOf(12,45,65,89)

    val strArray1= arrayOf("apple","pear","orange")

    val strArray2= arrayOfNulls<String>(4)

    strArray2[0]="Jack"
    strArray2[1]="Rose"
    strArray2[2]="James"
    strArray2[3]="Kobe"

    val intArray2=Array<Int>(10){i -> i*i }

    val intArray3=Array<Int?>(10){ it*it*it }

    //遍历集合
    for (item in intArray2) {
        print("$item  ")
    }

    println()

    for(item in intArray1) print("$item  ")

    println()

    for(item in intArray3) print("$item  ")

    println()


    for (idx in strArray1.indices) {
        print(strArray1[idx]+" ")
    }

    println()

    /**
     * 2.基本数据类型数组
     */

    val intArrayy1= intArrayOf(12,34,56,78)

    val charArray1= charArrayOf('h','e','l','l','o')

    val intArrayy2= IntArray(10){i ->i*i  }

    val intArrayy3=IntArray(10){it*it*it}

    for(item in intArrayy1) print("$item ")
    println()

    for(item in charArray1) print("$item ")
    println()

    for(item in intArrayy2) print("$item ")
    println()

    for(idx in intArrayy3) println(intArrayy3[idx])




}