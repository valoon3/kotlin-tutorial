package org.example.ch3_Classes_and_Object

class S1Classes(name: String) {
    val firstProperty = "First property: $name".also(::println)

    // 클래스 초기화 시 기본 값도 가능
    // 후행 쉼표도 가능
    class Person(val firstName: String, val lastName: String, var isEmployed: Boolean = true, )

    // 생성자에 주석 또는 가시성 생성자가 있다면
//    class Customer public @Inject constructor(name: String) { /*...*/ }

    init {
        println("Initializing $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

    abstract class Polygon {
        abstract fun draw()

        open fun resize(factor: Double) {
            println("Resizing polygon by a factor of $factor")
        }
    }

    class Rectangle : Polygon() {
        override fun draw() {

        }
    }

    class Square : Polygon() {
        override fun draw() {
            println("Drawing a square")
        }

        // open method 는 override 를 선택해서 할 수 있다
        override fun resize(factor: Double) {
            super.resize(factor)
            println("Resizing square by a factor of $factor")
        }
    }

    open class Base(p: Int)

    // 상속
    class Derived(p: Int) : Base(p)

    // 선언을 사용해서 오버라이드가 가능하다
    interface Shape2 {
        val vertexCount: Int
    }

    class Rectangle2(override val vertexCount: Int = 4) : Shape2 // Always has 4 vertices

    class Polygon2 : Shape2 {
        override var vertexCount: Int = 0  // Can be set to any number later
    }

}
