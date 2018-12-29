<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%--导入标签--%>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/25
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>品牌管理</title>
    <link href="css/lista.css" rel="stylesheet" type="text/css" />
    <link href="css/listab.css" rel="stylesheet" type="text/css" />
    <style>
        tr #td3{
            width: 800px;
        }
    </style>
</head>
<body>
<p>显示品牌界面</p>
<a href="addbrand">添加</a>
    <%--${lists}--%>
<div id="b2-1" class="table-responsive">
    <table class="table table-hover">
        <tr>
            <th>品牌编号</th>
            <th>品牌名称</th>
            <th>品牌描述</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${lists}" var="pro">  <%--循环--%>
            <tr>
                <td>${pro.brandId}</td>  <%--这个地方是通过get方法获取--%>
                <td>${pro.brandName}</td>
                <td id="td3">${pro. brandDescribe}</td>
                <td><a href="deletebrand?brandId=${pro.brandId}">删除</a>&nbsp;|&nbsp;<a href="updatebrand?brandId=${pro.brandId}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
