package com.mmall.dao;

import com.mmall.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}