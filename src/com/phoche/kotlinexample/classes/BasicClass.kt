package com.phoche.kotlinexample.classes

/**
 * Create by qinpc on 2018/2/28
 */
class BasicClass constructor(val date: String) {

    init {
        println("class init, date : $date")
    }

    /**
     * 次级构造函数, 如果有主构造函数, 每一个此机构在函数都要直接或间接代理主构造函数, 通过关键字 this
     */
    constructor(date: String, name: String) : this(date) {
        println("my name is $name, this year is $date")
    }


    // 变量必须要在定义的时候初始化
    // 可以使用 lateinit 关键字定义延迟初始化变量
    lateinit var time: String
    var title: String = "BasicClass"
        get() = field.toUpperCase()
        set(value) {
            field = if (value.length > 10) "title is to long" else value
        }

    var describe: String = "this is a class"

    fun foo() {
        time = date
        println(title + "\n time: $time")
    }
}

fun main(args: Array<String>) {
    var basicClass = BasicClass("2018", "brian")
    basicClass.foo()
    basicClass.title = "NewBasicClass"
    println(basicClass.title + "\n" + basicClass.describe)
}