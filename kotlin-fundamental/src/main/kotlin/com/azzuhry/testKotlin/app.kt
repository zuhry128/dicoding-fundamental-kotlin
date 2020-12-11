package com.azzuhry.testKotlin
//IF expression excercise
fun main(){
    val myDeadline = 17
    val mySubmission = 10

    if (mySubmission < myDeadline){
        print("Submission Accepted")
    } else if (mySubmission == myDeadline){
        print("Almost fail")
    } else {
        print("Submission Rejected")
    }
}
