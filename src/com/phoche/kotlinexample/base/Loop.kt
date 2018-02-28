package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/2/27
 */
fun main(args: Array<String>) {
    foreach()
    indexForeach()
}

/**
 * foreach 遍历
 */
fun foreach() {
    var arr = arrayOf(1, 2, 3, 4)
    for (i: Int in arr) {
        print("i = $i \t")
    }
    println("\n=====================")
}

/**
 * 通过索引遍历
 */
fun indexForeach() {
    var arr = arrayOf(11, 22, 33, 44)
    for (i in arr.indices) {
        print("i = ${arr[i]} \t")
    }
    println("\n----------------------")
    for ((index, value) in arr.withIndex()) {
        print("index = $index value = $value \t")
    }
    println("\n=====================")
}