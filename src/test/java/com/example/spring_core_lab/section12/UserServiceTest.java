package com.example.spring_core_lab.section12;

import com.example.spring_core_lab.section12_config.UserService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void testGetUser() {
        UserService service = new UserService();
        assertEquals("John Doe", service.getUser());
    }
}