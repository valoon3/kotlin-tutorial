package essentials.ch12_object

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class Part2ObjectDeclaration {
    data class User(val name: String)

    interface UserProducer {
        fun produce(): User
    }


    object FakeUserProducer: UserProducer {
        override fun produce(): User = User("Fake")
    }

    fun setUserProducer(producer: UserProducer) {
        println(producer.produce())
    }
}

abstract class Money(
    val amount: BigDecimal,
    val currency: String
)

class USD(amount: BigDecimal): Money(amount, "USD") {
    companion object {
        private val MATH = MathContext(2, RoundingMode.HALF_EVEN)

        fun from(amount: Int): USD = USD(BigDecimal(amount, MATH))

        fun from(amount: Double): USD = USD(BigDecimal(amount, MATH))

        @Throws(NumberFormatException::class)
        fun from(amount: String): USD = USD(amount.toBigDecimal())
    }
}
