package com.jmypackageC.controller;

import com.jmypackageC.pojo.Brand;
import com.jmypackageC.pojo.Product;
import com.jmypackageC.service.BrandServiceImpl;
import com.jmypackageC.service.IBrandService;
import com.jmypackageC.service.IProductService;
import com.jmypackageC.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    private IBrandService serviceb = new BrandServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("productId"));
        Product p = service.getOne(id);
        List<Brand> listsb = serviceb.getListSBrand();
        //System.out.println(listsb);
        //List<Product> lists = service.getLists();
        req.setAttribute("listsb",listsb);
        //req.setAttribute("lists",lists);
        req.setAttribute("p",p);
        req.getRequestDispatcher("WEB-INF/pages/update.jsp").forward(req,resp);
    }
}
