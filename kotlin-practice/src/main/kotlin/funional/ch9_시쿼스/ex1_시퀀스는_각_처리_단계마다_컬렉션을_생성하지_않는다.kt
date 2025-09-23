package funional.ch9_시쿼스

class ex1_시퀀스는_각_처리_단계마다_컬렉션을_생성하지_않는다 {



}

fun main() {
    val numbers = List(1_000_000) { it }

    numbers
        .filter { it % 10 == 0 }    // 컬렉션 하나 생성
        .map { it * 2 }             // 컬렉션 하나 생성
        .sum()

    numbers
        .asSequence()
        .filter { it % 10 == 0 }
        .map { it * 2 }
        .sum()                      // 컬렉션 생성되지 않음
}