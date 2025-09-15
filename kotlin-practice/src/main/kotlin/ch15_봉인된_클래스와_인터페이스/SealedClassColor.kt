package ch15_봉인된_클래스와_인터페이스

sealed class  SealedColor() {

    data class Red(val r: Int, val g: Int, val b: Int): SealedColor()
    data class Orange(val r: Int, val g: Int, val b: Int): SealedColor()
    data class Yellow(val r: Int, val g: Int, val b: Int): SealedColor()
    data class Green(val r: Int, val g: Int, val b: Int): SealedColor()

    // data class 를 하나를 추가하면 사용하는 곳에도 무조건 추가해줘야한다

    companion object {
        fun fromString(color: SealedColor): String {
            return when (color) {
                is Red -> "빨강"
                is Orange -> "오렌지"
                is Yellow -> "노랑"
                is Green -> "초록"
            }
        }
    }

    fun printColor(color: SealedColor) {
        when (color) {
            is Red -> println("r: ${color.r}, g: ${color.g}, b: ${color.b}")
            is Orange -> println("r: ${color.r}, g: ${color.g}, b: ${color.b}")
            is Yellow -> println("r: ${color.r}, g: ${color.g}, b: ${color.b}")
            else -> println("Invalid color")
        }
    }

}

