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
@WebServlet("/doItModify")
public class DoItModifyServlet extends HttpServlet {
    private IUserService service = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String uname = req.getParameter("unames");  /*不刷新时输入的数据*/
        String pwd = req.getParameter("pwd");
        String pwds = req.getParameter("pwds");
        String tele = req.getParameter("tele");
        int grade_id = Integer.parseInt(req.getParameter("grade_id"));
        User u = new User(id,uname,pwd,tele,grade_id);
        //System.out.println(u);
        int result = service.amend(u); //存放到数据库，返回受影响条数
        if (result>0){
            resp.getWriter().write("1");
        }
    }
}
