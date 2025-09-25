package advance.ch1_제네릭_변성_제어자

// 타입 매개변수에 변성 제어자 (out 과 in) 가 없으면
// 불공변(invariant) 이라고 한다.
// 정확히 일치하는 타입만 인수로 받을 수 있다.

class Box<T>(val value: T)

open class Dog

class Puppy: Dog()

// in 제어자는 반공변(contravariant) 이라고 한다.
class Box2<in T>

open class Dog2

class Puppy2: Dog2()

// 불공변: 타입의 상속 관계가 제네릭에서는 아무 의미가 없음
// 공변: 타입의 상속 관계가 제네릭에서도 '자연스럽게' 유지
// 반공변: 타입의 상속 관계가 제네릭에서는 '반대로' 적용

fun main() {
    val d: Dog = Puppy() // Puppy 는 Dog 의 서브타입

    val bb: Box<Dog> = Box<Dog>(d);
//    val bd: Box<Dog> = Box<Puppy>(); // 오류: 불공변

    val dog: Dog2 = Puppy2() // Puppy 는 Dog 의 서브타입
//    val bdog: Box2<Dog2> = Box2<Puppy2>() // 타입 불일치
    val boxPuppy: Box2<Puppy2> = Box2<Dog2>()
    val boxInt: Box2<Int> = Box2<kotlin.Number>()
}