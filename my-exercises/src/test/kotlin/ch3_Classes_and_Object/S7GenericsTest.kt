package ch3_Classes_and_Object

import org.example.ch3_Classes_and_Object.Box
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class S7GenericsTest {
    @Test
    fun genericsTest() {
        val intBox = Box(10)
        val stringBox = Box("Hello")

        assertEquals(10, intBox.value)
        assertEquals("Hello", stringBox.value)

        // Generics can be used with any type
        val doubleBox = Box(3.14)
        assertEquals(3.14, doubleBox.value)
    }
}