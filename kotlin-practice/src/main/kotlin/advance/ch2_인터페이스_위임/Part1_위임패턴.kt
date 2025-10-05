package advance.ch2_인터페이스_위임

interface Creature {
    val attackPower: Int
    val defensePower: Int
    fun attack()
}

open class GenericCreature(
    override val attackPower: Int,
    override val defensePower: Int,
): Creature {
    override fun attack() {
        println("Attack with power $attackPower")
    }
}

class Goblin : Creature by GenericCreature(2, 1)

class Goblin2(
    private val creature: Creature = GenericCreature(2, 1)
) : Creature by creature {
    override fun attack() {
        println("It will be special goblin attack!")
        creature.attack()
    }
}

fun main() {
    val goblin = Goblin()
    println(goblin.defensePower)
    goblin.attack()
}