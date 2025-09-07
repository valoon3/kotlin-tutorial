package org.example.myPractice.ch3_Classes_and_Object

class S3Properties(var name: String = "Holmes, Sherlock", var street: String = "Baker") {

    // var 은 getter setter 가 존재한다
    var age: Int = 10

    // val 은 불변객체로 getter 만 존재한다
    val valProps = listOf("name", "street", "age")

    var money: Int = 1000
        get() {
            // field 는 프로퍼티의 backing field 를 나타낸다
            // field 는 getter setter 에서만 사용할 수 있다
            return field * 2
        }

    val pay: Int
        get() {
            // getter 재정의
            return money * 2
        }
}