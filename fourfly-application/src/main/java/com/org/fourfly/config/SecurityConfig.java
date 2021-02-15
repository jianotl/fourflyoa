package com.org.fourfly.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author Jian
 * @Date 2021/2/10 21:47:12
 * @Description Spring Security 配置文件
 * @Version 1.0
 **/
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        //访问"/"和"/home"路径的请求都允许
        .antMatchers("/fourfly/",
                "/fourfly/login", "/fourfly/login/*",
                //开放swagger访问  swagger api json
                "/v2/api-docs",
                //用来获取支持的动作
                "/swagger-resources/configuration/ui",
                //用来获取api-docs的URI
                "/swagger-resources",
                //安全选项
                "/swagger-resources/configuration/security",
                "/swagger-ui.html",
                "/webjars/**")
        .permitAll()
        //而其他的请求都需要认证
        .anyRequest()
        .authenticated()
        .and()
        //修改Spring Security默认的登陆界面
        .formLogin()
        .loginPage("/fourfly/login")
        .permitAll()
        .and()
        .logout()
        .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        //基于内存来存储用户信息
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("user").password(new BCryptPasswordEncoder().encode("123")).roles("USER").and()
                .withUser("admin").password(new BCryptPasswordEncoder().encode("456")).roles("USER","ADMIN");
    }

}
