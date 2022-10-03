package com.sum.algorithms

fun main(){
    birthday(arrayOf(1, 2, 1, 3, 2),3,2)

}

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    val startIndice = 0
    for(indice in s.indices){
        s.slice(startIndice until m)

    }
    println()

    return 3
}
