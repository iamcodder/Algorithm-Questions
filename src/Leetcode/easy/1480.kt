package Leetcode.easy

import java.util.*

private fun main() {
    val numsOne = IntArray(4) {
        (0..10).random()
    }
    runningSum(numsOne)
}

private fun runningSum(nums: IntArray): IntArray {

    val tempArray = arrayListOf<Int>()

    tempArray.forEach {

    }
    var total = 0
    nums.forEach {
        tempArray.add(it+total)
        total+=it
    }
    return tempArray.toIntArray()
}