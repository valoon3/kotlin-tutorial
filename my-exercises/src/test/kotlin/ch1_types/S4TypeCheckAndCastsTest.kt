package ch1_types

import org.example.ch1_types.S4TypeCheckAndCasts
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class S4TypeCheckAndCastsTest {

    private var s4TypeCheckAndCasts = S4TypeCheckAndCasts()

    @Test
    fun isOperator() {
        assertEquals(true, s4TypeCheckAndCasts.isOperator("Hello"))
        assertEquals(false, s4TypeCheckAndCasts.isOperator(123))
    }

    @Test
    fun controlFlow() {
        assertEquals("String", s4TypeCheckAndCasts.controlFlow("Hello"))
        assertEquals("Int", s4TypeCheckAndCasts.controlFlow(1))
        assertEquals("Double", s4TypeCheckAndCasts.controlFlow(3.14))
        assertEquals("Unknown type", s4TypeCheckAndCasts.controlFlow(10L))
    }
}