package advance.ch2_인터페이스_위임

interface Creature {
    val attackPower: Int
    val defensePower: Int
    fun attack()
}

class GenericCreature(
    override val attackPower: Int,
    override val defensePower: Int,
): Creature {
    override fun attack() {
        println("Attack with power $attackPower")
    }
}

class Goblin : Creature {
    private val delegate = GenericCreature(2, 1)
    override val attackPower: Int = delegate.attackPower
    override val defensePower: Int = delegate.defensePower

    override fun attack() = delegate.attack()
}

fun main() {
    val goblin = Goblin()
    println(goblin.defensePower)
    goblin.attack()
}