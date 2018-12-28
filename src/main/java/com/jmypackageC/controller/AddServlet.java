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

@WebServlet("/add")  /*有这个注解,不需要通过web.xml也能到这个java类*/
/*@WebServlet(value = "/add")  这个跟上面一样*/
public class AddServlet extends HttpServlet {
    private IBrandService service = new BrandServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Brand> lists = service.getListSBrand();
        //System.out.println(lists);
        req.setAttribute("lists",lists);
        /*跳转*/
        req.getRequestDispatcher("WEB-INF/pages/add.jsp").forward(req,resp);
    }
}
