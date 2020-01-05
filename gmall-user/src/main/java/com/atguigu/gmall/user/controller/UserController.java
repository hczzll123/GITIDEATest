package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.User;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hcz
 * @date 2020/1/5 - 16:27
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @ResponseBody
    @RequestMapping("/get/all/page")
    public List<User> getAll(){


        List<User> list = userService.getAllUserList();

        return list;


    }
}
