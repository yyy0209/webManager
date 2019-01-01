package com.jmypackageC.controller;

import com.jmypackageC.pojo.Grade;
import com.jmypackageC.pojo.User;
import com.jmypackageC.service.GradeServiceImpl;
import com.jmypackageC.service.IGradeService;
import com.jmypackageC.service.IUserService;
import com.jmypackageC.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/updateUser")
public class UpdateUserServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();
    private IGradeService services = new GradeServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        //System.out.println(id);  //测试成功
        User u = service.getOne(id);   //获取这个用户
        List<Grade> grades = services.getListsGrade();
        req.setAttribute("u",u);
        req.setAttribute("grades",grades);
        req.getRequestDispatcher("WEB-INF/pages/updateUser.jsp").forward(req,resp);
    }
}
