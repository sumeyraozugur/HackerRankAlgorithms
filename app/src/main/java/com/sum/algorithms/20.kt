package com.sum.algorithms

fun main(){
    bonAppetit(arrayOf(3, 10, 2, 9), 1, 12)
}
// k =  item Anna doesn't eat
//b = the amount of money that Anna contributed to the bill

fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    var sum = 0
    var barrowOfAnna =0

    bill.mapIndexed { index, i ->
        if(index !=k) sum +=i //sum =14
    }
    barrowOfAnna = sum/2

    println(
        if (barrowOfAnna == b) "Bon Appetit"
        else b - barrowOfAnna)


}

