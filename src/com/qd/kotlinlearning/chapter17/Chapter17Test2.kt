package com.qd.kotlinlearning.chapter17

data class User(var name:String,var password:String)

data class Song(val title:String,val durations:Int)

fun main(args: Array<String>) {

    val users= listOf(
        User("Tom","123456"),
        User("Jack","123456"),
        User("Tony","654321"))

    users.filter { it.name.startsWith("t", ignoreCase = true) }
            .forEach { print(it.password) }

    println()

    users.filter { it.name.length>=4 }
            .map { it.name }
            .forEach { print("$it  ") }

    println()

    val songs= listOf(Song("Monster",100),
            Song("Sweety",200),
            Song("Hero",240))

    val result=songs.map { it.durations }
            .reduce { acc, i ->
                acc+i
            }

    println("The above songs:$result")

    val users2= listOf(
            null,
            User("Cris","1235567")
    )

    println(users2.filterNotNull())
}