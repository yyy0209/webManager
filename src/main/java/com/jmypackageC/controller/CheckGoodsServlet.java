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

@WebServlet("/checkGoods")
public class CheckGoodsServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    private IBrandService serviceb = new BrandServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageNo1 = req.getParameter("pageNo");
        if (pageNo1 == null){
            List<Product> lists = service.getLists();
            List<Brand> listsb = serviceb.getListSBrand();
            req.setAttribute("lists",lists);
            req.setAttribute("listsb",listsb);
            req.getRequestDispatcher("WEB-INF/pages/checkGoods.jsp").forward(req,resp);
        }else {
            /*第一次访问时 分页情况*//*
            int pageNo = req.getParameter("pageNo")==null?1:Integer.parseInt(req.getParameter("pageNo"));
            int pageSize=6;
            *//*模糊查询*//*
            String text = req.getParameter("text");
            if(text==""||text==null){
                *//*list 分页条*//*
                ResultData data  = service.getLists(pageNo,pageSize);
                data.setUrl("list","");
                req.setAttribute("data",data);
                req.getRequestDispatcher("WEB-INF/pages/checkGoods.jsp").forward(req,resp);
            }else{
                ResultData data  = service.getLists(pageNo,pageSize,text);
                String params="&text="+text;
                data.setUrl("list",params);
                System.out.println(text);
                req.setAttribute("text",text);
                req.setAttribute("data",data);
                req.getRequestDispatcher("WEB-INF/pages/checkGoods.jsp").forward(req,resp);
            }*/
        }
    }
}
