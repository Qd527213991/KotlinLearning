package com.qd.kotlinlearning.chapter14


private fun calcu(c:Char):(Int,Int)->Int{
    val resu=when(c)
    {
        '+'->{a:Int,b:Int->a+b}
        '-'->{a:Int,b:Int->a-b}
        '*'->{a:Int,b:Int->a-b}
        else ->{a:Int,b:Int->a/b}
    }

    return resu
}

fun main(args: Array<String>) {

    val addFunc= calcu('+')
    println("4+3=${addFunc(4,3)}")

    val  subFunc= calcu('-')
    println("4-3=${subFunc(4,3)}")

    val mutFunc= calcu('*')
    println("4*3=${mutFunc(4,3)}")

    val divFunc= calcu('/')
    println("4/3=${divFunc(4,3)}")


}