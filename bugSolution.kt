fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1, 2, 3)
    val newList = mutableList.toMutableList() // create a copy before modification
    newList.add(4)
    newList.remove(2)
    println(mutableList) // Original list remains unchanged: [1, 2, 3]
    println(newList) // Modified list: [1, 3, 4]
    
    //Alternative - using filter
    val filteredList = mutableList.filter { it != 2 }.toMutableList()
    filteredList.add(4)
    println(filteredList) // [1,3,4] 
} 