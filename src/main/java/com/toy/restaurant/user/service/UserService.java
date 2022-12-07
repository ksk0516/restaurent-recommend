package com.toy.restaurant.user.service;

import java.util.List;
import java.util.Map;

import com.toy.restaurant.user.dto.UserDto;

public interface UserService {
    public List<UserDto> getUserList();
    public UserDto loginUser(Map<String, String> map);
}
