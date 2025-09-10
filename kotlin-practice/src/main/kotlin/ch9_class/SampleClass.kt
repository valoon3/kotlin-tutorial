package ch9_class

class SampleClass() {

    var name: String = ""
        get() = field.uppercase()

    var koreanAge: Int = 0
        set(value) { field = value + 1 }

    val userInfo1 = "Name: $name, Age: $koreanAge"
}

class NoConstructorClass(info1: String, info2: String) {
    var totalInfo: String = "default info";

    // 부생성자
    constructor(info1: String, info2: Int): this(info1, info2.toString()) {
        totalInfo = "$info1 and $info2"
    }
}
class ConstructorClass {
    constructor(info1: String, info2: String) {
        val totalInfo = "$info1 and $info2"
    }
}

// 코틀린에서는 클래스 내부에 클래스를 정의할 수 있다.
// 기본적으로 정적이라서 외부 클래스로의 직접적인 연결 관계가 없다.
class InnerClass {
    class InnerClassInInnerClass1 {
        fun getMethod(): String = "This is inner class method"
    }

    inner class InnerClassInInnerClass2 {
        fun getMethod(): String = "This is inner class method"
    }
}