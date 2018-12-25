<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%--导入标签--%>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/25
  Time: 8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>商品管理</title>
    <link href="css/lista.css" rel="stylesheet" type="text/css" />
    <link href="css/listab.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <p>显示商品界面</p>
    <a href="add">添加</a>
    <%--${lists}--%>
    <div id="b2-1" class="table-responsive">
        <table class="table table-hover">
            <tr>
                <th>商品编号</th>
                <th>商品名称</th>
                <th>商品价格</th>
                <th>商品图片</th>
                <th>商品描述</th>
                <th>品牌id</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${lists}" var="pro">  <%--循环--%>
                <tr>
                    <td>${pro.productId}</td>  <%--这个地方是通过get方法获取--%>
                    <td>${pro.productName}</td>
                    <td>${pro.price}</td>
                    <td><img src="${pro.url}" alt="fh"></td>
                    <td>${pro.productDes}</td>
                    <td>${pro.brandId}</td>
                    <td><a href="delete?productId=${pro.productId}">删除</a>&nbsp;|&nbsp;<a href="update?productId=${pro.productId}">修改</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
