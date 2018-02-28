package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/2/27
 */
fun main(args: Array<String>) {
    ifFunction()
    inRange()
    whenFunction()
}

/**
 * if 条件语句
 */
fun ifFunction() {
    var a = 10
    var b = 20
    val max = if (a < b) {
        b
    } else {
        a
    }
    println("max = $max")
    println("=========================")
}

/**
 * 判断区间
 */
fun inRange() {
    var a = 10
    var b = 11
    if (a in 1..10) {
        println("a 在 1~10 之间")
    }

    if (b in 1..10) {
        println("b 在 1~10 之间")
    }
    println("=========================")
}

fun whenFunction() {
    var a = 10
    when (a) {
        10 -> println("a == 10")
        in 1..10 -> println("a in 1~10")
        else -> println("out of range")
    }

    var b = when(a) {
        !in 11..20 -> 1
        else -> 0
    }
    println("b = $b")


    var arr = arrayOf("apple", "orange", "pear")
    when {
        "peach" in arr -> println("peach")
        "orange" in arr -> println("I'll eat orange tonight")
    }
    println("=========================")
}
