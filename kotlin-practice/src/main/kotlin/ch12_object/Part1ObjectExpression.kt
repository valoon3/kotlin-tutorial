package ch12_object

class Part1ObjectExpression {

    var value: Any? = NOT_SET

    fun initialized() = value != NOT_SET

    companion object {
        private val NOT_SET = Any()
    }

}

data class User(val name: String)

interface UserProducer {
    fun produce(): User
}

fun printUser(producer: UserProducer) {
    println(producer.produce())
}