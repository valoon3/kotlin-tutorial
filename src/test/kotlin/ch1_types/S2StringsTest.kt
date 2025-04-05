package ch1_types

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class S2StringsTest {
    @Test
    fun 문자열_반복문() {
        val str = "abcd 123"
        var result = ""
        for (char in str) {
            result += "$char-"
        }
        assertEquals("a-b-c-d- -1-2-3-", result)

        var count = 0
        str.forEach {
            _ -> count++
        }
        assertEquals(8, count)
    }

    @Test
    fun 문자열_불변객체() {
        var str = "abcd"
        // 새로운 String 객체가 생성
        str += "efg"
        assertEquals("abcdefg", str)

        val str2 = "xyz"
        val upperStr2 = str2.uppercase();

        assertEquals("XYZ", upperStr2)
        // 원래 문자열은 변경되지 않는다
        assertEquals("xyz", str2)
    }

    @Test
    fun 문자열_연결() {
        val s = "abc" + 1
        assertEquals("abc1", s)

        val num = 10
        val s2 = "The number is " + num
        assertEquals("The number is 10", s2)
    }

    @Test
    fun 문자열_템플릿() {
        val i = 10
        // i = 10
        println("i = $i")


        val letters = listOf("a","b","c","d","e")
        // 템플릿 표현식 처리되면 자동으로 toString() 호출
        assertEquals("[a, b, c, d, e]", letters.toString())
        // Letters: [a, b, c, d, e]
        println("Letters: $letters")


        val name = "Kotlin"
        val greeting = "Hello, $name!"
        assertEquals("Hello, Kotlin!", greeting)

        val version = 1.9
        val message = "Kotlin version is ${version + 0.0}."
        assertEquals("Kotlin version is 1.9.", message)

        val price = 20
        val quantity = 3
        val total = "Total price: ${price * quantity} dollars"
        assertEquals("Total price: 60 dollars", total)
    }

    @Test
    fun 문자열_서식() {
        val pi = Math.PI
        // Java 의 String.format 사용
        val formattedPi = String.format("%.2f", pi)
        assertEquals("3.14", formattedPi)

        val temperature = 25.5
        val humidity = 60
        // Kotlin 의 format 확장 함수 사용
        val report = "Temperature: %.1f°C, Humidity: %d%%".format(temperature, humidity)
        assertEquals("Temperature: 25.5°C, Humidity: 60%", report)

        val name = "World"
        val greeting = "Hello, %s!".format(name)
        assertEquals("Hello, World!", greeting)

        val number = 10
        val binary = "%b".format(number > 5)
        assertEquals("true", binary)

        val hex = "%x".format(255)
        assertEquals("ff", hex)
    }
}