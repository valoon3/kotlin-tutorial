package ch12_object

class PracticePizzaFactory(val toppings: List<String>) {

    companion object {
        fun hawaiian(): Ingredient {
            return Ingredient(listOf("ham", "pineapple"))
        }

        fun margherita(): Ingredient {
            return Ingredient(listOf("tomato", "mozzarella"))
        }
    }

}

data class Ingredient(val toppings: List<String>) {

}