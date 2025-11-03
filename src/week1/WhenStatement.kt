package week1

fun main() {
    val number = 10
    val result = number in (1..10) // This will check in 1,2,3,4,5,6,7,8,9,10
//    print(result)

    // When is basically switch case
    val animal = "Dog"
    when (animal) {
        "Horse" -> println("The animal is Horse")
        "Dog" -> println("The animal is Dog")
        else -> println("No animal found")
    }
}