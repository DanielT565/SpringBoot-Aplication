package com.application.spring_application.entityTest;

import com.application.spring_application.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserEntityCreation() {
        User user = new User();
        assertNotNull(user);
    }

    @Test
    public void testSetAndGetId() {
        User user = new User();
        user.setId(1L);
        assertEquals(1L, user.getId());
    }

    @Test
    public void testSetAndGetName() {
        User user = new User();
        user.setName("John");
        assertEquals("John", user.getName());
    }

    @Test
    public void testSetAndGetLastName() {
        User user = new User();
        user.setLastName("Doe");
        assertEquals("Doe", user.getLastName());
    }

    @Test
    public void testSetAndGetAge() {
        User user = new User();
        user.setAge((Integer) 30);
        assertEquals(30, user.getAge());
    }

    @Test
    public void testSetAndGetEmail() {
        User user = new User();
        user.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", user.getEmail());
    }

}
