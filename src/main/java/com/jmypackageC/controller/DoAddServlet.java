package com.jmypackageC.controller;

import com.jmypackageC.pojo.Product;
import com.jmypackageC.service.IProductService;
import com.jmypackageC.service.ProductServiceImpl;
import com.jmypackageC.utilTest.CookieUtil;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
import java.util.Map;
@MultipartConfig
@WebServlet("/doAdd")
public class DoAddServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        String des = req.getParameter("des");
        int count = Integer.parseInt(req.getParameter("count"));
        int brandId = Integer.parseInt(req.getParameter("brandId"));
        Part part = req.getPart("url");//获取上传文件
        //System.out.println(part.getSubmittedFileName());  //测试获取文件名称
        String str = "E:\\myjavacode1\\webManager\\src\\main\\webapp\\images\\"+part.getSubmittedFileName();
        File file = new File(str);
        String url = str.substring(str.indexOf("images")); //截取images后面的路径
        //System.out.println(url);  //测试
        /*输出流向指定位置写数据*/
        OutputStream os = new FileOutputStream(file);
        byte[] b = new byte[1024];
        InputStream is = part.getInputStream();
        int a = is.read(b,0,b.length);
        while (a!=-1){
            os.write(b);
            a=is.read(b,0,b.length);
        }
        Product p = new Product();
        p.setUrl(url);
        p.setProductName(name);
        p.setProductDes(des);
        p.setPrice(price);
        p.setCount(count);
        p.setBrandId(brandId);
        service.add(p);   //调用方法实现添加功能
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
