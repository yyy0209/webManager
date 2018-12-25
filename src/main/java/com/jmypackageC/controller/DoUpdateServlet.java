package com.jmypackageC.controller;

import com.jmypackageC.pojo.Product;
import com.jmypackageC.service.IProductService;
import com.jmypackageC.service.ProductServiceImpl;
import com.jmypackageC.utilTest.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/doUpdate")
public class DoUpdateServlet extends HttpServlet {
    IProductService service = new ProductServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String des = req.getParameter("des");  //通过这个方法获取标签属性name的值
        String url = req.getParameter("url");
        int brandId = Integer.parseInt(req.getParameter("brandId"));
        Product p = new Product(id,name,price,des,url,brandId);
        //System.out.println(p);  //测试
        service.amend(p);  //修改
        Cookie[] cookies = req.getCookies();  //获取所有cookie
        Map<String,Cookie> maps = CookieUtil.getCookie(cookies);  //调用工具类的方法，把CooKie类型转换成集合
        //System.out.println(maps);  //测试
        Cookie coo = maps.get("username");  //找到这个cookie对象
        /*System.out.println(coo.getName());
        System.out.println(coo);*/
        String uname = coo.getValue();
        if (uname.equals("abc")){
            /*重定向*/
            resp.sendRedirect("commodity");
        }else {
            /*重定向*/
            resp.sendRedirect("list");
        }
    }
}