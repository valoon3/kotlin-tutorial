package advance.ch1_제네릭_변성_제어자

sealed class LinkedList<out T> {
    object Nil : LinkedList<Nothing>()

    data class Node<T>(
        val head: Int,
        val tail: LinkedList<T>
    ) : LinkedList<T>()

    class Empty<T> : LinkedList<T>()
}

fun main() {
    class Box<out T> {
        private var value: T? = null

//        fun set(value: T) { // 컴파일 에러
//            this.value = value
//        }

        // private 은 가능
        private fun set(value: T?) {
            this.value = value
        }

        fun get(): T? = value
    }
}