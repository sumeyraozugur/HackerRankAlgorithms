package com.sum.algorithms

fun main(){
    miniMaxSum(arrayOf(1,2,3,4,5))
}

fun miniMaxSum(arr: Array<Int>) {
    val sortedList = arr.sorted()
    var minValue = 0
    var maxValue =0

    val min = sortedList.take(4)
    val max = sortedList.takeLast(4)

   min.map {
       minValue +=it

   }
    max.map {
        maxValue += it
    }

    print("$minValue $maxValue" )


}