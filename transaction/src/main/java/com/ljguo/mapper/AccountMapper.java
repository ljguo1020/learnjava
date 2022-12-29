package com.ljguo.mapper;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AccountMapper {
    void add(@Param("name") String name, @Param("money") Integer money);
    void sub(@Param("name") String name, @Param("money") Integer money);
}
