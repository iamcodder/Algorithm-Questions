package Leetcode.easy

fun main() {
    val nums = IntArray(4)
    nums[0] = 1
    nums[1] = 1
    nums[2] = 1
    nums[3] = 1

    println(numIdenticalPairs(nums))
}

fun numIdenticalPairs(nums: IntArray): Int {
    var findedNums = 0
    nums.forEachIndexed { index, data ->
        for (i in index+1 until nums.size) {
            if(nums[i]==data) {
                findedNums++
            }
        }
    }
    return findedNums
}

