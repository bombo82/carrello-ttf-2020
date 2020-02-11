package carrellottf.backend;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void userTest() throws Exception {
        User u = UserRepository.getInstance().get("user1");
        if (!u.getLogin().equals("user1"))
            throw new Exception();
    }

    @Test
    void userTest2() throws Exception {
        User u = UserRepository.getInstance().get("user2");
        if (!u.getLogin().equals("user2"))
            throw new Exception();
    }

}
