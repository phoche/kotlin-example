package com.phoche.kotlinexample.classes

/**
 * Create by qinpc on 2018/2/28
 */
class BasicClass constructor(date: String) {

    init {
        println("class init, date : $date")
    }

    val time: String = date
    var title: String = "BasicClass"
        get() = field.toUpperCase()
        set(value) {
            field = if (value.length > 10) "title is to long" else value
        }

    var describe: String = "this is a class"

    fun foo() {
        println(title)
    }
}

fun main(args: Array<String>) {
    var basicClass = BasicClass("2018")
    basicClass.foo()
    basicClass.title = "NewBasicClass"
    println(basicClass.title + "\n" + basicClass.describe)
}