package com.jmypackageC.controller;  /*这个包存放界面控制的java代码*/

import com.jmypackageC.pojo.User;
import com.jmypackageC.service.IUserService;
import com.jmypackageC.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/*填写用户名密码点击登录会通过web的这个java类，在这么获取用户名和密码，
* 通过用户名去数据库查找这个用户，1、当获取为null会重定向去注册界面，
* 2、获取成功，会判断密码，成功会重定向到登录界面。
* */
@WebServlet("/doLogin")
public class DoLoginServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*String fm = req.getParameter("fm");   //jsp传送的是{"fm":fm},这边用这个接收
        System.out.println(fm);*/
        String uname = req.getParameter("username");
        String password = req.getParameter("pwd");
        //System.out.println(uname + "  " + password);  //测试语句
        User user = service.getOne(uname);  //通过用户名查找这个用户
        //System.out.println(user);  //测试语句u*/
        if (user != null) {
            if (user.getPassword().equals(password)) {   //密码验证成功，登录成功
                //长时间存储
                Cookie coo = new Cookie("username",uname);  //创建cookie
                Cookie coop = new Cookie("password",password);
                coo.setMaxAge(60*60*24*7);   //设置cooKie存储时间
                coop.setMaxAge(60*60*24*7);
                resp.addCookie(coo);   //添加到浏览器
                resp.addCookie(coop);
                //System.out.println(coo.getName()+ "  "+ coo.getValue());  //测试
                HttpSession session = req.getSession();   //获取session
                session.setAttribute("user",user);   //给服务器session添加内容
                resp.getWriter().write("1");
                /*//重定向是地址
                resp.sendRedirect("list");   //跑到ListServlet.java*/
            } else {  //密码错误
                resp.getWriter().write("2");
            }
        }else {
            resp.getWriter().write("3");  //回传
        }
    }
}

