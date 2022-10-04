package com.example.noronshop.data.mapper;

import com.example.noronshop.data.data.User;
import com.example.noronshop.data.request.UserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toPojo(UserMapper userMapper);
    UserRequest toRequest(User user);
}