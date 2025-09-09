package ch7_for

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Part1forTest {
    @Test
    fun iterableFor_printsABC() {
        val outputStreamCaptor = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outputStreamCaptor))
        try {
            Part1for().iterableFor()
        } finally {
            System.setOut(originalOut)
        }
        val lines = outputStreamCaptor.toString().trim().lines()
        assertEquals(listOf("A", "B", "C"), lines)
    }

    @Test
    fun intRangeTest() {
        val outputStreamCaptor = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outputStreamCaptor))
        try {
            Part1for().intRange()
        } finally {
            System.setOut(originalOut)
        }
    }

    @Test
    fun intRangeSumTest() {
        var sum = 0
        for(i in 1..5) {
            sum += i
        }

        assertEquals(15, sum)

        sum = 0
        for(i in 5..1) {
            sum += i
        }
        assertEquals(0, sum)

        sum = 0
        for(i in 1 until 5) {
            sum += i
        }
        assertEquals(10, sum)

        sum = 0
        for(i in 1..10 step 2) {
            sum += i
        }
        assertEquals(25, sum)

        sum = 0
        for(i in 10 downTo 1 step 2) {
            sum += i
        }
        assertEquals(30, sum)
    }

    @Test
    fun withIndexTest() {
        var result = ""
        val list = mutableListOf("a", "b", "c")
        for ((index, value) in list.withIndex()) {
            result += "$value$index"
        }
        assertEquals("a0b1c2", result)
    }

    @Test
    fun mapOfTest() {
        val capitals = mapOf(
            "USA" to "Washington DC",
            "France" to "Paris",
            "Russia" to "Moscow"
        )

        assertEquals("Washington DC", capitals["USA"])
        assertEquals("Paris", capitals["France"])
        assertEquals("Moscow", capitals["Russia"])
        assertEquals(null, capitals["Germany"])
    }
}