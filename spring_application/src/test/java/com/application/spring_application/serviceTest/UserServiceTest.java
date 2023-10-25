package com.application.spring_application.serviceTest;

import com.application.spring_application.entity.User;
import com.application.spring_application.repository.UserRepository;
import com.application.spring_application.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveUser() {
        User userToSave = new User();
        userToSave.setName("John");
        userToSave.setLastName("Doe");
        userToSave.setAge(30);
        userToSave.setEmail("john@example.com");

        Mockito.when(userRepository.save(userToSave)).thenReturn(userToSave);

        User savedUser = userService.saveUser(userToSave);

        assertEquals(userToSave, savedUser);
    }
}
