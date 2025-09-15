package essentials.ch12_object

import kotlin.test.Test
import kotlin.test.assertEquals

class PracticePizzaFactoryTest {

    @Test
    fun 하와이안_피자_테스트() {
        val expected = listOf("ham", "pineapple")
        val result = PracticePizzaFactory.hawaiian().toppings
        assertEquals(expected, result)
    }

    @Test
    fun 마게리따_피자_테스트() {
        val expected = listOf("tomato", "mozzarella")
        val result = PracticePizzaFactory.margherita().toppings

        assertEquals(expected, result)
    }

}