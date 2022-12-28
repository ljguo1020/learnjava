package com.ljguo;

import com.ljguo.config.SpringConfig;
import com.ljguo.mapper.UserMapper;
import com.ljguo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ac.getBean(UserService.class);
        UserMapper userMapper = ac.getBean(UserMapper.class);
        System.out.println(userMapper.selectAll());
        System.out.println(userService.selectAll());
    }
}
