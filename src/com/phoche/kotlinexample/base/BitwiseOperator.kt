package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/2/27
 */
fun main(args: Array<String>) {
    shiftLeft()
    shiftRight()
    unShiftRight()
    and()
    or()
    xor()
    inv()
}

/**
 * 左位移 <<
 */
fun shiftLeft() {
    println("======================")
    var a = 16
    println("$a << 2 = ${a shl 2}")
}

/**
 * 右位移
 */
fun shiftRight() {
    println("======================")
    var a = 16
    println("$a >> 2 = ${a shr 2}")
}

/**
 * 无符号位移
 */
fun unShiftRight() {
    println("======================")
    var a = 16
    println("$a >>> 2 = ${a ushr 2}")
}

/**
 * 为与
 */
fun and() {
    println("======================")
    var a = true
    var b = false
    println("$a & $b = ${a and b}")
    println("$a & $a = ${a and a}")
    println("$b & $a = ${b and a}")
}

/**
 * 位或
 */
fun or() {
    println("======================")
    var a = true
    var b = false
    println("$a | $b = ${a or b}")
    println("$a | $a = ${a or a}")
    println("$b | $b = ${b or b}")
}

/**
 * 位异或
 */
fun xor() {
    println("======================")
    var a = 1
    var b = 2
    println("a = $a, b = $b")
    a = a xor b
    b = b xor a
    a = a xor b
    println("a = $a, b = $b")
}

fun inv() {
    println("======================")
    var a = 1
    println("~a = ${a.inv()}")
}