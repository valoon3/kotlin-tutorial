package ch2_controlFlow

import org.example.myPractice.ch2_controlFlow.S2Exceptions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

class S2ExceptionsTest {

    private var s2Exceptions = S2Exceptions()

    @Test
    fun requireFunction() {
        val s2Exceptions = S2Exceptions()
        assertEquals(0, s2Exceptions.requireFunction(0))

        val exception = assertThrows<IllegalArgumentException> {
            s2Exceptions.requireFunction(10) // 0이 아닌 값(10)을 입력
        }

        // require 함수의 조건이 num == 0 이므로, 10을 넣으면 조건이 거짓이 되어 예외가 발생합니다.
        assertEquals(IllegalArgumentException::class, exception::class)
        assertEquals("count 는 0 이어야만 합니다.", exception.message)
    }

    @Test
    fun checkFunction() {
        // 정상적인 경우 (param != null)
        assertDoesNotThrow {
            s2Exceptions.checkFunction("test")
        }

        // 예외가 발생하는 경우 (param == null)
        val exception = assertThrows<IllegalStateException> {
            s2Exceptions.checkFunction(null)
        }
        assertEquals(IllegalStateException::class, exception::class)
        assertEquals("param 은 null 이 될 수 없습니다.", exception.message)
    }

    @Test
    fun errorFunction() {
        val exception = assertThrows<IllegalStateException> {
            s2Exceptions.errorFunction()
        }
        assertEquals(IllegalStateException::class, exception::class)
        assertEquals("이것은 오류입니다.", exception.message)
    }
}