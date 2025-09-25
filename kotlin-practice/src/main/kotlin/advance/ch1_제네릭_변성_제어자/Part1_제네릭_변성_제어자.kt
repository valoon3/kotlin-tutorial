package advance.ch1_제네릭_변성_제어자

// 타입 매개변수에 변성 제어자 (out 과 in) 가 없으면
// 불공변(invariant) 이라고 한다.
// 정확히 일치하는 타입만 인수로 받을 수 있다.

private class Box<T>(val value: T)

private open class Ch1Part1Dog(val name: String = "Part1Dog")

private class Ch1Part1Puppy(name: String = "Part1Puppy"): Ch1Part1Dog(name)

// in 제어자는 반공변(contravariant) 이라고 한다.
private class Ch1Part1Box2<in T>

private open class Ch1Part1Dog2(val name: String = "Part1Dog2")

private class Ch1Part1Puppy2(name: String = "Part1Puppy2"): Ch1Part1Dog2(name)

// 불공변: 타입의 상속 관계가 제네릭에서는 아무 의미가 없음
// 공변: 타입의 상속 관계가 제네릭에서도 '자연스럽게' 유지
// 반공변: 타입의 상속 관계가 제네릭에서는 '반대로' 적용

fun main() {
    val d: Ch1Part1Dog = Ch1Part1Puppy("Part1Puppy") // Part1Puppy 는 Part1Dog 의 서브타입

    val bb: Box<Ch1Part1Dog> = Box<Ch1Part1Dog>(d);
//    val bd: Box<Part1Dog> = Box<Part1Puppy>(); // 오류: 불공변

    val dog: Ch1Part1Dog2 = Ch1Part1Puppy2("Part1Puppy2") // Part1Puppy2 는 Part1Dog2 의 서브타입
//    val bdog: Box2<Part1Dog2> = Box2<Part1Puppy2>() // 타입 불일치
    val boxPuppy: Ch1Part1Box2<Ch1Part1Puppy2> = Ch1Part1Box2<Ch1Part1Dog2>()
    val boxInt: Ch1Part1Box2<Int> = Ch1Part1Box2<kotlin.Number>()
}