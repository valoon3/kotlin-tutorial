package funtional.ch5_함수_참조

import kotlin.test.Test
import kotlin.test.assertEquals

class Part1FunctionReferenceTest {

    @Test
    fun 참조_테스트() {
        fun add(a: Int, b: Int) = a + b

        val f = ::add

        assertEquals(3, f(1, 2))
        // kotlin-reflect 의존성이 없어서 애러 발생
//        assertEquals(false, f.isOpen)
    }

}