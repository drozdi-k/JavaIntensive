package Exceptions;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class UserValidationServiceTest {

    @Test
    public void validate() {

        Assertions.assertThrows(UserValidationException.class, () -> {
            UserValidationService userService = new UserValidationService();
            User user = new User("Iv","Ivanov",19);
            userService.validate(user);
        });

        Assertions.assertThrows(UserValidationException.class, () -> {
            UserValidationService userService = new UserValidationService();
            User user = new User("Ivan","Ivanovusheckischyan",19);
            userService.validate(user);
        });

        Assertions.assertThrows(UserValidationException.class, () -> {
            UserValidationService userService = new UserValidationService();
            User user = new User("Ivan","Ivanov",199);
            userService.validate(user);
        });

        Assertions.assertThrows(UserValidationException.class, () -> {
            UserValidationService userService = new UserValidationService();
            User user = new User("Iv","Ivanovusheckischyan",199);
            userService.validate(user);
        });
    }
}