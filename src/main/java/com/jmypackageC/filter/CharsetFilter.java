package com.jmypackageC.filter;   /*存放过滤器*/

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

public class CharsetFilter implements Filter {   /*过滤器*/
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {  /*初始化*/

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {  /*执行*/
        servletRequest.setCharacterEncoding("utf-8");
        /*向后放行*/
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {   /*销毁*/

    }
}
