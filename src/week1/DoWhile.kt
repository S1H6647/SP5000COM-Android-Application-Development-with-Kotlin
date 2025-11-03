package week1

import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    var i = 1
    print("Enter the number you want the multiplication table of: ")
    val number: Int = scanner.nextInt()

    do {
        val result: Int = number * i
        println("$number × $i = $result")
        i++
    } while (i <= 10)
}