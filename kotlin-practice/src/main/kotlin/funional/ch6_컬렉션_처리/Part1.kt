package funional.ch6_컬렉션_처리

inline fun <T> Iterable<T>.forEach(action: (T) -> Unit) {
    for (element in this) action(element)
}

inline fun <T, C : Iterable<T>> C.onEach(
    action: (T) -> Unit
): C {
    for (element in this) action(element)
    return this
}

fun main() {

    // inline
    fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
        val destination = ArrayList<T>()

        for (element in this) {
            if (predicate(element)) {
                destination.add(element)
            }
        }

        return destination
    }

}