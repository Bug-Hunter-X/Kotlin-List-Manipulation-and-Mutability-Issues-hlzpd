fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1,2,3)
    mutableList.add(4)
    mutableList.remove(2)
    println(mutableList) // Output: [1,3,4]
}