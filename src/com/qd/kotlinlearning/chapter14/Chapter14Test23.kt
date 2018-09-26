package com.qd.kotlinlearning.chapter14


fun getRectangleArea(a:Int,b:Int):Int=a*b

fun getTraArea(bottom:Int,height:Int):Int=bottom*height/2

fun getArea(type:String):(Int,Int)->Int{

    val res:(Int,Int)->Int=
            when(type){
                "rect"->::getRectangleArea
                else ->::getTraArea
            }

    return res

}
fun main(args: Array<String>) {



    println("40*30的矩形的面积是:${ getArea("rect")(40,30)}")

    val tr= getArea("tra")
    println("三角形的面积:${tr(40,30)}")


}