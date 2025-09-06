package ch1

fun main() {
    generateSequence(1) { it * 2 }
        .takeWhile { it < 10 }
        .forEach(::print)

    println()
}