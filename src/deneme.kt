fun getMinimumDifference(a: Array<String>, b: Array<String>): Array<Int> {

    val templist = mutableListOf<Int>()

    return templist.toTypedArray()

}

fun main(args: Array<String>) {
    val aCount = readLine()!!.trim().toInt()

    val a = Array<String>(aCount, { "" })
    for (i in 0 until aCount) {
        val aItem = readLine()!!
        a[i] = aItem
    }

    val bCount = readLine()!!.trim().toInt()

    val b = Array<String>(bCount, { "" })
    for (i in 0 until bCount) {
        val bItem = readLine()!!
        b[i] = bItem
    }