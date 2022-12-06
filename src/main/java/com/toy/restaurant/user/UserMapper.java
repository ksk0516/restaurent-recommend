package com.toy.restaurant.user;

import java.util.List;
import com.toy.restaurant.user.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    List<UserDto> getUserList();
}
