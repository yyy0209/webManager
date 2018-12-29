package com.jmypackageC.controller;

import com.jmypackageC.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet("/modifyPersonalInformation")
public class ModifyPersonalInformationServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();   //获取Session
        User u = (User)session.getAttribute("user");  //获取服务器session上的内容
        req.setAttribute("user",u);
        req.getRequestDispatcher("WEB-INF/pages/modifyPersonalInformation.jsp").forward(req,resp);
    }
}
