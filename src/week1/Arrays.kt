package week1

fun main() {
    val fruits = arrayOf("apple", "banana", "raspberry", "mango", "orange")
    println(fruits[3])
    fruits[3] = "strawberry"
    println(fruits[3])

    // ArrayList
    val vegetable = ArrayList<String>()
    vegetable.add("Potato")
    vegetable.add(1, "Cabbage")
    vegetable.add("Onion")
    vegetable[2] = "Broccoli"
    println(vegetable)

    // arrayListOf
    val animals = arrayListOf<String>("dog", "cat", "lion", "zebra")
    animals.add(4, "elephant")
    println(animals)
}