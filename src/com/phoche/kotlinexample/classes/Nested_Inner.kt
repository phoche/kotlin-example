package com.phoche.kotlinexample.classes

/**
 * Create by qinpc on 2018/2/28
 */
class Outer {

    var out: String = "outer class"

    fun foo() {
        println("外部类的方法")
    }

    class Nested {
        fun foo_nasted() {
            println("嵌套类的方法")
        }
    }

    inner class Inner {

        var our = this@Outer

        fun foo() {
            println("内部类的方法")
            println("内部类有外部类的对象 " + our.out)
        }

    }

    fun test(impe: IInterface) {
        impe.run()
    }
}

interface IInterface {
    fun run()
}

fun main(args: Array<String>) {
    var nesterClass = Outer.Nested()
    nesterClass.foo_nasted()

    var innClass = Outer().Inner()
    innClass.foo()

    Outer().test(object : IInterface {
        override fun run() {
            println("对象表达式创建的匿名内部类")
        }
    })
}