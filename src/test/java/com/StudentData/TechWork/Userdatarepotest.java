package com.StudentData.TechWork;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.StudentData.TechWork.Entity.Userdata;
import com.StudentData.TechWork.Repo.Userdatarepo;

// @DataJpaTest
@SpringBootTest
public class Userdatarepotest {

    @Autowired
    private Userdatarepo repository;

    @Test
    public void testSaveUserData() {
        Userdata user = new Userdata();
        // user.setName("John Doe");
        // user.setEmail("john@example.com");
        // user.setNumber("1234567890");
        // user.setGender("Male");
        // user.setDate("2025-04-22");
        // user.setTime("12:00");

        Userdata saved = repository.save(user);
        // assertNotNull(saved);
        // assertNotNull(saved.getId());

        assertEquals("John Doe", saved.getName());
        assertEquals("john@example.com", saved.getEmail());
        assertEquals("1234567890", saved.getNumber());
        assertEquals("Male", saved.getGender());
        assertEquals("2025-04-22", saved.getDate());
        assertEquals("12:00", saved.getTime());
    }
}
