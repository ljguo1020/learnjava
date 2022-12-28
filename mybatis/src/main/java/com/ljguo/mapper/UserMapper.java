package com.ljguo.mapper;

import com.ljguo.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    List<User> selectAll();

    void add(User user);
}
