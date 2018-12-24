package com.jmypackageC.dao;  /*这个包存放的是对数据库操作*/

import com.jmypackageC.pojo.User;
import com.jmypackageC.utilTest.JdbcUtil;
import com.jmypackageC.utilTest.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaolmpl implements IUserDao {
    @Override
    public int insert(User user) {  //插入数据的方法实现
        return JdbcUtil.executeUpdate("insert into user(jurisdiction,username,password,tele) values(?,?,?,?)","b",user.getUsername(),user.getPassword(),user.getTele());
    }

    @Override
    public User getOne(String username) {  //通过用户名查找出这个用户
        /*调用工具层查找单个用户对象的方法*/
        return JdbcUtil.queryOne("select * from user where username=?", new RowMap<User>() {
            @Override
            public User rowMapping(ResultSet rs) {   //把ResultSet类型对象转换为User类型
                User u = new User();
                try {
                    u.setId(rs.getInt("id"));
                    u.setJurisdiction(rs.getString("jurisdiction"));
                    u.setUsername(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setTele(rs.getString("tele"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        }, username);
    }
}
