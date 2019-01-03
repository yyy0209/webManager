package com.jmypackageC.controller;

import com.jmypackageC.pojo.Product;
import com.jmypackageC.pojo.User;
import com.jmypackageC.service.IProductService;
import com.jmypackageC.service.IUserService;
import com.jmypackageC.service.ProductServiceImpl;
import com.jmypackageC.service.UserServiceImpl;
import com.jmypackageC.utilTest.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@WebServlet("/list")
public class ListServlet extends HttpServlet {
    private IProductService service = new ProductServiceImpl();
    private IUserService uservice = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();  //获取所有cookie
        Map<String,Cookie> maps = CookieUtil.getCookie(cookies);  //调用工具类的方法，把CooKie类型转换成集合
        //System.out.println(maps);  //测试
        Cookie coo = maps.get("username");  //找到这个cookie对象
        /*System.out.println(coo.getName());
        System.out.println(coo);*/
        if(coo == null){
            resp.sendRedirect("login");
        }else {
            String uname = coo.getValue();
            //System.out.println(uname);
            HttpSession session = req.getSession();   //获取Session
            User u = (User)session.getAttribute("user");  //获取服务器session上的内容
            List<Product> lists = service.getLists();  //查询出数据
            req.setAttribute("lists",lists);
            if (u==null){
                User user = uservice.getOne(uname);
                session.setAttribute("user",user);
                req.getRequestDispatcher("WEB-INF/pages/list.jsp").forward(req,resp);
            }else {
                req.getRequestDispatcher("WEB-INF/pages/list.jsp").forward(req,resp);
            }
        }
    }
}
