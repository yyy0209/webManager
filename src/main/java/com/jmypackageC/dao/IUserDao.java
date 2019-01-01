package com.jmypackageC.dao;  /*这个包存放的是对数据库操作*/

import com.jmypackageC.pojo.User;

import java.util.List;

public interface IUserDao {
    public int insert(User user);   //插入数据的方法
    public List<User> getLists();   //查询
    public User getOne(String username);   //通过用户名查找出这个用户
    public int amend(User user);   //修改用户
    public int deleUser(int id);  //删除用户
    public User getOne(int id);  //查找一个
}
