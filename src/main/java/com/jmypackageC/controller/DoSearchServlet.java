package com.jmypackageC.controller;

import com.jmypackageC.pojo.Product;
import com.jmypackageC.service.IProductService;
import com.jmypackageC.service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/doSearch")
public class DoSearchServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String text = req.getParameter("text");
        //System.out.println(text);
        if (text==""||text.equals(" ")){
            List<Product> lists = service.getLists();
            req.setAttribute("lists",lists);
            req.getRequestDispatcher("WEB-INF/pages/checkGoods.jsp").forward(req,resp);
            //System.out.println("oooo");
        }
        if(text!=null){
            //System.out.println("ggggg");
            List<Product> lists = service.getResults(text);
            req.setAttribute("text",text);
            req.setAttribute("lists",lists);
            req.getRequestDispatcher("WEB-INF/pages/checkGoods.jsp").forward(req,resp);
        }else {
            List<Product> lists = service.getLists();
            req.setAttribute("lists",lists);
            req.getRequestDispatcher("WEB-INF/pages/checkGoods.jsp").forward(req,resp);
            //System.out.println("oooo");
        }
    }
}
