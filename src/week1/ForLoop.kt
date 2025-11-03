package week1

fun main() {
//    for (i in 1..5)
//        print(i)
//
//    println()
//    for (i in 1 until 5) // except 5
//        print(i)
//
//    println()
//    // Descending
//    for (i in 5 downTo 1)
//        print(i)
//
//    println()
//    // Step
//    for (i in 1..10 step 2)
//        print(i)

    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (index in numbers.indices)
        println("Number at index $index is ${numbers[index]}") // Use of String templating '$'
}