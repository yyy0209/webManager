<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/24
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en" >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <title>后台管理</title>
    <link href="css/lista.css" rel="stylesheet" type="text/css" />
    <link href="css/listab.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="m">
    <div id="mainDiv">
        <div id="a">
            <div id="a1">
                <p>后台管理系统 </p>
            </div>
            <div id="a2">
                <p>您好！${user.username}管理员</p>
            </div>
            <div id="a3"><button class="btn"><a href="exit">退出登录</a></button></div>
        </div>
        <div id="b">
            <%--<img src="images/login-img.png">--%>
            <!--管理列表-->
            <div id="b1">
                <a id="Mtable" disabled="disabled">功能</a></br>
                <a href="commodity" id="Mcom" target="ww">>商品管理</a></br>
                <a href="userControl" id="Muc" target="ww">>用户管理</a></br>
                <a href="brandManagement" id="Mbm" target="ww">>品牌管理</a></br>
                <a href="modifyPersonalInformation" id="Mcp" target="ww">>修改个人信息</a></br>
                <a href="jurisdiction" id="Mjur" target="ww">>权限管理</a></br>
            </div>
            <!--b-->
            <div id="b2">
                <p></p>
                <iframe name="ww" width="1217" height="600"></iframe>
            </div>
        </div>
    </div>
</div>
</body>
</html>

