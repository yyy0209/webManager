package com.jmypackageC.controller;

import com.jmypackageC.pojo.User;
import com.jmypackageC.service.IUserService;
import com.jmypackageC.service.UserServiceImpl;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/userControl")
public class UserControlServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = service.getLists();
        req.setAttribute("users",users);
        req.getRequestDispatcher("WEB-INF/pages/userControl.jsp").forward(req,resp);
    }
}
