package ch3_Classes_and_Object

import org.example.ch3_Classes_and_Object.Example
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

    @Test
    fun testExtensionFunction() {

        fun Example.printFunctionType(): String { return "Extension function 1" }

        fun Example.printFunctionType(i: Int): String { return "Extension function $i" }

        assertEquals("Class method", Example().printFunctionType())
        assertEquals("Extension function 2", Example().printFunctionType(2))
    }

}