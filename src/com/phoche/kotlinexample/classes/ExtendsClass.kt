package com.phoche.kotlinexample.classes

/**
 * Create by qinpc on 2018/3/1
 */
open class Driver(var name: String, var age: Int) {

    /**
     * 类中使用 open 声明属性, 该属性在子类中可以被重写
     *
     */
    open val weight: Float get() = 100.22f

    /**
     * 使用关键字 open 修饰的类才可以被继承
     * Any 是所有类的基类, 相当于 Java 中的 Object
     */
    init {
        println(name)
    }

    open fun driver() {
        println("driver car")
    }
}

class BusDriver(name: String, age: Int, var model: String) : Driver(name, age), IDriver {
    /**
     * 可以用 var 重写 val, 反之则不行
     */
    override val weight: Float
        get() = super.weight

    init {
        var name = "busDriver"
        println(name)
    }

    /**
     * 重写父类有多个相同方法时, 使用 super 关键字选择性的调用父类实现
     */
    override fun driver() {
        super<IDriver>.driver()
        super<Driver>.driver()
        println("driver $model, weight : $weight")
    }
}

class TaxiDriver : Driver {

    var model: String?

    /**
     * 子类中只有次级构造函数, 必须使用 super 初始化父类
     */
    constructor(name: String, age: Int, model: String) : super(name, age) {
        this.model = model
    }


    override fun driver() {
        println("name : $name, age : $age, model : $model")
    }
}

interface IDriver {
    fun driver() {
        println(" driver interface")
    }
}

fun main(args: Array<String>) {
    var busDriver = BusDriver("busDriver", 33, "benz")
    busDriver.driver()

    var taxiDriver = TaxiDriver("taxiDriver", 44, "volvo")
    taxiDriver.driver()
}