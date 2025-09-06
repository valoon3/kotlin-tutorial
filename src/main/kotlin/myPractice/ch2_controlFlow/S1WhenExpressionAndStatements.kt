package org.example.myPractice.ch2_controlFlow

// 표현식과 구문식
class S1WhenExpressionAndStatements {

    fun expressionError() {
        var x = 3

        // 표현식에서는 else 가 없없을 시 컴파일 에러
        val text = when (x) {
            1 -> "x == 1"
            2 -> "x == 2"
            else -> "x is neither 1 nor 2"
        }

        // 구문에서는 else 가 없을 시 컴파일 에러가 나지 않음
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
        }

        // 공통 조작 가능
        when (x) {
            1, 2 -> print("x == 1, 2")
            else -> print("x is neither 1 nor 2")
        }

        var s = "3"

        // 임의 표현식을 사용할 수 있다
        when (x) {
            s.toInt() -> print("s encodes x")
            else -> print("s does not encode x")
        }

        // .. 를 사용해서 범위로 표현 가능
        when (x) {
            in 1..10 -> print("x is in the range")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }
    }

    fun withIndex(): String {
        var result = "";
        var arr = arrayOf("a", "b", "c")

        // withIndex() 를 사용하여 인덱스와 값을 함께 가져올 수 있다
        for((index, value) in arr.withIndex()) {
            result += arr[index] + value
        }

        return result
    }

}