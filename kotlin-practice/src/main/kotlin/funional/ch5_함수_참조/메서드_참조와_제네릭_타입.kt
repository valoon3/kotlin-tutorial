package funional.ch5_함수_참조

class TeamPoints(val points: List<Int>) {
    fun <T> calculatePoints(operation: (List<Int>) -> T): T =
        operation(points)
}

class Box<T>(private val value: T) {
    fun unBox(): T = value
}

fun main() {
    val teamPoints = TeamPoints(listOf(1, 3, 5))

    val sum = teamPoints.calculatePoints(List<Int>::sum)
    println(sum) // 9

    val avg = teamPoints.calculatePoints(List<Int>::average)
    println(avg) // 3.0

    val invalid = String?::isNullOrBlank
    println(invalid(null)) // true
    println(invalid("  ")) // true
    println(invalid("AAA")) // false

    val unBox = Box<String>::unBox
    val box = Box("AAA")
    println(unBox(box))
}