package com.org.fourfly.mapper.security;

import com.org.fourfly.domain.security.UserDetailsInfo;
import com.org.fourfly.domain.security.UserGrantedAuthority;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Jian
 * @Date 2021/2/10 22:49:24
 * @Description 账户密码,权限查询接口
 * @Version 1.0
 **/
public interface UserMapper {

    /**
     * 根据账号查询用户。
     * @param username
     * @return
     */
    UserDetailsInfo selectUserByUsername(String username);

    /**
     * 根据用户查找权限
     * @param id
     * @return
     */
    List<UserGrantedAuthority> selectUserAuthorities(long id);
}
