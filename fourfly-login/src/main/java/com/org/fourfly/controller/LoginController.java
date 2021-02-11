package com.org.fourfly.controller;

import com.org.fourfly.service.UserDetailsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Jian
 * @Date 2021/2/12 0:20:01
 * @Description 登录控制器
 * @Version 1.0
 **/
@RestController
public class LoginController {

    @Resource
    private UserDetailsInfoService userDetailsInfoService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public UserDetails login(){
        UserDetails userDetails = userDetailsInfoService.loadUserByUsername("admin");
        return userDetails;
    }
}
