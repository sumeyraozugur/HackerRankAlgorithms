package com.sum.algorithms

fun main(){
    println(catAndMouse(1,2,3))

}
/*
* x -> CatA
* y -> CatB
* */
fun catAndMouse(x: Int, y: Int, z: Int): String {


    val catAWay = kotlin.math.abs(z -x)
    val catBWay = kotlin.math.abs(z - y)

    val  result = when {
        catAWay > catBWay -> "Cat B"

        catAWay < catBWay -> "Cat A"

        else -> "Mouse C"
    }

    return result


}