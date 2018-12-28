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

@WebServlet("/commodity")
public class CommodityServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    private IBrandService serviceb = new BrandServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> lists = service.getLists();  //查询出数据
        List<Brand> listsb = serviceb.getListSBrand();
        req.setAttribute("lists",lists);
        req.setAttribute("listsb",listsb);
        req.getRequestDispatcher("WEB-INF/pages/commodity.jsp").forward(req,resp);
    }
}
