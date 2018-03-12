package com.phoche.kotlinexample.base

/**
 * Create by qinpc on 2018/3/6
 * compute ((2 + 4) + 8)
 */
//interface Expr
//
//class Num(val value: Int) : Expr
//
//class Sum(val left: Expr, val right: Expr) : Expr

sealed class Expr {
    class Num(val value: Int) : Expr()

    class Sum(val left: Expr, val right: Expr) : Expr()
}


fun eval(expr: Expr): Int {
    if (expr is Expr.Num) {
        return expr.value
    }

    if (expr is Expr.Sum) {
        return eval(expr.left) + eval(expr.right)
    }

    throw IllegalAccessException()
}

fun eval2(e: Expr): Int =
        if (e is Expr.Num) {
            e.value
        } else if (e is Expr.Sum) {
            eval2(e.left) + eval2(e.right)
        } else {
            throw IllegalAccessException()
        }

fun eval3(e: Expr): Int =
        when(e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval3(e.left) + eval3(e.right)
            else -> throw IllegalAccessException()
        }

fun main(args: Array<String>) {
    val expr = Expr.Sum(Expr.Sum(Expr.Num(2), Expr.Num(4)), Expr.Num(8))
    val sum = eval(expr)
    val sum2 = eval2(expr)
    val sum3 = eval3(expr)
    println("sum: $sum, sum2: $sum2, sum3: $sum3")
}