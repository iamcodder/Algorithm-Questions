package Leetcode.medium

import kotlin.math.*

private fun main() {
    print(firstExample().contentToString())
    print(secondExample().contentToString())
}

private fun firstExample(): IntArray {
    val firstPoint = returnIntArray(2, 1, 3)
    val secondPoint = returnIntArray(2, 3, 3)
    val thirdPoint = returnIntArray(2, 5, 3)
    val fourthPoint = returnIntArray(2, 2, 2)

    val firstQueries = returnIntArray(3, 2, 3, 1)
    val secondQueries = returnIntArray(3, 4, 3, 1)
    val thirdQueries = returnIntArray(3, 1, 1, 2)
    val points: Array<IntArray> = Array(4) {
        when (it) {
            0 -> firstPoint
            1 -> secondPoint
            2 -> thirdPoint
            3 -> fourthPoint
            else -> IntArray(0)
        }
    }
    val queries: Array<IntArray> = Array(3) {
        when (it) {
            0 -> firstQueries
            1 -> secondQueries
            2 -> thirdQueries
            else -> IntArray(0)
        }
    }
    return countPoints(points, queries)
}

private fun secondExample(): IntArray {
    val firstPoint = returnIntArray(2, 1, 1)
    val secondPoint = returnIntArray(2, 2, 2)
    val thirdPoint = returnIntArray(2, 3, 3)
    val fourthPoint = returnIntArray(2, 4, 4)
    val fifthPoint = returnIntArray(2, 5, 5)

    val firstQueries = returnIntArray(3, 1, 2, 2)
    val secondQueries = returnIntArray(3, 2, 2, 2)
    val thirdQueries = returnIntArray(3, 4, 3, 2)
    val fourthQueries = returnIntArray(3, 4, 3, 3)
    val points: Array<IntArray> = Array(5) {
        when (it) {
            0 -> firstPoint
            1 -> secondPoint
            2 -> thirdPoint
            3 -> fourthPoint
            4 -> fifthPoint
            else -> IntArray(0)
        }
    }
    val queries: Array<IntArray> = Array(4) {
        when (it) {
            0 -> firstQueries
            1 -> secondQueries
            2 -> thirdQueries
            3 -> fourthQueries
            else -> IntArray(0)
        }
    }
    return countPoints(points, queries)
}

private fun returnIntArray(size: Int, vararg value: Int): IntArray {
    val tempArray = IntArray(size)
    (0 until size).forEach {
        tempArray[it] = value[it]
    }
    return tempArray
}

//https://user-images.githubusercontent.com/25854605/121565404-16cbfc80-ca25-11eb-94fb-bd96f8f1f2f1.jpg
private fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
    val array = IntArray(queries.size) { 0 }
    queries.forEachIndexed { index, query ->
        val centerX = query[0].toDouble()
        val centerY = query[1].toDouble()
        val radius = query[2].toDouble()
        points.forEach {
            val x = it[0].toDouble()
            val y = it[1].toDouble()
            val compute = sqrt((x - centerX).pow(2) + (y - centerY).pow(2))
            if (compute <= radius) {
                array[index] += 1
            }
        }
    }
    return array
}