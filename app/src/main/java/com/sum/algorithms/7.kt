package com.sum.algorithms

fun main(){
    stairCase(6)
}
/*
      #
     ##
    ###
   ####
  #####
 ######

*/

fun stairCase(n: Int) {

    var star = "#"
    var space: String

    for (index in 1..n) {
        space = " ".repeat(n - star.length)

        println("$space $star")

        star += "#"
    }
}

