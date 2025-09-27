package advance.ch1_제네릭_변성_제어자

private interface Ch1Part2Animal {
    abstract fun eat()
}

private class Ch1Part2Cat(val name: String): Ch1Part2Animal {
    override fun eat() {
        println("cat $name is eating")
    }
}

private class Ch1Part2Dog(val name: String): Ch1Part2Animal {
    override fun eat() {
        println("dog $name is eating")
    }
}

fun main() {
    fun petAnimals(animalList: List<Ch1Part2Animal>) {
        animalList.forEach { it.eat() }
    }

    // List<out E> -> 공변
    // List 는 읽기만 가능하므로 공변은 적절하다
    val catList1: List<Ch1Part2Animal> = listOf(Ch1Part2Dog("bh"), Ch1Part2Cat("Tom"), Ch1Part2Cat("Cops"))

    // MutableList<E> -> 불공변
    // MutableList 는 읽기와 쓰기가 모두 가능하므로 불공변이 적절하다
    val catList2 = mutableListOf(Ch1Part2Dog("bh"), Ch1Part2Cat("Tom"), Ch1Part2Cat("Cops"))
    petAnimals(catList1)
    println()
    petAnimals(catList2)

    // out 이라는 이름처럼
    // 내부 객체를 외부로 제공하지만 외부 객체를 받아들이지 않는 타입에 적합

    fun addAnimal(mutableList: MutableList<Ch1Part2Animal>, animal: Ch1Part2Animal) {
        mutableList.add(animal)
    }

    addAnimal(catList2, Ch1Part2Dog("happy"))
}