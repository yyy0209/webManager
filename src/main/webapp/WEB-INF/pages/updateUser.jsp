<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2019/1/1
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改用户界面</title>
</head>
<body>
<%--${u}
${grades}--%>
<form action="doUpdateUser" method="post"><%--设置地址栏不显示私有数据--%>
    <input type="text" name="id" hidden="hidden" value="${u.id}">
    用户名称：<input type="text" name="username" value="${u.username}"><br>
    密码：<input type="text" name="password" value="${u.password}"><br>
    电话号码：<input type="text" name="tele" value="${u.tele}"><br>
    等级id：<select name="grade_id">
        <c:forEach items="${grades}" var="g">
            <c:if test="${g.grade_id != 1}">
                <option value="${g.grade_id}">${g.jurisdiction}</option>
            </c:if>
        </c:forEach>
    </select><br>
    <%--<input type="text" name="brandId" value="${p.brandId}"><br>--%>
    <input type="submit" value="修改">
</form>
</body>
</html>
