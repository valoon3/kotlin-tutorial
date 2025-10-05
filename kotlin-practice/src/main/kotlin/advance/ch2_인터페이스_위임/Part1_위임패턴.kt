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

fun main() {
    val goblin = Goblin()
    println(goblin.defensePower)
    goblin.attack()
}