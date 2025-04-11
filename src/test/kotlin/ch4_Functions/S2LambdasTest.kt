package ch4_Functions

import org.junit.jupiter.api.Assertions.*
import java.util.*
import kotlin.test.Test

class S2LambdasTest {
    @Test
    fun testLambda() {
        // 람다식
        val sum = { a: Int, b: Int -> a + b }
        assertEquals(3, sum(1, 2))

        // 람다식의 매개변수 생략
        val sum2 = { a: Int, b: Int -> a + b }
        assertEquals(3, sum2(1, 2))

        // 람다식의 반환값
        val square = { x: Int -> x * x }
        assertEquals(4, square(2))
    }

    @Test
    fun testLambdaWithReceiver() {
        // 수신자 객체를 사용하는 람다식
        val result = StringBuilder().apply {
            append("Hello")
            append(" ")
            append("World")
        }.toString()

        assertEquals("Hello World", result)
    }

    @Test
    fun paramCallbackFun() {
        fun <T, R> Collection<T>.ppp(
            initial: R, combine: (acc: R, nextElement: T) -> R
        ): R {
            var accumulator: R = initial
            for (element: T in this) {
                accumulator = combine(accumulator, element)
            }

            return accumulator
        }

        val items = listOf(1, 2, 3, 4, 5)

        // 매개변수로 전달된 람다식
        val ppp = items.ppp(10, { a, b -> a + b })
        assertEquals(25, ppp)
    }

    @Test
    fun declarationArrowFunction() {
        // 수식 객체 지정 람다
        // String. : 수신 객체 타입 String 클래스의 확장 함수처럼 동작한다
        // this 키워드를 통해 String 객체에 접근할 수 있다
        val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
        repeatFun("Hello", 10)

        fun runTransformation(f: (String, Int) -> String): String {
            return f("hello", 3)
        }

        val result = runTransformation(repeatFun)

        // 람다식의 마지막 라인이 리턴된다
        val tt: (String) -> String = {
            "asdf"
            "tt"
        }
        assertEquals("tt", tt("Hello"))
    }

    @Test
    fun stringPlus() {
        // String 클래스의 plus() 메서드 참조
        val stringPlus: (String, String) -> String = String::plus
        assertEquals("Hello, world!", stringPlus("Hello, ", "world!"))
        assertEquals("<- ->", stringPlus.invoke("<- ", "->"))
    }

    @Test
    fun intPlus() {
        val intPlus: Int.(Int) -> Int = Int::plus
        assertEquals(3, intPlus(1, 2))
        assertEquals(3, intPlus.invoke(1, 2))
        println(2.intPlus(3)) // extension-like call
    }

    object MyFunction {
        operator fun invoke(string: String): String {
            return string.reversed()
        }
    }

    @Test
    fun invokeTest() {
        // invoke 연산자는 이름 없이 호출될 수 있다
        assertEquals("olleH", MyFunction.invoke("Hello"))
        assertEquals("olleH", MyFunction("Hello"))

        // 람다식은 invoke 연산자를 사용하여 호출하는 셈이다
        val mySecondFunction = { time: String ->
            time.reversed()
        }
        assertEquals("olleH", mySecondFunction.invoke("Hello"))
        assertEquals("olleH", mySecondFunction("Hello"))

        val toUpperCase = { str: String -> str.uppercase() }
        val strList = listOf("a", "b", "c")
        assertEquals("[A, B, C]", strList.map(toUpperCase).toString()) // [A,B,C]

        // 람다식은 결국 런타임 시 invoke 를 하나 가지는 오브젝트로 변환된다
    }

    @Test
    fun passingTrailingLambdas() {
        // Kotlin 컨벤션에 따르면, 함수의 마지막 매개 변수가 함수 인 경우
        // 해당 인수가 괄호 안에 배치될 수 있다
        val items = listOf(1, 2, 3, 4, 5)
        val product = items.fold(1) { acc, e -> acc + e }
        assertEquals(16, product)

        // 매개변수가 하나의 람다인 경우 () 를 생략할 수 있다
        val returnFunctionResult: ((a: String) -> String) -> String = {
            it("Hello")
        }

        assertEquals("olleH", returnFunctionResult { a: String -> a.reversed() } )
    }

    @Test
    fun singleParamImplicitName() {
        // 람다식의 경우 단일 매개변수만 있는 것이 매우 일반적이다
        // 람다식에서 매개변수가 없는 경우 -> 를 생략할 수 있고
        // 하나인 경우 암시적으로 컴파일 단계에서 선언되며 it 이라는 이름을 가진다

        val noParamFunction: () -> String = { "test" }
        val singleParamFunction: (String) -> String = { it.reversed() }

        assertEquals("test", noParamFunction())
        assertEquals("tset", singleParamFunction("test"))
    }
}