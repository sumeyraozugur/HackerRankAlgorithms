package com.sum.algorithms

fun main() {
    println(breakingRecords(arrayOf(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)).contentToString())

}

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var highScore = scores[0]
    var lowestScore = scores[0]
    var highScoreNumbers = 0
    var lowesScoreNumbers = 0

    for (score in scores) {
        when {
            score < lowestScore -> {
                lowestScore = score
                lowesScoreNumbers += 1
            }
            score > highScore -> {
                highScore = score
                highScoreNumbers += 1
            }
        }
    }
    return arrayOf(highScoreNumbers,lowesScoreNumbers)
}


