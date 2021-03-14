package IfElse;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserLoginServiceTest {

    @Test
    public void loginTest() {
        var service = new UserLoginService();
        var user1 = new User("user1", "user1");
        assertFalse(service.login(user1, "123"));
        assertFalse(service.login(user1, "12"));
        assertFalse(service.login(user1, "1"));
        assertFalse(service.login(user1, "user"));
        var user2 = new User("user2", "1234");
        assertFalse(service.login(user2, "123"));
        assertTrue(service.login(user2, "1234"));
    }
}