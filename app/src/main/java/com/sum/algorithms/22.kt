package com.sum.algorithms

fun main(){
    println(pageCount(5,3))

}
fun pageCount(n: Int, p: Int): Int {
    return when {
        (n == 2) ->0
        (n % 2 == 0 && n - p == 1) -> 1
        else ->  Math.min(p / 2, (n - p) / 2)
    }


}