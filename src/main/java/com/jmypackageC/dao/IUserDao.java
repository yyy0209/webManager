package com.jmypackageC.dao;  /*这个包存放的是对数据库操作*/

import com.jmypackageC.pojo.User;

public interface IUserDao {
    public int insert(User user);   //插入数据的方法
    public User getOne(String username);   //通过用户名查找出这个用户
}
