package ch3_Classes_and_Object

import org.example.ch3_Classes_and_Object.S8InnerClasses
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class S8InnerClassesTest {
    @Test
    fun innerClassTest() {
        val outer = S8InnerClasses()
        val inner = outer.Inner().foo();
    }
 }