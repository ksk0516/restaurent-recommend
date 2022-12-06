package com.toy.restaurant.user;

import java.util.List;
import com.toy.restaurant.user.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.toy.restaurant.user.UserMapper;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserMapper userMapper;

    @Override
    public List<UserDto> getUserList() {
        return userMapper.getUserList();
    }
}
