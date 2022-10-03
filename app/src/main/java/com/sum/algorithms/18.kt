package com.sum.algorithms


fun main(){
    println(migratoryBirds(arrayOf(1, 4, 4, 4, 5, 3)))

}
fun migratoryBirds(arr: Array<Int>): Int {
    val hashMap = HashMap<Int, Int>()

    arr.map {
            element ->
        if (hashMap.keys.contains(element)) {
            hashMap.put(element, hashMap.getValue(element) + 1) //returns the value of the given key
        } else {
            hashMap.put(element, 1)
        }
    }
    val maxValue = hashMap.values.max()
    val sum =hashMap.filterValues {
        it ==maxValue

    }.keys


   return sum.toIntArray().get(0)



}