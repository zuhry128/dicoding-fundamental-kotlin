package com.azzuhry.testKotlin

fun main(){
    val officeOpen = 7
    val officeClosed = 20
    val now = 12
    val openOffice = now >= officeOpen && officeClosed <= now
        print("office is closed : $openOffice")
}