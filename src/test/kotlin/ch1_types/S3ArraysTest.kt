package ch1_types

import org.example.ch1_types.S1Arrays
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class S3ArraysTest {
    private val s1Arrays = S1Arrays()

    @Test
    fun whenToUseArrays() {
        var origin = arrayOf("Nile", "Amazon", "Yangtze")
        // += 를 사용하면 새로운 객체가 생성되는가
        var arr = origin + "Mississippi"

        // 서로 다른 객체인가
        assertEquals(false, origin === arr)
        // 내부 내용이 다른가
        assertEquals(false, origin.contentEquals(arr))

        val result = s1Arrays.whenToUseArrays()
        // += 했을 때 Mississippi 가 잘 포함되는가
        assertEquals("Nile, Amazon, Yangtze, Mississippi", result)
    }

    @Test
    fun createArrays1() {
        val result = s1Arrays.createArrays1()
        // 1, 2, 3
        assertEquals("1, 2, 3", result)
    }

    @Test
    fun createArrays2() {
        val result = s1Arrays.createArrays2()
        // null, null, null
        assertEquals("null, null, null", result)
    }

    @Test
    fun createArrays3() {
        val result = s1Arrays.createArrays3()
        // 0, 0, 0
        assertEquals("0, 0, 0", result)
    }

    @Test
    fun createArrays() {
        // 배열 초기화
        val asc = Array(5) { i -> i.toString() }
        // 0, 1, 2, 3, 4
        assertEquals("0, 1, 2, 3, 4", asc.joinToString())

        val result = s1Arrays.createArrays()
        // 0, 1, 4, 9, 16
        assertEquals("0, 1, 4, 9, 16", result)
    }

    @Test
    fun nestedArrays() {
        // 중첩 배열 [[0, 0], [0, 0]]
        val twoDArray = Array(2) { Array<Int>(2) { 0 } }
        assertEquals("[[0, 0], [0, 0]]", twoDArray.contentDeepToString())

        // Creates a three-dimensional array
        val threeDArray = Array(3) {
            Array(3) {
                Array<Int>(3) { 0 }
            }
        }
        assertEquals("[[[0, 0, 0], [0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0, 0, 0]]]", threeDArray.contentDeepToString())
    }

    @Test
    fun numberOfArguments() {
        // 1, 2, 3
        val result = s1Arrays.numberOfArguments()
        assertEquals("abcd", result)
    }

    @Test
    fun compareArrays() {
        val arr1 = arrayOf(1, 2, 3)
        val arr2 = arrayOf(1, 2, 3)
        // 서로 다른 객체인가
        assertEquals(false, arr1 === arr2)
        // 내부 내용이 같은가
        assertEquals(true, arr1.contentEquals(arr2))
    }

    @Test
    fun transformArraysSum() {
        val result = s1Arrays.transformArraysSum()
        // 6
        assertEquals(6, result)
    }

    @Test
    fun transformArraysShuffle() {
    }

    @Test
    fun arrConvertList() {
        val arr = arrayOf(1, 2, 3)
        // List 로 변환
        val list = arr.toList()
        // [1, 2, 3]
        assertEquals("[1, 2, 3]", list.toString())

        // list 의 타입은 ArrayList 이다
        assertEquals(ArrayList::class, list::class)
    }

    @Test
    fun arrConvertSet() {
        val arr = arrayOf(1, 2, 3)
        // Set 으로 변환
        val set = arr.toSet()
        // [1, 2, 3]
        assertEquals("[1, 2, 3]", set.toString())

        // set 의 타입은 HashSet 이다
        assertEquals(LinkedHashSet::class, set::class)
    }

    @Test
    fun arrConvertMap() {
        val arr = arrayOf("a", "b", "c", "c")
        // Map 으로 변환
        val map = arr.groupBy { it }

        // {a=[a], b=[b], c=[c, c]}
        assertEquals("{a=[a], b=[b], c=[c, c]}", map.toString())

        // map 의 타입은 LinkedHashMap 이다
        assertEquals(LinkedHashMap::class, map::class)

        assertEquals("{apple=140, banana=150, cherry=90}", s1Arrays.arrConvertMap().toString())
    }
}