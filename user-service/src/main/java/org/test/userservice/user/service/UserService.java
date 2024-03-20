package org.test.userservice.user.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.test.userservice.user.dto.req.RequestLoginUserDto;
import org.test.userservice.user.dto.res.UserDto;

public interface UserService extends UserDetailsService {
    RequestLoginUserDto createUser(RequestLoginUserDto requestLoginUserDto);

    UserDto getUserByUserId(String userId);
}
