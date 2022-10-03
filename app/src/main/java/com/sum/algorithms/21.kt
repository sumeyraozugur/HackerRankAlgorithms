package com.sum.algorithms

fun main(){
    println(sockMerchant(9,arrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3)))

}
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var hashMap = HashMap<Int,Int>()
    var pairedSock = 0

    ar.map { element ->
        if (hashMap.keys.contains(element)) {
            hashMap.put(element, hashMap.getValue(element) + 1) //returns the value of the given key
            pairedSock ++
            hashMap.remove(element)
        } else {
            hashMap.put(element, 1)

        }
    }


    return pairedSock

}