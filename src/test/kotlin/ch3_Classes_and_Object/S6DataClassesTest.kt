package ch3_Classes_and_Object

import org.example.ch3_Classes_and_Object.User
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class S6DataClassesTest {

    @Nested
    inner class DataClassesDefaultTest {
        @Test
        fun dataClassDefaultTest() {
            val user = User("Alice", 30)

            val copyUser = user.copy()

            assertEquals("Alice", user.name)
            assertEquals(user, copyUser)
            assertEquals(user.toString(), copyUser.toString())
        }

    }

}