package essentials.ch16_애너테이션_클래스

import kotlin.test.Test
import kotlin.test.assertEquals

class Part1ListTest {

    @Test
    fun testList() {
        var list = listOf(1, 2, 3)

        // read only List
//        list += 4
//        list = list + 4
//        list.add()
    }

    @Test
    fun testMutableList() {
        val list = mutableListOf(1, 2, 3)

        list += 4
        list.add(5)

        assertEquals(listOf(1,2,3,4,5), list)
    }

}