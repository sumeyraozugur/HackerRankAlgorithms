package com.sum.algorithms

fun main(){
    println(saveThePrisoner(5, 2, 1))

}
/*
int n: the number of prisoners
int m: the number of sweets
int s: starts at seat number
 */
fun saveThePrisoner(prisoner: Int, sweet: Int, whichNumber: Int): Int {
    // Write your code here

    var result = sweet + whichNumber -1
    result %= prisoner

    return when(result){
        0 -> prisoner
        else -> result
    }


}