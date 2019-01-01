<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2019/1/1
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>商品管理</title>
    <link href="css/lista.css" rel="stylesheet" type="text/css" />
    <link href="css/listab.css" rel="stylesheet" type="text/css" />
    <style>
        tr td #img{
            width: 80px;
            height: 80px;
        }
        tr #td5{
            width: 400px;
        }
         ul{
             list-style: none;
         }
        ul li{
            float: left;
            width: 30px;
            height: 30px;
            line-height: 30px;
            text-align:center;
            border:solid 1px #000000;
        }
        ul li a{
            text-decoration: none;  /*清除下划线*/
            color: #000000;
            display: block;
        }
        ul .page{
            width: 80px;
            height: 30px;
        }
        ul li:hover{
            cursor: pointer;  /*放上变手*/
        }
    </style>
</head>
<body>
<p>显示商品界面</p>
<%--${lists}--%>
<%--${listsb}--%>
<form action="doSearch" method="post">
    <input type="text" name="text" value="${text}">
    <input type="submit" value="搜索">
</form>
<div id="b2-1" class="table-responsive">
    <table class="table table-hover">
        <tr>
            <th>商品编号</th>
            <th>商品名称</th>
            <th>商品价格</th>
            <th>商品图片</th>
            <th>商品描述</th>
            <th>库存</th>
            <th>品牌</th>
        </tr>
        <c:forEach items="${lists}" var="pro">  <%--循环--%>
            <tr>
                <td>${pro.productId}</td>  <%--这个地方是通过get方法获取--%>
                <td>${pro.productName}</td>
                <td>${pro.price}</td>
                <td><img id="img" src="${pro.url}" alt="图片"></td>
                <td id="td5">${pro.productDes}</td>
                <td>${pro.count}</td>
                <c:forEach items="${listsb}" var="brand">
                    <c:if test="${pro.brandId==brand.brandId}"><td>${brand.brandName}</td></c:if>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
</div>
<ul>
    <li class="page"><a href="checkGoods?pageNo=1">首页</a></li>
    <li class="page"><a href="checkGoods?pageNo=1">上一页</a></li>
    <li><a href="checkGoods?pageNo=1">1</a></li>
    <li><a href="checkGoods?pageNo=2">2</a></li>
    <li><a href="checkGoods?pageNo=3">3</a></li>
    <li><a href="checkGoods?pageNo=4">4</a></li>
    <li class="page"><a href="checkGoods?pageNo=1">下一页</a></li>
    <li class="page"><a href="checkGoods?pageNo=4">尾页</a></li>
</ul>
</body>
</html>
