package ch3_Classes_and_Object

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

}