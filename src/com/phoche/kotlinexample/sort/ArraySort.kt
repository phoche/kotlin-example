package com.phoche.kotlinexample.sort

/**
 * Create by qinpc on 2018/3/28
 */

/**
 * 冒泡排序
 */
fun bubbleSort(array: MutableList<Int>) {
    var isChange: Int
    for (i in 0 until array.count() - 1) {
        isChange = 0
        for (j in 0 until array.count() - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
                isChange = 1
            }
        }
        if (isChange == 0) break
    }
    println(array)
}

fun selectSort(array: MutableList<Int>) {
    var pos: Int
    var temp: Int
    for (i in 0 until array.count() - 1) {
        pos = 0
        for (j in 0 until array.count() - i) {
            if (array[pos] < array[j]) {
                pos = j
            }
        }
        temp = array[pos]
        array[pos] = array[array.count() - i - 1]
        array[array.count() - i - 1] = temp
    }
    println(array)
}

fun quickSort(array: MutableList<Int>, left: Int, right: Int) {
    var temp : Int
    var point: Int
    var L: Int
    var R: Int
    var l = left
    var r = right
    val count = array.count()
    for (i in 1 until count) {
        point = array[0]
        L = array[l]
        R = array[r]
        while (R >= point && r > l) {
            r--
        }

        while (L <= point && l < r) {
            l++
        }

        if (r == l) {
            l = 0
        }

        if (r > l) {
            temp = array[l]
            array[l] = array[r]
            array[r] = temp
        }
        break
    }
    println(array)
}


fun main(args: Array<String>) {
    var list = mutableListOf(9, 1, 7, 8, 2, 4, 6, 5, 3)
//    bubbleSort(list)
//    selectSort(list)
    quickSort(list, 1, list.count() - 1)
}