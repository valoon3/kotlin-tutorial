package org.example.ch3_Classes_and_Object

class S3Properties(var name: String = "Holmes, Sherlock", var street: String = "Baker") {

    // var 은 getter setter 가 존재한다
    var age: Int = 10

    // val 은 불변객체로 getter 만 존재한다
    val valProps = listOf("name", "street", "age")
}