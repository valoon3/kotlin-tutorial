package essentials.ch6_function

fun main() {
    val res: Unit = someFunction()
    println(res)
}

// 1. Unit
fun someFunction(): Unit = println("Hello!")
fun someFunctionNormal() {
    return Unit
}

// 2. vararg 매개변수
fun concatenate(vararg strings: Any): String {
    // strings 의 타입은 Array<String> 입니다.
    return strings.joinToString()
}

fun namedParameterSyntax(name: String, surname: String): String {
    return "$name $surname"
}