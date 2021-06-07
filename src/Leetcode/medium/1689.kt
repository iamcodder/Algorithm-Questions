package Leetcode.medium

private fun main() {
    val n = "32"
    val result = minPartitions(n)
    print(result)
}
//https://ineedmoreplates.medium.com/1689-partitioning-into-minimum-number-of-deci-binary-numbers-3977363a1db0
fun minPartitions(n: String): Int {
    var biggestNumber = 0
    n.forEach {
        if(it.toInt()>biggestNumber) biggestNumber=it.toInt()
    }
    return Character.getNumericValue(biggestNumber)
}