package com.ljguo.controller;

import com.ljguo.pojo.User;
import com.ljguo.service.UserService;
import com.ljguo.util.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping
    public Result selectAll() {
        List<User> users = userService.selectAll();
        return new Result(Code.GET_OK,users);
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        boolean result = userService.login(user);
        return new Result(result?Code.GET_CONDITION_OK:Code.GET_CONDITION_ERR,result);
    }

    @GetMapping("/register/{username}")
    public Result checkRegister(@PathVariable String username) {
        boolean result = userService.checkRegister(username);
        return new Result(result?Code.GET_CONDITION_OK:Code.GET_CONDITION_ERR,result);
    }


    @PostMapping("/register")
    public Result register(@RequestParam("file") MultipartFile file, User user) {
        boolean result = userService.addUsers(file,user);
        return new Result(result?Code.SAVE_OK:Code.SAVE_ERR,result);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable int id) {
        boolean result = userService.deleteById(id);
        return new Result(result?Code.DELETE_OK:Code.DELETE_ERR,result);
    }

    @GetMapping("/{id}")
    public Result selectById(@PathVariable int id) {
        User user = userService.selectById(id);
        return new Result(Code.GET_ID_OK,user);
    }

    @PostMapping("/update")
    public Result update(@RequestParam("file") MultipartFile file, User user) {
        boolean result = userService.update(file,user);
        return new Result(result?Code.UPDATE_OK:Code.UPDATE_ERR,result);
    }
}
