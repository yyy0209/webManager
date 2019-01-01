<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/25
  Time: 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>用户管理</title>
    <link href="css/lista.css" rel="stylesheet" type="text/css" />
    <link href="css/listab.css" rel="stylesheet" type="text/css" />
</head>
<body>
<p>显示用户界面</p>
<a href="addUser">添加</a>
<%--${users}--%>
<div id="b2-1" class="table-responsive">
    <table class="table table-hover">
        <tr>
            <th>用户id</th>
            <th>用户名称</th>
            <th>用户密码</th>
            <th>用户电话</th>
            <th>用户级别</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${users}" var="user">  <%--循环--%>
            <c:if test="${user.id != 1}">
            <tr>
                <td>${user.id}</td>  <%--这个地方是通过get方法获取--%>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.tele}</td>
                <td>${user.grade_id}</td>
                <td><a href="deleteUser?id=${user.id}">删除</a>&nbsp;|&nbsp;<a href="updateUser?id=${user.id}">修改</a></td>
            </tr>
            </c:if>
        </c:forEach>
    </table>
</div>
</body>
</html>
