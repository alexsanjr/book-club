package com.alex.bookclub.services;

import com.alex.bookclub.Dto.UserDto;
import com.alex.bookclub.domain.User;
import com.alex.bookclub.mapper.UserMapper;
import com.alex.bookclub.repository.UserRepository;
import com.alex.bookclub.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public Page<UserDto> findAll(Pageable pageable) {
        Page<User> list = repository.findAll(pageable);
        return list.map(UserMapper.INSTANCE::userToUserDto);
    }

    public UserDto findById(String id) {
        User user = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));
        return UserMapper.INSTANCE.userToUserDto(user);
    }
}
