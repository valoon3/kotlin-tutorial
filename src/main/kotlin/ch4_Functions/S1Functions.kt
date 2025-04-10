package org.example.ch4_Functions

class S1Functions {

    fun main() {
        // 매개변수 설정을 함으로써 기본 인수를 사용할 수 있다
        read(target = 10);

        lamdaFunc {
            println("Hello")
        }

        foo(strings = *arrayOf("a", "b", "c"))

        // * 는 kotlin 에서 spread operator 이다
        val a = intArrayOf(1, 2, 3) // IntArray is a primitive type array
        val list = listOf(-1, 0, *a.toTypedArray(), 4)
    }

    open class A {
        open fun foo(i: Int = 10) { /*...*/ }
    }

    class B : A() {
        // No default value is allowed.
        override fun foo(i: Int) { /*...*/ }
    }

    // kotlin 은 기본 인수를 설정할 수 있다
    fun read(sample: Int = 10, target: Int): Int {
        return sample;
    }


    // 기본 매개 변수의 마지막 인수가 Lambda 인 경우
    // 이름이 지정된 인수 또는 괄호 안에 전달할 수 있습니다.
    fun lamdaFunc(bar: Int = 0, baz: Int = 1, qux: () -> Unit,) {

    }

    fun foo(vararg strings: String) { /*...*/ }

    // 함수가 유용한 값을 반환하지 않으면 반환 유형은 Unit
    // 장치는 값이 하나만있는 유형입니다.
    // 이 값은 명시 적으로 반환 할 필요가 없습니다.
    fun printHello(name: String?): Unit {
        if (name != null)
            println("Hello $name")
        else
            println("Hi there!")
        // `return Unit` or `return` is optional
    }

    // 내부 함수 선언
//    fun dfs(graph: Graph) {
//        val visited = HashSet<Vertex>()
//        fun dfs(current: Vertex) {
//            if (!visited.add(current)) return
//            for (v in current.neighbors)
//                dfs(v)
//        }
//
//        dfs(graph.vertices[0])
//    }

    fun varargTestFunction() {
        fun nonVararg(person: String): String {
            return person;
        }

        fun vararg(vararg people: String) {
            for(person in people) {
                println(person)
            }
        }
    }





}