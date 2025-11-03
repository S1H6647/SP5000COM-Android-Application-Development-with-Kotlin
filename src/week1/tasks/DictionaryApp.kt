package week1.tasks

import java.util.*

fun main() {
    val dictionary = mapOf(
        "abundance" to "a very large quantity of something",
        "benevolent" to "well meaning and kindly",
        "candid" to "truthful and straightforward; frank",
        "diligent" to "having or showing care and conscientiousness in one's work or duties",
        "eloquent" to "fluent or persuasive in speaking or writing",
        "frugal" to "sparing or economical with regard to money or food",
        "gregarious" to "fond of company; sociable",
        "humble" to "having or showing a modest or low estimate of one's own importance",
        "innovative" to "featuring new methods; advanced and original",
        "jubilant" to "feeling or expressing great happiness and triumph",
        "keen" to "having or showing eagerness or enthusiasm",
        "lucid" to "expressed clearly; easy to understand",
        "meticulous" to "showing great attention to detail; very careful and precise",
        "nostalgic" to "feeling sentimental longing for the past",
        "obscure" to "not discovered or known about; uncertain",
        "pragmatic" to "dealing with things sensibly and realistically",
        "quirky" to "characterized by peculiar or unexpected traits",
        "resilient" to "able to withstand or recover quickly from difficult conditions",
        "serene" to "calm, peaceful, and untroubled",
        "tenacious" to "tending to keep a firm hold of something; persistent",
        "ubiquitous" to "present, appearing, or found everywhere",
        "vivid" to "producing powerful feelings or strong, clear images in the mind",
        "whimsical" to "playfully quaint or fanciful, especially in an appealing way",
        "zealous" to "having or showing great energy or enthusiasm in pursuit of a cause"
    )

    val wordList = listOf(
        "abundance",
        "benevolent",
        "candid",
        "diligent",
        "eloquent",
        "frugal",
        "gregarious",
        "humble",
        "innovative",
        "jubilant",
        "keen",
        "lucid",
        "meticulous",
        "nostalgic",
        "obscure",
        "pragmatic",
        "quirky",
        "resilient",
        "serene",
        "tenacious",
        "ubiquitous",
        "vivid",
        "whimsical",
        "zealous"
    )

    println("\n----- Welcome to the Dictionary App -----")
    println(wordList)
    val scanner = Scanner(System.`in`)

    while (true) {
        print("Enter a word you want to know the meaning of (or 'exit' to quit): ")
        val userInput: String = scanner.next().lowercase()

        if (userInput == "exit" || userInput == "quit") {
            println("Thank you for using the Dictionary App!")
            break
        }

        val meaning = dictionary[userInput]

        if (meaning != null) {
            println("The meaning of $userInput is ${dictionary[userInput]}")
        } else {
            println("Word not found! Please enter the word from above!")
        }
    }
}