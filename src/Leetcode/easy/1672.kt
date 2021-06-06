package Leetcode.easy


//Main private function start here. This private function doesnt write to leetcode.
private fun main() {
    val arrays = arrayOf(getRandomArray(), getRandomArray(), getRandomArray())
    arrays.forEach {
        print(it.contentToString())
    }
    println("\nBiggest Wealth : " + maximumWealth(arrays))
}

private fun getRandomArray(): IntArray {
    return IntArray((0..10).random()) {
        (0..20).random()
    }
}

//Solution start here
private fun maximumWealth(accounts: Array<IntArray>): Int {
    return if(accounts.isNotEmpty()) {
        val stream = accounts.map {
            it.sum()
        }
        stream.maxOrNull() ?: -1
    } else -1
}

