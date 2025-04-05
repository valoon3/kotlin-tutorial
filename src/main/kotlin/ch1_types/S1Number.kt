package org.example.ch1_types

class S1Number {
    // Int
    val one = 1
    // Long
    val threeBillion = 3000000000
    // Long
    val oneLong = 1L
    val oneByte: Byte = 1

    // Double
    val pi = 3.14
    // Initializer type mismatch, Int is inferred
    // val d: Double = 1
    // Double
    val oneDouble = 1.0
    // Double
    val e = 2.7182818284
    // Float, actual value is 2.7182817
    val eFloat = 2.7182818284f

    // OK, literals are checked statically
    val byte: Byte = 1
    // Initializer type mismatch
    // val intAssignedByte: Int = byte
    val intConvertedByte: Int = byte.toInt()


}