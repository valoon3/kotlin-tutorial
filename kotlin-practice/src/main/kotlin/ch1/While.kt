package ch1


fun secondsToPrettyTime(seconds: Int): String {
    return when(seconds) {
        in Int.MIN_VALUE until 0 -> "Invalid input"
        0 -> "Now"
        in 1 until 60 -> "$seconds sec"
        in 60 until 3600 -> {
            val minutes = seconds / 60
            val remainingSeconds = seconds % 60
            if (remainingSeconds == 0) {
                "$minutes min"
            } else {
                "$minutes min $remainingSeconds sec"
            }
        }
        else -> {
            val hours = seconds / 3600
            val remainingSecondsAfterHours = seconds % 3600
            val minutes = remainingSecondsAfterHours / 60
            val remainingSeconds = remainingSecondsAfterHours % 60

            val hoursPart = "$hours h"
            val minutesPart = if (minutes > 0) " $minutes min" else ""
            val secondsPart = if (remainingSeconds > 0) " $remainingSeconds sec" else ""

            (hoursPart + minutesPart + secondsPart).trim()
        }

    }
}

fun main() {
    generateSequence(1) { it * 2 }
        .takeWhile { it < 10 }
        .forEach(::print)

    println()

    println(secondsToPrettyTime(-1)) // Invalid input
    println(secondsToPrettyTime(0)) // Now
    println(secondsToPrettyTime(45)) // 45 sec
    println(secondsToPrettyTime(60)) // 1 min
    println(secondsToPrettyTime(150)) // 2 min 30 sec
    println(secondsToPrettyTime(1410)) // 23 min 30 sec
    println(secondsToPrettyTime(60 * 60)) // 1 h
    println(secondsToPrettyTime(3665)) // 1 h 1 min 5 sec
}
