package com.jmypackageC.controller;

import com.jmypackageC.pojo.User;
import com.jmypackageC.service.IUserService;
import com.jmypackageC.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/doUpdateUser")
public class DoUpdateUserServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String tele = req.getParameter("tele");
        int grade_id = Integer.parseInt(req.getParameter("grade_id"));
        User user = new User(id,username,password,tele,grade_id);
        //System.out.println(user);
        int a = service.amend(user); //修改用户
        /*重定向*/
        resp.sendRedirect("userControl");
    }
}
