package com.baomidou.samples.mybatisplus2.controller;

import com.baomidou.samples.mybatisplus2.entity.User;
import com.baomidou.samples.mybatisplus2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: dynamic-datsource-samples
 * @description:
 * @author: tjianqun@linewell.com
 * @create: 2019-03-09 10:39
 **/

@Controller
@RequestMapping("/test")
public class TestController {

   public TestController(){
        System.out.println("asdfafd");
    }

    @Autowired
    UserService userService;

    @PostMapping("/add")
    @ResponseBody
    public String save(){
        User user = new User();
        user.setAge(2);
        user.setName("asfdasdf");
        userService.addUser(user);
        System.out.println("新增成功"+user.getId());
        return "success";
    }
}
