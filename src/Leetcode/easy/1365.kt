package Leetcode.easy

private fun main() {
    val nums = IntArray(5)
    nums[0] = 8
    nums[1] = 1
    nums[2] = 2
    nums[3] = 2
    nums[4] = 3
    val result = smallerNumbersThanCurrent(nums)
    print(result.contentToString())
}

//Solve Image:
//https://user-images.githubusercontent.com/25854605/120942000-8fce0a00-c72e-11eb-8767-6085e16597c3.jpg
fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val tempArray = IntArray(101)
    nums.forEach {
        tempArray[it] += 1
    }
    repeat(tempArray.size) {
        if (it != 0) tempArray[it] += tempArray[it - 1]
    }
    nums.forEachIndexed { index, i ->
        nums[index] = if (i == 0) 0 else tempArray[i - 1]
    }
    return nums
}