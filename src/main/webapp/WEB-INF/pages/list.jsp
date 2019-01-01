<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <%--导入标签--%>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/12
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
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
                <p>前台服务</p>
            </div>
            <div id="a2">
                <p>您好！${user.username}用户</p>
            </div>
            <div id="a3"><button class="btn"><a href="exit">退出登录</a></button></div>
        </div>
        <div id="b">
            <%--<img src="images/login-img.png">--%>
            <!--管理列表-->
            <div id="b1">
                <a id="Mtable" disabled="disabled">功能</a></br>
                <a href="checkGoods" id="Mcom" target="ww">>显示全部商品</a></br>
                <a href="checkBrand" id="Muc" target="ww">>显示全部品牌</a></br>
                <%--<a href="myGoods" id="Mbm" target="ww">>我的商品管理</a></br>--%>
                <a href="modifyPersonalInformation" id="Mcp" target="ww">>修改个人信息</a></br>
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
