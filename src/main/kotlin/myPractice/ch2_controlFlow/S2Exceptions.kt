package org.example.myPractice.ch2_controlFlow

import javax.management.BadBinaryOpValueExpException

class S2Exceptions {

    fun requireFunction(num: Int): Int {
        // 사용자의 입력 유효성을 검증한다
        // 이 에러는 IllegalArgumentException 을 발생시킨다
        require(num == 0) { "count 는 0 이어야만 합니다." }

        return num;
    }

    fun checkFunction(param: String?) {
        // 객체 또는 가변상태의 유효성을 검증한다
        // 이 에러는 IllegalStateException 을 발생시킨다
        checkNotNull(param) {
            "param 은 null 이 될 수 없습니다."
        }
    }

    fun errorFunction() {
        // 오류를 나타낸다
        error("이것은 오류입니다.")
    }

}