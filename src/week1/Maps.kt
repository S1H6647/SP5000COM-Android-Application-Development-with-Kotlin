package week1

fun main() {
    // 1. Immutable Map
    val countriesCapital = mapOf<String, String>(
        "Nepal" to "Kathmandu",
        "India" to "New Delhi"
    )
    // Not possible
//    countriesCapital.put("Russia", "Moscow")
    println("Keys : ${countriesCapital.size}")
    println("Values : ${countriesCapital.values}")
    println(countriesCapital["Nepal"])

    // 2. Mutable Map
    val studentMarks = mutableMapOf<String, Int>(
        "Ram" to 50,
        "John" to 65
    )
    studentMarks["Carl"] = 60 // studentMarks.put("Carl", 60)
    println("Keys : ${studentMarks.size}")
    println("Values : ${studentMarks.values}")
    println(studentMarks["Carl"])
}