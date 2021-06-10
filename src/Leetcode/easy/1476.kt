package Leetcode.easy

private fun main() {

    val sub1 = IntArray(5) { it }
    val sub2 = IntArray(5) { it }
    val sub3 = IntArray(5) { it }
    val sub4 = IntArray(5) { it }
    val sub5 = IntArray(5) { it }

    val rectangle = Array(5) {
        when (it) {
            0 -> sub1
            1 -> sub2
            2 -> sub3
            3 -> sub4
            4 -> sub5
            else -> sub1
        }
    }
    val subrectangleQueries = SubrectangleQueries(rectangle)
    subrectangleQueries.printRect()
    subrectangleQueries.updateSubrectangle(1, 2, 4, 4, 100)
    subrectangleQueries.printRect()
}

class SubrectangleQueries(val rectangle: Array<IntArray>) {

    fun printRect() {
        rectangle.forEach {
            println(it.contentToString())
        }
    }

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        (row1 until row2).forEach { rowIndex ->
            (col1 until col2).forEach { colIndex ->
                rectangle[rowIndex][colIndex] = newValue
            }
        }
    }

    fun getValue(row: Int, col: Int): Int = rectangle[row][col]

}