<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/23
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<p>添加界面</p><br>
<form action="doAdd" method="post" enctype="multipart/form-data">
    商品名称：<input type="text" name="name"><br>
    商品价格：<input type="text" name="price"><br>
    商品图片：<input type="file" name="url" onchange="imgChange(this)"><img id="img"><br>
    商品描述：<input type="text" name="des"><br>
    库存：<input type="text" name="count"><br>
    品牌：<select name="brandId"><%--<input type="text" name="brandId">--%>
            <%--<c:forEach items="${....}" var="brand">
                <option value="brand.品牌id">brand.品牌名称</option>
            </c:forEach>--%>
            <option value="1">苹果</option>
            <option value="2">大果</option>
            <option value="3">小果</option>
        </select><br>
        <input type="submit" value="添加">
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
