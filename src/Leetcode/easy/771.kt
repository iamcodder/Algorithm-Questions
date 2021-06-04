package Leetcode.easy

private fun main(){
    val jewels = "aA"
    val stones = "aAAbbb"
    println(numJewelsInStones(jewels,stones))
}

private fun numJewelsInStones(jewels: String, stones: String): Int {
    val map = HashMap<Char,Int>(jewels.length)
    var numOfJewel=0
    jewels.forEach {
        map[it] = 0
    }
    stones.forEach { key->
        val jewelNum= map[key]
        jewelNum?.let { num->
            numOfJewel++
        }
    }
    return numOfJewel
}