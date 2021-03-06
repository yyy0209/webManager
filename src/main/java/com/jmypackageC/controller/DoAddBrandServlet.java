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
@WebServlet("/doaddbrand")
public class DoAddBrandServlet extends HttpServlet {
    private IBrandService service = new BrandServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String brandName = req.getParameter("brandName");
        String brandDescribe = req.getParameter("brandDescribe");
        Brand b = new Brand();
        b.setBrandName(brandName);
        b.setBrandDescribe(brandDescribe);
        //System.out.println(p);  //测试
        service.addBrand(b);
        /*重定向*/
        resp.sendRedirect("brandManagement");
    }
}
