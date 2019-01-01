package com.jmypackageC.controller;

import com.jmypackageC.pojo.Grade;
import com.jmypackageC.service.GradeServiceImpl;
import com.jmypackageC.service.IGradeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/jurisdiction")
public class JurisdictionServlet extends HttpServlet {
    private IGradeService service = new GradeServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Grade> lists = service.getListsGrade();
        req.setAttribute("lists",lists);
        req.getRequestDispatcher("WEB-INF/pages/jurisdiction.jsp").forward(req,resp);
    }
}
