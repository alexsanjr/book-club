package com.alex.bookclub.mapper;

import com.alex.bookclub.Dto.UserDto;
import com.alex.bookclub.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto userToUserDto(User user);
}
