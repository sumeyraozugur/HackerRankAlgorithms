package com.sum.algorithms

fun main(){
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
}

fun plusMinus(arr: Array<Int>){
    var positiveNumbers = 0f
    var negativeNumbers = 0f
    var zeroNumbers = 0f

    for (index in arr) {
        when {
            index > 0 -> positiveNumbers ++
            index < 0 -> negativeNumbers ++
            index == 0 -> zeroNumbers ++
        }
    }

    positiveNumbers = (positiveNumbers / arr.size)
    negativeNumbers = (negativeNumbers / arr.size)
    zeroNumbers = (zeroNumbers / arr.size)

    println(" $positiveNumbers \n $negativeNumbers \n $zeroNumbers")
}