package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/2/27
 */
fun main(args: Array<String>) {
    iterated()
    multipleLine()
}

/**
 * 使用 for 循环来遍历 String
 */
fun iterated() {
    var s = "Hello Kotlin"
    for (c in s) {
        println("$c")
    }
    println("=======================")
}

/**
 * 多行字符串
 */
fun multipleLine() {
    var s = """
        窗前明月光
        疑是地上霜
        """
    println(s)
    println("-----------------------")
    // 删除多余空格, 默认 | 为边界前缀
    var text = """
        |举头望明月
        |低头思故乡
        """.trimMargin()
    println(text)
    println("=======================")
}