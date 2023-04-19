package com.alex.bookclub.services;

import com.alex.bookclub.domain.User;
import com.alex.bookclub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public Page<User> findAll(Pageable pageable) {

        return repository.findAll(pageable);
    }
}
