package com.qd.kotlinlearning.chapter13

import com.qd.kotlinlearning.chapter13.definedclass.A
import com.qd.kotlinlearning.chapter13.definedclass.B
import com.qd.kotlinlearning.chapter13.definedclass.C
import com.qd.kotlinlearning.chapter13.definedclass.D

class AB:A,B
{
    override fun methodA() {

    }

    override fun methodB() {

    }

    override fun methodC() {

    }
}

class ABC:C
{
    override fun methodA() {

    }

    override fun methodB() {

    }

    override fun methodC() {

    }
}

class TestInterfaceD: D {

    override fun methodA() {

    }

    override fun methodB(): String {
        return "Test"
    }

    override fun methodC(): Int {
        return super.methodC()
    }

    override fun methodD(): String {
        return super.methodD()
    }



}

fun main(args: Array<String>) {

}