package org.example.ch3_Arrays

class S1Arrays {

    fun whenToUseArrays(): String {
        var riversArray = arrayOf("Nile", "Amazon", "Yangtze")

        // += 를 사용하는 것을 새로운 객체를 생성
        riversArray += "Mississippi"

        // Nile, Amazon, Yangtze, Mississippi
        return riversArray.joinToString()
    }

    fun createArrays1(): String {
        // Creates an array with values [1, 2, 3]
        val simpleArray = arrayOf(1, 2, 3)

        return simpleArray.joinToString()
    }

    fun createArrays2(): String {
        // Creates an array with values [null, null, null]
        val nullArray: Array<Int?> = arrayOfNulls(3)

        // null, null, null
        return nullArray.joinToString()
    }

    fun createArrays3(): String {
        // 배열의 크기만큼 0으로 초기화
        val initArray = Array<Int>(3) { 0 }

        // 0, 0, 0
        return initArray.joinToString()
    }

    fun createArrays(): String {
        // Array 배열 5 ["0", "1", "4", "9", "16"] 로 초기화
        val asc = Array(5) { i -> (i * i).toString() }

        // 014916
        return asc.joinToString()
    }

    fun nestedArrays() {
        // 중첩 배열 [[0, 0], [0, 0]]
        val twoDArray = Array(2) { Array<Int>(2) { 0 } }
        println(twoDArray.contentDeepToString())

        // Creates a three-dimensional array
        val threeDArray = Array(3) {
            Array(3) {
                Array<Int>(3) { 0 }
            }
        }
        // [[[0, 0, 0], [0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0, 0, 0]]]
        println(threeDArray.contentDeepToString())
    }

    fun numberOfArguments(): String {
        // vararg 를 통해서 가변 인자 사용이 가능하다
        fun printAllStrings(vararg strings: String): String {
            var result: String = ""
            for (string in strings) result += string

            return result;
        }

        // 만약 vararg 파라미터가 제네릭 타입일 경우, *을 생략해도 Array<out T> 타입은 인자로 받아들일 수 있다.
        val lettersArray = arrayOf("c", "d")
        // abcd
        return printAllStrings("a", "b", *lettersArray)
    }

    fun <T> compareArrays(arr1: Array<T>, arr2: Array<T>): Boolean {

        // 두 배열이 동일한 순서로 동일한 요소를 갖는지 비교하려면 .contentEquals () 및 .contentDeepEquals () 함수를 사용하십시오.
        return arr1.contentEquals(arr2)

        // 평등 (==)과 불평등 (! =) 연산자를 사용하여 배열의 내용을 비교하지 마십시오. 이 연산자는 할당 된 변수가 동일한 객체를 가리키는 지 여부를 확인합니다.
    }

    fun transformArraysSum(): Int {
        val sumArray = arrayOf(1, 2, 3)

        return sumArray.sum()
    }

    fun transformArraysShuffle(): String {
        // 배열에서 요소를 무작위로 셔플
        val simpleArray = arrayOf(1, 2, 3)
        simpleArray.shuffle()

        return simpleArray.joinToString()
    }

    fun arrConvertList(): List<String> {
        val simpleArray = arrayOf("a", "b", "c", "c")

        // Converts to a List
        return simpleArray.toList()
    }

    fun arrConvertSet(): Set<String> {
        val simpleArray = arrayOf("a", "b", "c", "c")

        // Converts to a Set
        return simpleArray.toSet()
    }

    fun arrConvertMap(): Map<String, Int> {
        val pairArray = arrayOf("apple" to 120, "banana" to 150, "cherry" to 90, "apple" to 140)

        return pairArray.toMap()
    }

}