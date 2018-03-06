package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/2/27
 */
fun main(args: Array<String>) {
    createArray()
}

/**
 * Array, IntArray, ByteArray, ShortArray
 * 创建数组的两种方式
 * 1,使用函数 arrayOf
 * 2,工厂函数
 */
fun createArray() {
    // [1, 2, 3]
    var arr1 = arrayOf(1, 2, 3)
    // [4, 6, 8]
    var arr2 = Array(3, {i -> ((i + 2) * 2)})

    // 中括号 [] 运算符重载了数组的 get() , set() 方法, 通过下表访问对应位置的值
    println(arr1[0])
//    println(arr1[3]) // java.lang.ArrayIndexOutOfBoundsException
    println(arr2[1])
}