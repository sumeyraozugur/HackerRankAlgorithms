package com.sum.algorithms

fun main(){
    println(dayOfProgrammer(2017))

}
fun dayOfProgrammer(year: Int): String {
    var ans = ""

    ans = when{
        year<1918 -> {if (year%4==0) "12.09.$year"
                   else "13.09.$year" }
        year > 1918 -> {if((year%400==0) || (year%4==0 && year%100 != 0)) "12.09.$year"
                     else "13.09.$year" }
        else -> "26.09.1918"
    }
    return  ans

}