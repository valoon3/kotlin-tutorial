package funtional.ch6_시퀀스

import funional.ch9_시쿼스.UserCreationRequest
import funional.ch9_시쿼스.UserDto
import kotlin.test.Test

class Ex2_let_and_also_Test {

    @Test
    fun letTest() {
        fun createUserDto(request: UserCreationRequest): UserDto {
            return request.let { it -> UserDto(
                it.id,
                it.name,
                it.surname
            )}
        }

        val userRequest = UserCreationRequest("id", "name", "surname")
        userRequest.let { it -> createUserDto(it) }
    }

}