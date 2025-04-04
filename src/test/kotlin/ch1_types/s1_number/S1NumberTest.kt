package ch1_types.s1_number

import org.example.ch1_types.s1_number.S1Number
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class S1NumberTest {

    @Test
    fun 정수_타입_테스트() {
        val one = 1
        assertEquals(1, one)
        assertEquals(Int::class, one::class)

        // 30억은 Int 범위를 넘어서므로 Long 으로 추론됩니다.
        val threeBillion = 3000000000
        assertEquals(3000000000L, threeBillion)
        assertEquals(Long::class, threeBillion::class)

        val oneLong = 1L
        assertEquals(1L, oneLong)
        assertEquals(java.lang.Long::class, oneLong::class)

        // 명시적으로 Byte 타입으로 선언
        val oneByte: Byte = 1
        assertEquals(1.toByte(), oneByte)
        assertEquals(Byte::class, oneByte::class)
    }

    @Test
    fun 실수_타입_테스트_double() {
        val pi = 3.14
        // Double 비교 시 정밀도 오차를 고려
        assertEquals(3.14, pi, 0.0000000001)
        assertEquals(Double::class, pi::class)

        val oneDouble = 1.0
        assertEquals(1.0, oneDouble)
        assertEquals(Double::class, oneDouble::class)

        val e = 2.7182818284
        assertEquals(2.7182818284, e, 0.0000000000001)
        assertEquals(Double::class, e::class)
    }

    @Test
    fun 실수_타입_테스트_float() {
        val eFloat = 2.7182818284f
        // Float는 정밀도가 낮으므로 실제 값과 비교합니다.
        assertEquals(2.7182817f, eFloat)
        // 부동소수점 문제로 인한 값 비교
        assertNotEquals(2.7182818284, eFloat)
        assertEquals(Float::class, eFloat::class)
    }

    @Test
    fun 실수_타입_테스트_형선언() {
        // 컴파일러가 Int를 Double로 암시적 형변환하지 않는다는 것을 이해하는 것이 중요합니다.
        // 명시적으로 변환해야 합니다.
        val d: Double = 1.0
        assertEquals(1.0, d)
        assertEquals(Double::class, d::class)
    }

    @Test
    fun 실수_타입_테스트_명시적_변환() {
        val byte: Byte = 1
        val intConvertedByte: Int = byte.toInt()

        // 모든 번호 유형은 다른 유형으로의 전환을 지원한다
        // toShort(): Short
        // toInt(): Int
        // toLong(): Long
        // toFloat(): Float
        // toDouble(): Double

        // Byte를 Int로 명시적 형변환
        assertEquals(1, intConvertedByte)
        assertNotEquals(byte::class, intConvertedByte::class)
    }

 }