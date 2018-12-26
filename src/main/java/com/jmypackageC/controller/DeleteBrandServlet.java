package com.jmypackageC.controller;

import com.jmypackageC.service.BrandServiceImpl;
import com.jmypackageC.service.IBrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/deletebrand")
public class DeleteBrandServlet extends HttpServlet {
    private IBrandService service = new BrandServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("brandId"));
        service.deleBrand(id);
        resp.sendRedirect("brandManagement");
    }
}
