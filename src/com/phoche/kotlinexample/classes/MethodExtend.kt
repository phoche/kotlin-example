package com.phoche.kotlinexample.classes

/**
 * Create by qinpc on 2018/3/1
 */

/**
 * 扩展函数中 this 指代调用该方法的实例
 */
fun String.getStart(): String {
    var s = this
    if (s == null && s == "") {
        return ""
    } else {
        return s.substring(0, 3)
    }
}

/**
 * 扩展属性只能定义在类中或 kotlin 文件中, 不允许初始化, 只能显示提供 get/set 方法
 */
val <T> Array<T>.firstNum: Int
    get() = 0

fun main(args: Array<String>) {
    var s : String = "hello"
    println("s' start ${s.getStart()}")

    var arr = arrayOf(1, 2, 3)
    println("arr.size : ${arr.firstNum}")
}