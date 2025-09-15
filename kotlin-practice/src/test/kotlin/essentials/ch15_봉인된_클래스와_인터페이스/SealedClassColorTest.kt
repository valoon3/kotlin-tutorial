package essentials.ch15_봉인된_클래스와_인터페이스

import kotlin.test.Test
import kotlin.test.assertEquals

class SealedClassColorTest {

    @Test
    fun sealedClassColorTest() {
        val red = SealedColor.Red(10, 10, 10)
        val orange = SealedColor.Orange(10, 10, 10)
        val yellow = SealedColor.Yellow(10, 10, 10)

        assertEquals("빨강", SealedColor.fromString(red))
        assertEquals("오렌지", SealedColor.fromString(orange))
        assertEquals("노랑", SealedColor.fromString(yellow))
    }

}