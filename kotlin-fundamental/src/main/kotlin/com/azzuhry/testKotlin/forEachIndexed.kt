package com.azzuhry.testKotlin

fun main(){
    val ranges = 1..5
    ranges.forEachIndexed{ index, value ->
        println("value is $value with index $index")
    }
}