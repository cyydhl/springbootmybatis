package com.itcast.controller;

import com.itcast.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private IUserService iUserService;

    @RequestMapping("/hello")
    public Object sayHello() {
        logger.debug("这是一个hello日志");
        return "hello";
    }

    @RequestMapping("/login")
    public String login(String username,String passwd) {

        boolean login = iUserService.login(username, passwd);
        if(login) {
            return "登陆成功";
        }else {
            return  "登陆失败";
        }

    }
    @RequestMapping("/batchAdd")

    public String batchAdd(String username,String passwd) {
        iUserService.batchAdd(username, passwd);
        return "成功";

    }

}
