package core.basesyntax.service;

import core.basesyntax.exceptions.ValidationException;
import core.basesyntax.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationServiceImplTest {
    private RegistrationServiceImpl registration = new RegistrationServiceImpl();
    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void register_nullPassword_notOk() {
        user.setPassword(null);
        user.setLogin("validLoggin");
        user.setAge(27);

        assertThrows(ValidationException.class,
                () -> registration.register(user));


    }
}