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
@WebServlet("/updatebrand")
public class UpdateBrandServlet extends HttpServlet {
    private IBrandService service = new BrandServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("brandId"));
        //System.out.println(id);  //测试成功
        Brand b = service.getOneBrand(id);   //获取这个品牌
        //System.out.println(b);
        req.setAttribute("b",b);
        req.getRequestDispatcher("WEB-INF/pages/updatebrand.jsp").forward(req,resp);
    }
}
