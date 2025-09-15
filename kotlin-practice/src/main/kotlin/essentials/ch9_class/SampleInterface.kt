package essentials.ch9_class

class SampleInterface {
}

class User(val id: Int, val name: String)

interface UserRepository {
    fun findUser(id: Int): User? =
        getUsers().find { it.id == id }

    fun addUser(user: User)

    fun getUsers(): List<User>
}

interface Name {
    val name: String
    val surName: String
}

class FakeUserRepository(
    override val name: String,
    override val surName: String
): UserRepository, Name {

    private var users = mapOf<Int, User>()

    override fun findUser(id: Int): User? {
        return users[id]
    }

    override fun addUser(user: User) {
        users += (user.id to user)
    }

    override fun getUsers(): List<User> {
        return users.values.toList()
    }
}