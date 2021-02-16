package com.org.fourfly.domain.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * @Author Jian
 * @Date 2021/2/10 22:10:30
 * @Description 获取权限
 * @Version 1.0
 **/
public class UserGrantedAuthority implements GrantedAuthority {

    private String authority;

    @Override
    public String getAuthority() {
        return authority;
    }

    public UserGrantedAuthority(String authority) {
        this.authority = authority;
    }
}
