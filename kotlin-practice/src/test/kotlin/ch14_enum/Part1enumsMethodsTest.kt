package ch14_enum

import java.awt.Color
import kotlin.test.Test
import kotlin.test.assertEquals

class Part1enumsMethodsTest {

    @Test
    fun testEnumsMethods() {
        val option: Part1enumMethods = Part1enumMethods.valueOf("MONDAY")
        val allOptions: Array<Part1enumMethods> = Part1enumMethods
            .entries
            .toTypedArray()

        val enumValueOf = enumValueOf<Part1enumMethods>("MONDAY")

        println("option: $option")

        allOptions.forEach { println(it) }

        assertEquals(enumValueOf, option)
    }

}