package com.qd.kotlinlearning.chapter13.definedclass

interface D {


    fun methodA()
    fun methodB(): String

    fun methodC(): Int {
        return 0
    }

    fun methodD(): String {
        return "这是默认函数..."
    }
}