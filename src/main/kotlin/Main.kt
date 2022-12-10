import java.io.File

/*
Advent of code 2022!
Day 1
 */

fun main(args: Array<String>) {
    aocDayOne()
}

fun aocDayTwo() {

}

fun aocDayOne() {
    val file = File("input")

    // Read the entire file in as a String, remove
    val input: String = file.readText().replace("\r", "")

    // Remove spacing
    val split = input.split("\n\n")

    // Remove more spacing, change String to Int, and grab the sum!
    val map = split.map { it ->
        it.split("\n").map { it.toInt() }
    }

    // Get the sum
    val sum = map.map { it.sum() }

    // Get the max!
    val theMax = sum.maxOf { it }

    println("The max is $theMax!")
}