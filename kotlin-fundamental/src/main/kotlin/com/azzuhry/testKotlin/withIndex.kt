package com.azzuhry.testKotlin

fun main() {
    val ranges = 1.rangeTo(10)
    for ((index, value) in ranges.withIndex()) {
        println("Value is $value with index $index")
    }
}