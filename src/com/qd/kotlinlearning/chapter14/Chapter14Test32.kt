package com.qd.kotlinlearning.chapter14


fun calculatePrint(a:Int,b:Int,c:Char,d:(Int,Int)->Int)
{
    println("$a$c$b=${d(a,b)}")
}
fun main(args: Array<String>) {

    calculatePrint(4,3,'+'){a:Int,b:Int->a+b}

    calculatePrint(4,3,'-'){a,b->a-b}

    calculatePrint(4,3,'*'){a,b->a*b}

    calculatePrint(4,3,'/'){a,b->a/b}
}