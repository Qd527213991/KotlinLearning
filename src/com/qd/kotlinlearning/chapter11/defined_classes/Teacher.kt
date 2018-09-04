package com.qd.kotlinlearning.chapter11.defined_classes

class Teacher {

    lateinit var  user:User2

    var firstName:String?=null

    var lastName:String?=null

    var fullName:String
        get() = "$firstName.$lastName"
        set(value) {
            val name = value.split(".")
            firstName = name[0]
            lastName = name[1]
        }
}