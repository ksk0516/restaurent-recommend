package com.toy.restaurant.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String userId;
    private String userPwd;
    private String userName;
    private String userEmail;
    private String userCreatedAt;
    private String userUpdatedAt;
}