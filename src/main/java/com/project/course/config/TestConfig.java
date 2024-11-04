package com.project.course.config;

import com.project.course.entities.User;
import com.project.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("course")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Joao Kleber", "Joaozinho@gmail.com", "54991204170", "123");
        User u2 = new User(null, "Betinho Tilt", "Betao@gmail.com", "54991111111", "123");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
