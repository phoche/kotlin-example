package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/3/7
 */
fun main(args: Array<String>) {
    for (i in 1..100 step 2) {
        // 1-100 step = 1
        print("${fizzBuzz(i)} ")
    }
    println("\n-----------------------")

    for (i in 100 downTo 1 step 2) {
        // 100-1 step = -2
        print("${fizzBuzz(i)} ")
    }

}


fun fizzBuzz(i: Int) = when {
    i % 15 ==0 -> "fizzBuzz"
    i % 3 == 0 -> "fizz"
    i % 5 == 0 -> "buzz"
    else -> "$i"
}