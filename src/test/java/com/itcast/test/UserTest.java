package com.itcast.test;

import com.itcast.mapper.UsersMapper;
import com.itcast.model.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import javax.annotation.Resource;

public class UserTest {
    @Resource
    private UsersMapper usersMapper;

   // @Test
//    public void testAdd() {
//        Users user = new Users() ;
//        user.setPasswd("123");
//        user.setUsername("enjoy");
//        usersMapper.insertSelective(user);
//    }

    @Test
    public void testFindUser() {
        Users enjoy = usersMapper.findByUsernameAndPasswd("enjoy", "123");
        System.out.println(enjoy);
    }

}
