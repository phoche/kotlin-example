package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/2/27
 */
fun main(args: Array<String>) {
    equals(10, 10)
    equals(10, 20)

    typeChanger()
 }

fun equals(a: Int, b: Int) {
    println("三个等号比较$a 与 $b 的地址是否相同 ${a === b }")
    println("两个等号比较$a 与 $b 的大小是否相同 ${a == b }")
}

fun typeChanger() {
    var b:Byte = 2
//    var i: Int = b// 数据类型不能显示转换
    var l:Long = 2
    var i: Int = l.toInt()// 通过 toInt 方法转换
    println("$i")
}