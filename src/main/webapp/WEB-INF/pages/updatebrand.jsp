<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/26
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改</title>
    </head>
    <body>
    <form action="doUpdateBrand" method="post"><%--设置地址栏不显示私有数据--%>
        <input type="text" name="brandId" hidden="hidden" value="${b.brandId}">
        品牌名称：<input type="text" name="brandName" value="${b.brandName}"><br>
        商品描述：<input type="text" name="brandDescribe" value="${b.brandDescribe}"><br>
        <input type="submit" value="修改">
</form>
</body>
</html>
