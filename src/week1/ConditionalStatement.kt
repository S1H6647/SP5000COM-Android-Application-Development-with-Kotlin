package week1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter any number: ")
    val number: Long = scanner.nextLong()

    if (number > 0) {
        println("The number $number is Positive")
    } else if (number < 0) {
        println("The number $number is Negative")
    } else {
        println("The number $number is Zero")
    }

    println("And")

    if (number % 2L == 0L) {
        println("The number $number is Even")
    } else {
        println("The number $number is Odd")
    }
}