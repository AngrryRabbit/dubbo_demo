package com.tony.controller;

import com.tony.pojo.User;
import com.tony.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tony on 2017/8/16.
 */
@Controller
public class CustomerController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get/{sex}")
    public @ResponseBody String customer(@PathVariable int sex){
        System.out.println("sex = [" + sex + "]");
        User userBySex = userService.getUserBySex(sex);
        return userBySex.toString()+"";
    }
}
