package ch9_class

import kotlin.test.Test
import kotlin.test.assertEquals

class SampleClassTest {

    @Test
    fun getterTest() {
        val sampleClass = SampleClass()
        sampleClass.name = "john"
        println(sampleClass)
        assertEquals(sampleClass.name, "JOHN")
    }

    @Test
    fun setterTest() {
        val sampleClass = SampleClass()
        sampleClass.koreanAge = 25
        assertEquals(26, sampleClass.koreanAge)
    }

    @Test
    fun innerClassMethodTest() {
        val innerClass = InnerClass.InnerClassInInnerClass1()

        assertEquals("This is inner class method", innerClass.getMethod())

        val innerClass2 = InnerClass()
            .InnerClassInInnerClass2()
    }

}