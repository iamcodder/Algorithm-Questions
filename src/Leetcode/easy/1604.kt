package Leetcode.easy



private class ParkingSystem(big: Int, medium: Int, small: Int) {

    val map = HashMap<Int,Int>()
    init {
        map[1] = big
        map[2] = medium
        map[3] = small
    }

    fun addCar(carType: Int): Boolean {
        val carSize = map[carType]
        carSize?.let {
            return if(carSize>0) {
                map[carType]=it-1
                true
            }else false
        }
        return false
    }
}

private fun main() {
    val system = ParkingSystem(1,1,0)
    system.addCar(2)

}