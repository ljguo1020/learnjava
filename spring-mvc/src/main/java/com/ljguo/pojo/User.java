package com.ljguo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer Id;
    private String username;
    private String password;
    private String phone;
    private String sex;
    private String Image;
}
