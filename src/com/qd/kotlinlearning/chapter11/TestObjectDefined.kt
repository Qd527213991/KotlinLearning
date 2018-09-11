package com.qd.kotlinlearning.chapter11

interface DaoInterface{
    fun findAll():Array<Any>?
    fun create():Int
}

object UserDao:DaoInterface
{
    private val arrays:Array<Any>?=null

    override fun findAll(): Array<Any>? {

        return arrays
    }

    override fun create(): Int {
//        object Singleton {
//            val x = 10
//        }
        return 0
    }

    object SingleTon{
        val x=10
    }
}


fun main(args: Array<String>) {

    UserDao.create()
    var datas=UserDao.findAll()

}