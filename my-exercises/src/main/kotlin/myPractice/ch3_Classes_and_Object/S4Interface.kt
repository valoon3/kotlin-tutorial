package org.example.myPractice.ch3_Classes_and_Object

interface S4Interface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child : org.example.myPractice.ch3_Classes_and_Object.S4Interface {
    override val prop: Int = 29
}

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : org.example.myPractice.ch3_Classes_and_Object.A {
    override fun bar() { print("bar") }
}

class D : org.example.myPractice.ch3_Classes_and_Object.A, org.example.myPractice.ch3_Classes_and_Object.B {
    override fun foo() {
        super<org.example.myPractice.ch3_Classes_and_Object.A>.foo()
        super<org.example.myPractice.ch3_Classes_and_Object.B>.foo()
    }

    override fun bar() {
        super<org.example.myPractice.ch3_Classes_and_Object.B>.bar()
    }
}