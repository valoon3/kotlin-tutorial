package ch4_Functions

import org.example.ch4_Functions.Person
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class S3DestructuringDeclarationsTest {

    @Test
    fun destructureTest() {
        val person = Person("Alice", 30)
        val (name, age) = person

        assertEquals("Alice", name)
        assertEquals(30, age)
    }

}