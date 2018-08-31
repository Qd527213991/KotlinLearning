package com.qd.kotlinlearning.chapter11

fun main(args: Array<String>) {

    //创建User对象
    val user1 = User("Tony", "123")
    val user2 = User("Tony", "123")

    println(user1 == user2) //true
    println(user1.toString()) //User(name=Tony, password=123)
    println(user2.toString()) //User(name=Tony, password=123)

    println(user1.hashCode())  //81040716
    println(user2.hashCode())  //81040716

    //创建User对象
    val user11 = User("Tony", "123")
    //复制User对象
    val user12 = user11.copy(name = "Tom")
    val user13 = user11.copy()

    println(user11 == user12)   //false
    println(user11 == user13)   //true
    println(user11.toString()) //User(name=Tony, password=123)
    println(user12.toString()) //User(name=Tom, password=123)
    println(user13.toString()) //User(name=Tony, password=123)

    println(user11.hashCode())  //81040716
    println(user12.hashCode())  //2661184
    println(user13.hashCode())  //2661184

    //创建User对象
    val userr1 = User("Tony", "123")
    //解构
    val(name1,pwd1) = userr1
    println(name1)  //Tony
    println(pwd1)   //123
    val(name2, _) = userr1    //省略解构password
    println(name2)  //Tony
    println("name1:$name1,pwd1:$pwd1")
}