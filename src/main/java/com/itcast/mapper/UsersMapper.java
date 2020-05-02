package com.itcast.mapper;

import com.itcast.model.Users;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

public interface UsersMapper {
    Users findByUsernameAndPasswd(@Param("username") String username, @Param("passwd") String passwd);

    void insertSelective(Users users);
}
