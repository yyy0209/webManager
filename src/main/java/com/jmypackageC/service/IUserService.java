package com.jmypackageC.service; /*这个包是逻辑处理*/

import com.jmypackageC.pojo.User;

import java.util.List;

public interface IUserService {
    public int insert(User user);  //插入数据的方法
    public User getOne(String username);  //通过用户名查找出这个用户
    public int amend(User user); //修改
    public List<User> getLists();   //查询
    public int deleUser(int id);  //删除用户
    public User getOne(int id);  //查找一个
}
