package com.sum.algorithms

fun main(){
    println(simpleArraySum(arrayOf(1,2,3,4,5,6)))

}

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    ar.map { sum +=it }
    return sum

}
