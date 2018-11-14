package com.mmall.dao;

import com.mmall.pojo.Cart;

public interface CartMapper {
    int insert(Cart record);

    int insertSelective(Cart record);
}