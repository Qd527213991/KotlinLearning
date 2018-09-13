package com.qd.kotlinlearning.chapter15


private fun isEqualString(a:String,b:String):Boolean
{
    return a==b
}

private fun isEqualInt(a:Int,b:Int):Boolean
{
    return a==b
}

private fun isEqualDouble(a:Double,b:Double):Boolean
{
    return a==b
}

//单类型参数
private fun <T>isEquals(a:T,b:T):Boolean
{
    return a==b
}


//多类型参数???
private fun<T,U>addRectangle(a:T,b:U):U{
    return b
}

//泛型约束
private fun<T:Number>isEquals2(a:T,b:T):Boolean
{
    return a==b
}

private fun<T:Any>isEquals3(a:T,b:T):Boolean{
    return a==b
}




fun main(args: Array<String>) {

    println(isEqualInt(6,5))
    println(isEquals(6,5))
    println(isEqualDouble(5.5,5.50))
    println(isEquals(5.5,5.50))
    println(isEqualString("aa","bb"))
    println(isEquals("aa","bb"))

    //由于指定了是Number类型，所以编译不通过
    //println(isEquals2("aa","bb"))
    println(isEquals2(2,4))

    //由于指定了非空，所以编译不通过
    //println(isEquals3(null,2))
    println(isEquals3(2.0,2))
    println(isEquals3("aa",2))
}