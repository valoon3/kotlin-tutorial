package ch3_Classes_and_Object

import org.example.ch3_Classes_and_Object.D
import org.example.ch3_Classes_and_Object.S3Properties
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class S3PropertiesTest {

    @Nested
    inner class PropertiesGetterSetterTest {
        @Test
        @DisplayName("var getter test")
        fun getTest() {
            val S3Properties = S3Properties();

            assertEquals("Baker", S3Properties.street)
            assertEquals(10, S3Properties.age)
        }

        @Test
        @DisplayName("pay getter val 테스트")
        fun getOverrideTest() {
            val S3Properties = S3Properties();

            S3Properties.money = 1000

            // getter 재정의
            assertEquals(2000, S3Properties.pay)
            assertEquals(2000, S3Properties.money)
        }
    }

    @Test
    @DisplayName("다중 상속 테스트")
    fun multiInheritanceTest() {
        val d = D()

        // 표준 출력을 캡처하기 위한 ByteArrayOutputStream 생성
        val outputStreamCaptor = ByteArrayOutputStream()
        // 기존 System.out을 백업
        val originalOut = System.out

        // System.out을 새로운 PrintStream으로 재할당하여 출력을 캡처
        System.setOut(PrintStream(outputStreamCaptor))

        d.foo() // "A"와 "B"를 출력

        // 캡처된 출력 내용을 검증. trim()을 사용하여 불필요한 공백이나 개행 문자 제거
        assertEquals("AB", outputStreamCaptor.toString().trim())

        // System.out을 원래대로 복원
        System.setOut(originalOut)
    }


 }