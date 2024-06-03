package com.example.kotlinbasics

fun main(){
    val multiplier = 5

    println("Please enter a number:")
    var inputString = readln().toInt()

    if(inputString in 1..1000){
        println("The result is " + inputString * multiplier)
    }
    else{
        println("Please enter a whole number")
        inputString = readln().toInt()
    }

}