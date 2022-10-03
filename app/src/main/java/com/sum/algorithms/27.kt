package com.sum.algorithms

import java.lang.Integer.max
import kotlin.math.abs


fun main(){
    println(pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1)))
}
fun pickingNumbers(a: Array<Int>): Int {
    a.sort()
    var maxnum =0
    for(i in a.indices){
        //maxnum = max(maxnum, a[i] +a[i+1])
        for(j in a.indices){
            if(abs(a[j]- a[i]) <=1) maxnum = max(maxnum,j-i+1)
        }
    }
    return maxnum
   // println(count)


}