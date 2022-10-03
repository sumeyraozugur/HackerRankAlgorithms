package com.sum.algorithms

fun main(){
    println(hurdleRace(1, arrayOf(1,2,3,3,4)))

}

fun hurdleRace(k: Int, height: Array<Int>): Int {
    val sortList = height.sorted()
    var maxJump = sortList.last()
    when {
        k >= maxJump -> maxJump = 0
        else -> maxJump -= k
    }

    return maxJump

}