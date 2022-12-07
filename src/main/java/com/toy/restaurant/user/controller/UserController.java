package com.toy.restaurant.user.controller;

import java.util.List;
import java.util.Map;

import com.toy.restaurant.user.dto.LoginDto;
import com.toy.restaurant.user.dto.UserDto;
import com.toy.restaurant.user.service.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/user")
    public List<UserDto> user() {
        return userService.getUserList();
    }

    @GetMapping("/error")
    public String error(){ return "ERROR 발생";}

    @PostMapping("/login")
    public String login(@RequestParam Map<String, String> map, HttpSession session){
        UserDto userDto = userService.loginUser(map);

        if(userDto != null){
            session.setAttribute("userInfo", userDto);
//            Cookie cookie = new Cookie("user_id", map.get("userId"));
//            cookie.setPath("/board");
            return "success";
        } else {
            return "error";
        }
    }

}
