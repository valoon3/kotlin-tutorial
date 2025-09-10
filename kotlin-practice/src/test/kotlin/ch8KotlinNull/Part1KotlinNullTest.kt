package ch8KotlinNull

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
import kotlin.test.assertEquals

class Part1KotlinNullTest {

    private val part1KotlinNull = Part1KotlinNull()

    @Test
    fun safeCallTest() {
        val result1 = part1KotlinNull.getSafeCall(null);
        val result2 = part1KotlinNull.getSafeCall("test");

        assertEquals("result0", result1)
        assertEquals("result4", result2)
    }
    
    @Test
    fun elvisPresleyExpressionTest() {
        val result1 = part1KotlinNull.elvisPresleyExpression(null)
        val result2 = part1KotlinNull.elvisPresleyExpression("test")

        assertEquals("default", result1)
        assertEquals("test", result2)
    }

    @Test
    fun orEmptyTest() {
        val value1 = null;
        val value2: String = "";
        val value3: Int = 0

        assertEquals(value1?.orEmpty(), null)
        assertEquals(value2.isNullOrEmpty(), true)
        assertEquals(value2.isNullOrBlank(), true)
    }

}