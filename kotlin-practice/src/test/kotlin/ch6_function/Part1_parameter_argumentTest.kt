package ch6_function

import kotlin.test.Test
import kotlin.test.assertEquals

class Part1_parameter_argumentTest {
    @Test
    fun concatenate_single() {
        val result = concatenate("abc")
        assertEquals("abc", result)
    }

    @Test
    fun concatenate_multiple() {
        val result = concatenate("a", "b", "c")
        assertEquals("a, b, c", result)
    }

    @Test
    fun concatenate_empty() {
        val result = concatenate()
        assertEquals("", result)
    }
}
