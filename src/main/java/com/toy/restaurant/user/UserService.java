package com.toy.restaurant.user;

import java.util.List;
import com.toy.restaurant.user.UserDto;
import org.springframework.stereotype.Service;

public interface UserService {
    public List<UserDto> getUserList();
}
