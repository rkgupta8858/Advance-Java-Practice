package com.rahul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.bean.UserRequest;
import com.rahul.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/reset-password")
    public String resetPassword(@RequestBody UserRequest req) {
        return userService.resetPassoword(req.getUserId(), req.getNewPassword());
    }
}
