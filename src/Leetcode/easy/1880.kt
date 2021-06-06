package Leetcode.easy

private fun main() {
    val firstWord = "acb"
    val secondWord = "cba"
    val targetWord = "cdb"
    isSumEqual(firstWord, secondWord, targetWord)
}

private fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
    val firstNumber = find(firstWord)
    val secondNumber = find(secondWord)
    val thirdNumber = find(targetWord)
    return firstNumber + secondNumber == thirdNumber
}

private fun find(word: String): Int {
    var firstNumber = ""
    word.forEach {
        val charNumber = it.toInt() - 97
        firstNumber += "$charNumber"
    }
    return firstNumber.toInt()
}