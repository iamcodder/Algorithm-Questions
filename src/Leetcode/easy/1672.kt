package Leetcode.easy

//Main function start here. This function doesnt write to leetcode.
fun main() {
    val arrays = arrayOf(getRandomArray(), getRandomArray(), getRandomArray())
    arrays.forEach {
        print(it.contentToString())
    }
    println("\nBiggest Wealth : " + maximumWealth(arrays))
}

fun getRandomArray(): IntArray {
    return IntArray((0..10).random()) {
        (0..20).random()
    }
}


//Solution start here
fun maximumWealth(accounts: Array<IntArray>): Int {
    var result = 0
    accounts.forEach {
        val sum = it.sum()
        if (sum > result) result = sum
    }
    return result
}

