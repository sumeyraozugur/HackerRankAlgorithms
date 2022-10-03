package com.sum.algorithms

fun main(){
    println(divisibleSumPairs(6,3, arrayOf(1, 3, 2, 6, 1, 2)))

}

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
   var number =0
    for(i in 0 until n){
        for(j in i+1 until n){
            if((ar[i] +ar[j]) % k ==0) number ++
        }
    }
    return  number

}