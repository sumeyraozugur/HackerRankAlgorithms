package com.sum.algorithms

fun main(){

}

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var result: Int = -1

    keyboards.map { keyboardPrice ->
        drives.map { drivePrice ->

            val total = keyboardPrice + drivePrice

            result = if (total in (result + 1)..b) {
                total
            } else {
                result
            }
        }
    }

    return result


}