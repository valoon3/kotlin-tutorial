package ch13_exception

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame

class Part1MyExceptionTest {

    @Test
    fun `throwing Part1MyException should be caught with correct message`() {
        val ex = assertFailsWith<Part1MyException> {
            throw Part1MyException()
        }
        assertEquals("Some error message", ex.message)
    }

    @Test
    fun `throwing MyExceptionObject should be the singleton with correct message`() {
        val ex = assertFailsWith<MyExceptionObject> {
            throw MyExceptionObject
        }
        // 객체 예외는 싱글톤이어야 하며, 메시지도 정확해야 합니다.
        assertSame(MyExceptionObject, ex)
        assertEquals("Some object error message", ex.message)
    }
}