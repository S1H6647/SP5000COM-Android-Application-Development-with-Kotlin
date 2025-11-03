package week1

fun main() {
    // 1. Immutable List
    val numbers = listOf<String>("one", "two", "three")
    // This is not possible
//    numbers[0] = "zero"
//    numbers.add("four")
    println("Immutable List")
    for (i in numbers.indices) {
        println(i)
    }
    println("Index of one is ${numbers.indexOf("one")}")
    println("Item in index 1 is ${numbers[1]}")
    println("Item in index 2 is ${numbers.get(2)}")

    // 2. Mutable List
    val nums = mutableListOf<String>("one", "two", "three")
    // Possible here
    nums[0] = "zero"
    nums.add("four")
    println("Mutable List")
    for (i in nums.indices) {
        println(i)
    }
}