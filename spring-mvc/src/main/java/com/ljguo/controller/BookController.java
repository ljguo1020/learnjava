package com.ljguo.controller;

import com.ljguo.pojo.Address;
import com.ljguo.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(String username, String password){
        return username + ": " + password;
    }

    @RequestMapping("/pojo")
    @ResponseBody
    public String pojoParam(@RequestBody User user) {
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("/array")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println(likes);
        return Arrays.toString(likes);
    }

    @RequestMapping("/list")
    @ResponseBody
    public String listParam(@RequestBody List<User> likes) {
        System.out.println(likes);
        return likes.toString();
    }

    @RequestMapping("/map")
    @ResponseBody
    public String mapParam(@RequestParam Map<String,String> likes) {
        System.out.println(likes);
        return likes.toString();
    }

    @RequestMapping("/date")
    @ResponseBody
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    @RequestMapping("/jumpPage")
    public String jumpPage() {
        return "/index.jsp";
    }

    @RequestMapping("/json")
    @ResponseBody
    public User json() {
        User user = new User("ljguo","20001020",new Address("sichuan","nanchong"));
        return user;
    }

    @RequestMapping("/userList")
    @ResponseBody
    public List<User> userList() {
        User user = new User("ljguo","20001020",new Address("sichuan","nanchong"));
        User user1 = new User("ljguo1","20001020",new Address("sichuan","nanchong"));
        User user2 = new User("ljguo2","20001020",new Address("sichuan","nanchong"));
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
    @RequestMapping("/intArray")
    @ResponseBody
    public Integer[] intArray() {
        return new Integer[]{1,2,3,4,5,6,7};
    }

}
