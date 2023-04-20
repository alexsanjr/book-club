package com.alex.bookclub.config;

import com.alex.bookclub.domain.User;
import com.alex.bookclub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@outlook.com");
        User jose = new User(null, "Jose Bezerra", "jose@hotmail.com");
        User katharina = new User(null, "Katharina Araujo", "katharina@gmail.com");
        User henrique = new User(null, "Henrique Santos", "henrique@outlook.com");

        userRepository.saveAll(Arrays.asList(maria, alex, jose, katharina, henrique));


    }
}
