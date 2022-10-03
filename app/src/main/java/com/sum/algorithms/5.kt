package com.sum.algorithms

fun main(){

    println(diagonalDifference(arrayOf(arrayOf(11, 2, 4), arrayOf(4, 5, 6), arrayOf(10, 8, -12))))

    /*
  11 2 4
  4 5 6
  10 8 -12
     */
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var diagonalOne = 0
    var diagonalTwo = 0

    val sizeOfArray = arr.size //3

    for (index in arr.indices) {
        diagonalOne += arr[index][index]
        diagonalTwo += arr[index][sizeOfArray - 1 - index]
    }
    return Math.abs(diagonalOne - diagonalTwo)
}