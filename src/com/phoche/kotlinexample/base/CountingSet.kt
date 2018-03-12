package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/3/12
 */

class CountingSet<T>(val mSet: HashSet<T> = HashSet<T>()) : MutableCollection<T> by mSet {

    var count = 0

    override fun add(element: T): Boolean {
        count ++
        return mSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        count += elements.size
        return mSet.addAll(elements)
    }
}

fun main(args: Array<String>) {
    val set = CountingSet<Int>()
    set.addAll(listOf(1, 1, 2))
    // CountingSet 类声明中 by 关键字将 MutableCollection 的接口方法委托给 CountingSet,
    // 也就是 mSet 的接口实现通过 CountingSet 实例也可以访问
    // 在委托类中也可以重写接口方法, 这样就改变委托方法采用自己的实现
    println("${set.count} objects were added, size = ${set.size}")
}