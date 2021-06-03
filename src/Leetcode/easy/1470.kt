package Leetcode.easy

fun main() {

    //Sample 1
    val arrayOne = arrayOf(2, 5, 1, 3, 4, 7)
    val resultOne = shuffle(arrayOne, 3).contentToString()
    println(resultOne)

    //Sample 2
    val arrayTwo = arrayOf(1, 2, 3, 4, 4, 3, 2, 1)
    val resultTwo = shuffle(arrayTwo, 4).contentToString()
    println(resultTwo)

    //Sample 3
    val arrayThree = arrayOf(1, 1, 2, 2)
    val resultThree = shuffle(arrayThree, 2).contentToString()
    println(resultThree)

}

fun shuffle(nums: Array<Int>, n: Int): IntArray {
    val tempList = arrayListOf<Int>()
    val range = 0 until n
    range.forEach {
        tempList.add(nums[it])
        tempList.add(nums[n + it])
    }
    return tempList.toIntArray()
}

