package com.sum.algorithms

fun main(){
    println(countingValleys(8,"UDDDUDUU"))

}

fun countingValleys(steps: Int, path: String): Int {
    var preElevation = 0
    var elevation = 0
    var valley = 0

    val itChar = path.toCharArray() /* gelen string elemanını bir listeye cevirir */

    for (x in 0 until steps) {

        when {
            itChar[x].toString() == "U" -> elevation += 1

            itChar[x].toString() == "D" -> elevation -= 1 }

        if (elevation == 0 && preElevation < elevation)  valley += 1


        preElevation = elevation
    }
    return valley



}