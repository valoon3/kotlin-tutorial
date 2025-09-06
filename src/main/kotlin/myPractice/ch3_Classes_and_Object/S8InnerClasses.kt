package org.example.myPractice.ch3_Classes_and_Object

class S8InnerClasses {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

val demo = _root_ide_package_.org.example.myPractice.ch3_Classes_and_Object.S8InnerClasses().Inner().foo() // == 1