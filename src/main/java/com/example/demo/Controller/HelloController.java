package com.example.demo.Controller;

import com.example.demo.Dao.User;
import com.example.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private ApplicationArguments applicationArguments;

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String helloPage(){
        System.out.println(applicationArguments.getNonOptionArgs());
        return "Hello SpringBoot!";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> list(){
        return userService.selectAll();
    }
}
