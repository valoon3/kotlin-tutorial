package ch4_Functions

import org.example.ch4_Functions.Person
import org.example.ch4_Functions.ResultDto
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

    @Test
    fun destructureRoofTest() {
        val personList: List<Person> = listOf(
            Person("Alice", 30),
            Person("Alice", 30),
        )

        for((name, age) in personList) {
            assertEquals(name, "Alice")
            assertEquals(age, 30)
        }
    }

    @Test
    fun returning_two_values_from_a_function() {
        fun statusCreator(status: String): ResultDto {
            if(status === "OK") {
                return ResultDto("Success", 200)
            }

            if(status === "ERROR") {
                return ResultDto("Error", 500)
            }

            return ResultDto("Unknown", 400)
        }

        val (okMessage, okCode) = statusCreator("OK")
        val (errorMessage, errorCode) = statusCreator("ERROR")
        val (unknownMessage, unknownCode) = statusCreator("UNKNOWN")

        assertEquals("Success", okMessage)
        assertEquals(200, okCode)
        assertEquals("Error", errorMessage)
        assertEquals(500, errorCode)
        assertEquals("Unknown", unknownMessage)
        assertEquals(400, unknownCode)
    }

    @Test
    fun destructuring_declarations_and_maps() {
        val map = mapOf(
            "name" to "Alice",
            "age" to 30
        )

        for ((key, value) in map) {
            when (key) {
                "name" -> assertEquals("Alice", value)
                "age" -> assertEquals(30, value)
            }
        }
    }

    @Test
    fun destructuring_in_lambdas() {
        val map = mapOf<Int, String>(
            1 to "one",
            2 to "two",
            3 to "three"
        )

        map.forEach { (key, value) ->
            when (key) {
                1 -> assertEquals("one", value)
                2 -> assertEquals("two", value)
                3 -> assertEquals("three", value)
            }
        }
    }

}