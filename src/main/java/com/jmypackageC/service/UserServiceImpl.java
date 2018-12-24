package com.jmypackageC.service;   /*这个包是逻辑处理*/

import com.jmypackageC.dao.IUserDao;
import com.jmypackageC.dao.UserDaolmpl;
import com.jmypackageC.pojo.User;

public class UserServiceImpl implements IUserService {
    private IUserDao dao = new UserDaolmpl();
    @Override
    public int insert(User user) {   //去调用了一下dao层
        return dao.insert(user);
    }

    @Override
    public User getOne(String username) {  //通过用户名查找出这个用户
        return dao.getOne(username);   //去dao层，通过用户名查找出这个用户
    }
}
