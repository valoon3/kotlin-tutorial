package ch3_Classes_and_Object

import org.example.ch3_Classes_and_Object.Rectangle
import org.example.ch3_Classes_and_Object.Shape
import org.example.ch3_Classes_and_Object.swap
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class S5ExtensionsTest {

    @Test
    fun testExtensions() {
        val list = mutableListOf(1, 2, 3)
        list.swap(0, 2)

        assertEquals(list[0], 3)
    }

    @Test
    fun testExtensionsWithReceiver() {
        fun Shape.getName() = "Shape"
        fun Rectangle.getName() = "Rectangle"

        fun printClassName(s: Shape) {
            println(s.getName())
        }

        printClassName(Rectangle())
    }

}