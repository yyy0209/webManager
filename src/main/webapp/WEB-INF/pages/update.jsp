<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/23
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>修改</title>
</head>
<body>
<%--${p} 通过这个获取数据--%>
<%--${listsb}--%>
<form action="doUpdate" method="post" enctype="multipart/form-data"><%--设置地址栏不显示私有数据--%>
    <input type="text" name="id" hidden="hidden" value="${p.productId}">
    商品名称：<input type="text" name="name" value="${p.productName}"><br>
    商品价格：<input type="text" name="price" value="${p.price}"><br>
    商品图片：<input type="file" name="url" onchange="imgChange(this)" value="${p.url}"><img id="img"><br><br>
    商品描述：<input type="text" name="des" value="${p.productDes}"><br>
    库存：<input type="text" name="count" value="${p.count}"><br>
    品牌：<select name="brandId"><%--<input type="text" name="brandId">--%>
        <c:forEach items="${listsb}" var="brand">
            <option value="${brand.brandId}">${brand.brandName}</option>
        </c:forEach>
    </select><br>
    <%--<input type="text" name="brandId" value="${p.brandId}"><br>--%>
    <input type="submit" value="修改">
</form>
<script type="text/javascript">
    function imgChange(obj) {
        console.log(obj.files[0]);
        var reader = new FileReader();
        reader.onload = function (ev) {
            var img = document.getElementById("img");
            img.src = ev.target.result;
        };
        reader.readAsDataURL(obj.files[0]);
    };
</script>
</body>
</html>
