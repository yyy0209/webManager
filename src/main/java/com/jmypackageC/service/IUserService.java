package com.jmypackageC.service; /*这个包是逻辑处理*/

import com.jmypackageC.pojo.User;

public interface IUserService {
    public int insert(User user);  //插入数据的方法
    public User getOne(String username);  //通过用户名查找出这个用户
}
