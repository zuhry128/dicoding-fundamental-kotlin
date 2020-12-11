package com.azzuhry.testKotlin

fun main(){
    val number: Int = 10

    when(number){
        9 -> println("number is nine")
        5 -> println("number is five")
        7 -> println("number is seven")
        else -> println("value cannot be reached")
    }
}