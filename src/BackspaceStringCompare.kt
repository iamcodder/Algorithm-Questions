fun compareStrings(s1: String, s2: String): Int {

    var firstList: MutableList<Char> = s1.toMutableList()
    var secondList: MutableList<Char> = s2.toMutableList()

    firstList = controlList(firstList)
    secondList = controlList(secondList)

    if (firstList.size == secondList.size) {
        firstList.forEachIndexed { index, c ->
            if (secondList[index] != c) return 0
        }
        return 1
    }
    return 0
}

fun controlList(list: List<Char>): MutableList<Char> {
    val tempList = list.toMutableList()
    val newList = mutableListOf<Char>()
    tempList.forEach {
        if (it == '#') {
            if (newList.size > 0) newList.removeAt(newList.size - 1)
        } else newList.add(it)
    }
    return newList
}


fun main(args: Array<String>) {
    val s1 = readLine()!!

    val s2 = readLine()!!

    val result = compareStrings(s1, s2)

    println(result)
}