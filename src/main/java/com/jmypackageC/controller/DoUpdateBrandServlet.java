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
@WebServlet("/doUpdateBrand")
public class DoUpdateBrandServlet extends HttpServlet {
    private IBrandService service = new BrandServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("brandId"));
        String name = req.getParameter("brandName");
        String describe = req.getParameter("brandDescribe");
        Brand b = new Brand();
        b.setBrandId(id);
        b.setBrandName(name);
        b.setBrandDescribe(describe);
        //System.out.println(b);  //测试
        int a = service.amendBrand(b); //修改品牌
        /*重定向*/
        resp.sendRedirect("brandManagement");
    }
}
