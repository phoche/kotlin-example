package com.phoche.kotlinexample.classes

/**
 * Create by qinpc on 2018/3/15
 */
data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    maxAge()
    calculateSum()

    val person = ::Person
    println("lateinit person")
    val p = person("jack", 33)
    println(p)
    println("---------------------------------")

    groupWithPrefix()
}

fun groupWithPrefix() {
    var list = listOf<String>("aa","ab","c","b")
    println(list.groupBy(String::first))
}

fun String.first() = this.substring(0, 1)

/**
 * lambda 表达式由大括号包裹, -> 分隔参数个方法体
 */
fun calculateSum() {
    val sum = {x: Int, y: Int -> x + y}
    println(sum(1, 2))
}

private fun maxAge() {
    val persons = ArrayList<Person>()
    persons.add(Person("AA", 12))
    persons.add(Person("BB", 22))
    persons.add(Person("CC", 41))
    persons.add(Person("DD", 10))
//    val people: Person? = persons.maxBy { it.age }
//    val people: Person? = persons.maxBy { person -> person.age }
    val maxAge = persons.maxBy(Person::age)?.age
    val oldman = persons.filter { it.age == maxAge }
    println("oldman = $oldman")
}