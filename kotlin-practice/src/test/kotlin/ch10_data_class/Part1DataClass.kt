package ch10_data_class

import ch11_data_class.Company
import ch11_data_class.User
import java.io.Serializable
import kotlin.test.Test
import kotlin.test.assertEquals

class Part1DataClass {

    @Test
    fun equals_테스트() {
        val a = Part1DataClass()
        val b = Part1DataClass()

        val num1 = 10
        val num2 = 10

        assertEquals(false, a.equals(b))
        assertEquals(false, a == b)

        assertEquals(true, num1 == num2)
        assertEquals(true, num1.equals(num2))
    }

    @Test
    fun hashCodeTest() {
        val a = Part1DataClass()
        val b = Part1DataClass()
        val c = Part1DataClass()

        println(a.hashCode())
        println(b.hashCode())
        println(c.hashCode())
    }

    @Test
    fun dataClassHashCodeTest() {
        val a = User("John", 20)
        val b = User("John", 20)
        val c = User("Jane", 21)

        println(a.hashCode())
        println(b.hashCode())
        println(c.hashCode())

        // 같은 값의 프로퍼티를 가진 data class 는 해쉬코드가 같다
        assertEquals(true, a == b)
        assertEquals(false, a == c)
    }

    @Test
    fun dataClassCopyTest() {
        val user = User("John", 20)
        val company = Company("Google", user)
        val copyCompany = company.copy(name = "Facebook")

        assertEquals("Google", company.name)
        assertEquals("Facebook", copyCompany.name)

        // copy 는 얕은 객체이기 때문에 객체가 공유된다.
        assertEquals(true, company.user == copyCompany.user)
    }

    @Test
    fun destructuringTest() {
        val user = User("John", 20)
        val (name, age) = user

        assertEquals("John", name)
        assertEquals(20, age)
    }

    @Test
    fun to함수_테스트() {
        data class Triple<out A, out B, out C>(
            val first: A,
            val second: B,
            val third: C
        ): Serializable {
            override fun toString(): String = "($first, $second, $third)"
        }

        infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
        val p1: Pair<String, Int> = "ABC" to 123
        println(p1)

        val p2: Pair<String, Double> = "A" to 3.14
        println(p2)

        val p3 = true to false
        println(p3)
    }

    @Test
    fun Infix없을때_테스트() {
        // tuple 에 인픽스가 정의되어있다.
        val p1: Pair<String, Int> = "A" to 1
    }

}