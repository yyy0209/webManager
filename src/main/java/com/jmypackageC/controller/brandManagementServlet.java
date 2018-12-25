package com.jmypackageC.controller;

import com.jmypackageC.pojo.Brand;
import com.jmypackageC.service.BrandServiceImpl;
import com.jmypackageC.service.IBrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/brandManagement")
public class brandManagementServlet extends HttpServlet {
    private IBrandService service = new BrandServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Brand> lists = service.getListSBrand();
        req.setAttribute("lists",lists);
        req.getRequestDispatcher("WEB-INF/pages/brandManagement.jsp").forward(req,resp);
    }
}
