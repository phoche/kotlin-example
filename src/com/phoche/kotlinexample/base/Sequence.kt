package com.phoche.kotlinexample.base

import java.util.*

/**
 * Create by qinpc on 2018/3/15
 */
fun main(args: Array<String>) {
    listOperator()
//    sequenceOperator()
}

fun listOperator() {
    val currentTimeMillis = System.currentTimeMillis()
    val list = createList()
    val newList = list.map(Person::name)
            .filter { it.startsWith("a") }
    println("size = ${newList.size} time = ${System.currentTimeMillis() - currentTimeMillis}")
}

fun sequenceOperator() {
    val currentTimeMillis = System.currentTimeMillis()
    val sequence = createList()
    val newSequence = sequence.asSequence()
            .map(Person::name)
            .filter { it.startsWith("a") }
            .toList()
    println("size = ${newSequence.size} time = ${System.currentTimeMillis() - currentTimeMillis}")
}

fun createList(): MutableList<Person> {
    val random = Random()
    val list = listOf<Person>(Person("ad", 12), Person("bc", 12), Person("cd", 13))
    var arr = mutableListOf<Person>()
    for (i in 0..10000) {
        val nextInt = random.nextInt(3);
        arr.add(list[nextInt])
    }
    return arr
}

data class Person(val name: String, val age: Int)