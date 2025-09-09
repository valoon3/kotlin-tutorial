package ch7_for

class Part1for {
    fun iterableFor() {
        val listOf = listOf<String>("A", "B", "C")

        for(a in listOf) {
            println(a)
        }
    }

    fun intRange() {
        for (i in 1..10) {
            println(i)
        }
    }
}

class Tree (
    val value: String,
    val left: Tree? = null,
    val right: Tree? = null,
): Iterable<String> {
    override fun iterator(): Iterator<String> = iterator() {
        if(left != null) yieldAll(left)
        yield(value)
        if(right != null) yieldAll(right)
    }
}