package com.qd.kotlinlearning.chapter14


fun alphabetApply():String=StringBuffer().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I know the alphabet")
}.toString()

fun main(args: Array<String>) {

    val arr= with(arrayListOf<String>())
    {
        add("AA")
        add("BB")
        add("CC")
        add("DD")
        this
    }

    println(arr.size)

    println(arr)




    println(alphabetApply())



}