package ch12_object

import kotlin.test.Test

class Part1ObjectExpressionTest {

    @Test
    fun testObjectExpression() {
        val user = User("Jake")

        // 객체 표현식은 바깥에서는 인식될 수 없는 익명 타입의 인스턴스를 만듭니다.
        val producer = object : UserProducer {
            override fun produce(): User = user
        }

        printUser(producer)
    }

    @Test
    fun comTest() {
        val part2ObjectDeclaration = Part2ObjectDeclaration()

        Part2ObjectDeclaration.FakeUserProducer.produce()
    }

}