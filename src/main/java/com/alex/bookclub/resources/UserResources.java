package com.alex.bookclub.resources;

import com.alex.bookclub.domain.User;
import com.alex.bookclub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<Page<User>> findAll(Pageable pageable) {
        // PARAMETROS: page, size, sort
        Page<User> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
