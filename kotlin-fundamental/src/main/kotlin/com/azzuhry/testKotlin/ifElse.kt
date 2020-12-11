package com.azzuhry.testKotlin

fun main(){
    val qualifiedAge = 18
    val yourAge = 25
    val maxAge = 25

    val qualified = "you are qualified"
    val failure = "you are not qualified"

    if (yourAge > qualifiedAge){
        print(qualified)
    } else if (yourAge == maxAge) {
        print(failure)
    } else {
        print("try again next time")
    }
} //required fix, instead of else if, if block will be processed