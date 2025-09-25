package funional.ch9_시쿼스

// scope function
// 객체를 사용할 때 Scope(범위, 영역) 를 일시적으로 만들어서
// 속성(property)나 함수를 처리하는 용도로 사용되는 함수이다.
// 간편한 코드 사용과 가독성, 빌더 패턴의 이용,
// 부가적인 후처리 등을 하는 데에 도움을 준다.

// fun <T, R> T.let(block: (T) -> R): R
// let 함수는 매개변수화된 타입 T의 확장 함수이다.(extension)
// 자기 자신을 받아서 R을 반환하는((T) -> R) 람다 식을 입력으로 받고,
// 블럭 함수의 반환값 R을 반환한다.
// 여기서는 Person 클래스의 확장 함수로 사용되어
// person.let 의 형태가 가능해진다.

class UserCreationRequest(
    val id: String,
    val name: String,
    val surname: String,
)

class UserDto(
    val userId: String,
    val firstName: String,
    val lastName: String,
)

fun UserCreationRequest.toUserDto() = UserDto(
    id,
    name,
    surname
)

// fun<T> T.also(block: (T) -> Unit): T {
//     block(this)
//     return this
// }

fun addUser(request: UserCreationRequest) =
    request.toUserDto()
        .also { it -> println(it) }