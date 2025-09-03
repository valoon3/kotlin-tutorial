package org.example.ch3_Classes_and_Object

class S8InnerClasses {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

val demo = S8InnerClasses().Inner().foo() // == 1