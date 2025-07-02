package ch3_Classes_and_Object

import org.example.ch3_Classes_and_Object.S3Properties
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class S3PropertiesTest {

    @Nested
    inner class PropertiesGetterSetterTest {
        @Test
        @DisplayName("")
        fun getTest() {
            val S3Properties = S3Properties();

            assertEquals("Baker", S3Properties.street)
            assertEquals(10, S3Properties.age)
        }
    }

 }