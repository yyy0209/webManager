<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/25
  Time: 8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>权限管理</title>
    <link href="css/lista.css" rel="stylesheet" type="text/css" />
    <link href="css/listab.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%--${lists}--%>
<div id="b2-1" class="table-responsive">
    <table class="table table-hover">
        <tr>
            <th>权限id</th>
            <th>等级</th>
        </tr>
        <c:forEach items="${lists}" var="grade">  <%--循环--%>
            <tr>
                <td>${grade.grade_id}</td>  <%--这个地方是通过get方法获取--%>
                <td>${grade.jurisdiction}</td>
        </c:forEach>
    </table>
</div>
</body>
</html>
