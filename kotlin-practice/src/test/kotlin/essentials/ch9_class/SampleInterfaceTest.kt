package essentials.ch9_class

import kotlin.test.Test

class SampleInterfaceTest {

    @Test
    fun 페이크_유저_정상_리파지토리_테스트() {
        // when
        val repo: UserRepository = FakeUserRepository("name", "surName")
        repo.addUser(User(1, "Zed"))

        // then
        val user = repo.findUser(1)
        assert(user?.name == "Zed")
    }

}