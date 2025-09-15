package essentials.ch11_data_class

import java.io.Serializable

class Part11DataClass {

    // equals: == 를 사용해 두 객체를 비교합니다.
    // hashCode: 해시 테이블 기반의 컬렉션에서 사용합니다.
    // toString: 문자열 템플릿 또는 print 함수와 같이 객체를 문자열로 표현할때 쓰입니다.


}

data class User(val name: String, val age: Int)

data class Company(val name: String, val user: User)

data class Pair<out A, out B>(val first: A, val second: B): Serializable {
    override fun toString(): String = "($first, $second)"

    infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
}