package com.azzuhry.testKotlin

fun main(){
    val officeHour = 8
    val now = 6
    val isOpen = now < officeHour || now > officeHour
        print("office is closed : $isOpen")
}