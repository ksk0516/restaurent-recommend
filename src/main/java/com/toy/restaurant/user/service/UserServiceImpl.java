package com.toy.restaurant.user.service;

import java.util.List;
import java.util.Map;

import com.toy.restaurant.user.dto.UserDto;
import com.toy.restaurant.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;

    @Override
    public List<UserDto> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public UserDto loginUser(Map<String, String> map) {
        return userMapper.loginUser(map);
    }
}
