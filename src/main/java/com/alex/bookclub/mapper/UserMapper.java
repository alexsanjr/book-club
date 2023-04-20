package com.alex.bookclub.mapper;

import com.alex.bookclub.Dto.UserDto;
import com.alex.bookclub.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserDto userToUserDto(User user);
}
