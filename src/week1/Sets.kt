package week1

fun main() {
    // 1. Immutable set
    val evenNumbers = setOf<Int>(2, 4, 6, 8, 8) // Same elements are discarded as one
//    evenNumbers.add(10)
    println(evenNumbers)

    // 2. Mutable set
    val oddNumbers = mutableSetOf<Int>(1, 3, 5, 7)
    oddNumbers.add(9)
    println(oddNumbers)

    println(setOf(1, 2, 3, 4) == setOf(4, 3, 2, 1))
}