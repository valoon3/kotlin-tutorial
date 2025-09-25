package funtional.ch6_시퀀스

import kotlin.test.Test
import kotlin.test.assertEquals

class Ex3_takeIf_takeUnless {

    @Test
    fun test() {
        val number = 10
        // 짝수면 number 반환, 아니면 null 반환
        val evenNumber = number.takeIf { it % 2 == 0 }

        // 홀수면 number 반환, 아니면 null 반환
        val oddNumber = number.takeUnless { it % 2 == 0 }

        println("evenNumber: $evenNumber") // evenNumber: 10
        println("oddNumber: $oddNumber")   // oddNumber: null

        assertEquals(10, evenNumber)
        assertEquals(null, oddNumber)
    }

}