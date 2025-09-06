package org.example.myPractice.ch3_Classes_and_Object

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

open class Shape
class Rectangle: org.example.myPractice.ch3_Classes_and_Object.Shape()


class Example {
    fun printFunctionType(): String { return "Class method" }
}

class MyClass {
    companion object { }  // will be called "Companion"
}
