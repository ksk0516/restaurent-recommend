package com.toy.restaurant.user.mapper;

import java.util.List;
import java.util.Map;

import com.toy.restaurant.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    List<UserDto> getUserList();

    UserDto loginUser(Map<String, String> map);
}
