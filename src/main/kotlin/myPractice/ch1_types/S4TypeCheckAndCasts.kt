package org.example.myPractice.ch1_types

class S4TypeCheckAndCasts {

    fun isOperator(value: Any): Boolean {
        return value is String;
    }

    fun controlFlow(value: Any): String {
        return when (value) {
            is String -> "String"
            is Int -> "Int"
            is Double -> "Double"
            else -> "Unknown type"
        }
    }

}