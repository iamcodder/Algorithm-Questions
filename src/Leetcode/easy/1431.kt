package Leetcode.easy

fun main(args: Array<String>) {
    val extraCandies = 3
    val candies = IntArray(5)
    candies[0] = 2
    candies[1] = 3
    candies[2] = 5
    candies[3] = 1
    candies[4] = 3
    val list = kidsWithCandies(candies, extraCandies)
    println(list)
}

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val maxValue = candies.maxOrNull()
    maxValue?.let { max ->
        val tempList = arrayListOf<Boolean>()
        candies.forEach {
            tempList.add(it + extraCandies >= max)
        }
        return tempList
    } ?: run{
        return listOf()
    }
}

