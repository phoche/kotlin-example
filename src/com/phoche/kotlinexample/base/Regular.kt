package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/3/8
 */
fun main(args: Array<String>) {

    var s = "123-A.45.6"
    splitStr(s)
    splitStrWithKt(s)
    var str = "/User/name/Document/config.txt"
    splitFileName(str)

}

/**
 * 在三引号字符串中不需要任何转义任何字符, 点好直接使用 \. 来表示
 */
fun splitFileName(s: String) {
    var regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchEntire = regex.matchEntire(s)
    if (matchEntire != null) {
        val (diretory, filename, extension) = matchEntire.destructured
        println("Dir:$diretory, filename:$filename, ext:$extension")
    }
}

/**
 * 使用 kotlin 中的正则语法
 */
fun splitStrWithKt(s: String) {
    println(s.split(".", "-"))
}

/**
 * 使用正则表达式拆分
 */
fun splitStr(s: String) {
    var regex = "\\.|-".toRegex()
    println(s.split(regex))
}

