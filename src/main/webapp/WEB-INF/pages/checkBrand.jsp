<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2019/1/1
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>展示品牌界面</title>
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
<div id="b2-1" class="table-responsive">
    <table class="table table-hover">
        <tr>
            <th>品牌编号</th>
            <th>品牌名称</th>
            <th>品牌描述</th>
        </tr>
        <c:forEach items="${brands}" var="brands">  <%--循环--%>
            <tr>
                <td>${brands.brandId}</td>  <%--这个地方是通过get方法获取--%>
                <td>${brands.brandName}</td>
                <td id="td3">${brands. brandDescribe}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
