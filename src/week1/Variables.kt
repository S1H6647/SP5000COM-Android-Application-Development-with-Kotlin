package week1

fun main() {
    var name = "John" // Mutable
    name = "Ram"
    println(name)
    println(name.lowercase())
    println(name.uppercase())
    println(name[0])
    println(name.plus(" Doe"))

    val surname = "Doe" // Immutable
    // surname = "Styles"
    println(surname)
}