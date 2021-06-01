package Softtech.yetenek_kusagi.anagram_difference

fun main() {

    //First Sample
    val firstArray: Array<String> = arrayOf("tea", "tea", "act")
    val secondArray: Array<String> = arrayOf("ate", "toe", "acts")
    val resultOne = control(firstArray, secondArray)
    println("First Sample")
    println(firstArray.contentToString())
    println(secondArray.contentToString())
    println(resultOne.contentToString())
    println("-----\n")

    //Second Sample
    val thirdArray: Array<String> = arrayOf("a", "jk", "abb", "mn", "abc")
    val fourthArray: Array<String> = arrayOf("bb", "kj", "bbc", "op", "def")
    val resultTwo = control(thirdArray, fourthArray)
    println("Second Sample")
    println(thirdArray.contentToString())
    println(fourthArray.contentToString())
    println(resultTwo.contentToString())
    println("-----")

}

//if string size different return -1
//if anagrams same but different location return 0
//if anagrams size same but character size different, return different character length
fun control(a: Array<String>, b: Array<String>): Array<Int> {
    val tempArray = arrayListOf<Int>()
    if (a.size == b.size) {
        a.forEachIndexed { index, text ->
            val number = textControl(text, b[index])
            tempArray.add(number)
        }
    }
    return tempArray.toTypedArray()
}

fun textControl(firstText: String, secondText: String): Int {
    return if (firstText.length != secondText.length) -1
    else {
        val tempSecondTexts = secondText.toMutableList()
        firstText.forEach {
            tempSecondTexts.remove(it)
        }
        tempSecondTexts.size
    }
}