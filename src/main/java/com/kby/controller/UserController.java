package com.kby.controller;

import com.kby.entity.MyResult;
import com.kby.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *
 * @author jiang
 * @version 1.0
 * @since 2024/4/26 16:53
 */
@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Resource
    private UserService userService;

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public Boolean login(@RequestParam("username") String username, @RequestParam("password") String password) {
//        return userService.queryUserByName(username, password);
//    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public MyResult login(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd) {
        return userService.queryUser(uname,upwd);
    }
}
