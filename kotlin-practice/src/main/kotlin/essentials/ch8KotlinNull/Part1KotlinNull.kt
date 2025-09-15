package essentials.ch8KotlinNull

class Part1KotlinNull {

    fun getSafeCall(str: String?): String {
        var result = "result"

        result += str?.length ?: 0

        return result
    }

    fun elvisPresleyExpression(str: String?): String {
        return str ?: "default"
    }

}