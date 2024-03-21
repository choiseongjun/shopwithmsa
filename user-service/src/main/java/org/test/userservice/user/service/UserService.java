package org.test.userservice.user.service;

import org.test.userservice.user.dto.req.RequestLoginUserDto;
import org.test.userservice.user.dto.req.UserRequestDto;
import org.test.userservice.user.dto.res.UserResponseDto;

public interface UserService  {
    RequestLoginUserDto createUser(RequestLoginUserDto requestLoginUserDto);

    UserResponseDto getUserByUserId(String userId);

    UserResponseDto getUserDetailsByEmail(String email);

    UserResponseDto saveUser(UserRequestDto userRequest);
}
