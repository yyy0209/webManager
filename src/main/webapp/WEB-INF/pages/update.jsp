<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/23
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="false" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<%--${p} 通过这个获取数据--%>
<form action="doUpdate" method="post" enctype="multipart/form-data"><%--设置地址栏不显示私有数据--%>
    <input type="text" name="id" hidden="hidden" value="${p.productId}">
    商品名称：<input type="text" name="name" value="${p.productName}"><br>
    商品价格：<input type="text" name="price" value="${p.price}"><br>
    商品图片：<input type="file" name="url" onchange="imgChange(this)" value="${p.url}"><img id="img"><br><br>
    商品描述：<input type="text" name="des" value="${p.productDes}"><br>
    库存：<input type="text" name="count" value="${p.count}"><br>
    品牌id：<input type="text" name="brandId" value="${p.brandId}"><br>
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
<%--<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    $(function () {   //使用ajax
        /*alert("1");  //测试*/
    })
</script>--%>
</body>
</html>
