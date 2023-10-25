package com.application.spring_application.entityTest;

import com.application.spring_application.entity.Role;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RoleTest {

    @Test
    public void testCreateRole() {
        Role role = new Role();
        assertNotNull(role);
    }

    @Test
    public void testId() {
        Role role = new Role();
        Long expected = 1L;
        role.setId(expected);

        assertEquals(expected, role.getId());
    }

    @Test
    public void testName() {
        Role role = new Role();
        role.setName((String) "Role");

        assertEquals("Role", role.getName());
    }

}
