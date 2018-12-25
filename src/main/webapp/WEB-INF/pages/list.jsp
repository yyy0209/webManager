<%@ page import="java.util.List" %>
<%@ page import="com.jmypackageC.pojo.Product" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%--导入标签--%>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/12
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: solid 1px #000000;
            border-collapse: collapse;
        }
        table thead tr th,table tbody tr td{
            border: solid 1px #000000;
            padding: 5px 10px;
        }
        table tbody tr:nth-child(odd){
            background-color: blanchedalmond;
        }
    </style>
</head>
<body>
    <%--欢迎${user.username}<br>--%>
    <%--${user}--%>
    <a href="exit">退出</a><br>
    <%--${lists}--%>
    <p>显示内容界面</p>
    <a href="add">添加</a>
    <table>
        <thead>
            <tr>
                <th>商品编号</th>
                <th>商品名称</th>
                <th>商品价格</th>
                <th>商品图片</th>
                <th>商品描述</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
       <%-- ${lists}  &lt;%&ndash;通过 ${lists} 这个获取数据，叫作el表达式&ndash;%&gt;--%>
        <c:forEach items="${lists}" var="pro">  <%--循环--%>
            <tr>
                <td>${pro.productId}</td>  <%--这个地方是通过get方法获取--%>
                <td>${pro.productName}</td>
                <td>${pro.price}</td>
                <td><img src="${pro.url}" alt="fh"></td>
                <td>${pro.productDes}</td>
                <td><a href="delete?productId=${pro.productId}">删除</a>&nbsp;|&nbsp;<a href="update?productId=${pro.productId}">修改</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
