package org.test.userservice.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.test.userservice.user.dto.req.RequestLoginUserDto;
import org.test.userservice.user.dto.res.UserDto;
import org.test.userservice.user.entity.User;
import org.test.userservice.user.repository.UserRepository;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    @Override
    public RequestLoginUserDto createUser(RequestLoginUserDto requestLoginUserDto) {
        return null;
    }

    @Override
    public UserDto getUserByUserId(String userId) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new UsernameNotFoundException(email);
        }
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                true,
                true,
                true,
                true,
                new ArrayList<>()
        );
    }
}
