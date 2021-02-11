package com.org.fourfly.service;

import com.org.fourfly.exception.NotFoundException;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Jian
 * @Date 2021/2/10 22:18:03
 * @Description 用户账号密码获取业务实现
 * @Version 1.0
 **/
@Service
public class UserDetailsInfoService implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetailsInfo userDetailsInfo = userMapper.selectUserByUsername(username);
        if (userDetailsInfo == null) {
            throw new NotFoundException("用户不存在！");
        }

        return userDetailsInfo;
    }
}
