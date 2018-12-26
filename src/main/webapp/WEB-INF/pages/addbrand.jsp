<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/25
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>品牌添加界面</title>
</head>
<body>
<p>添加界面</p><br>
<form action="doaddbrand" method="post">
    品牌名称：<input type="text" name="brandName"><br>
    品牌描述：<input type="text" name="brandDescribe"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
