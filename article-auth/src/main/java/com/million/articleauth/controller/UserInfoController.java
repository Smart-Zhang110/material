package com.million.articleauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangcongcong
 * @version 1.0
 * @date 2021/4/15 14:23
 * @description ...
 */
@RestController
@RequestMapping("/user")
public class UserInfoController {


    @GetMapping("/getUserInfo/{user}")
    public String getUserInfo(@PathVariable(value = "user") String user){
        return "Current user : " + user;
    }

    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }

    @GetMapping("/login/user")
    public String login(){
        return "login";
    }


}
