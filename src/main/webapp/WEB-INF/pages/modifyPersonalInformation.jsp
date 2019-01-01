<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/25
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>修改个人信息</title>
    <link href="css/register.css" rel="stylesheet" type="text/css" />
</head>
<body>
<p>修改个人信息</p><br>
<%--${user}--%>
<form enctype="multipart/form-data">
    <input type="text" name="id" id="id1" class="ajaxCla" hidden="hidden" value="${user.id}">
    用户名：<input type="text" name="username" id="unames" class="ajaxCla" placeholder="用户名"><span id="message"></span><br>
    密码：<input type="password" name="pwd" id="pwd" class="ajaxCla" placeholder="6-18 数字和字母"><br>
    确认密码：<input type="password" name="pwds" id="pwds" class="ajaxCla" placeholder="6-18 数字和字母"><span id="pmes"></span><br>
    电话：<input type="text" name="tele" id="tele" class="ajaxCla" placeholder="手机号码"><br>
    <input type="text" name="grade_id" id="gid1" class="ajaxCla" hidden="hidden" value="${user.grade_id}">
    <input type="button" value="修改" id="btn" disabled="disabled">
</form>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    $(function () {
        /*使用ajax*/
        var id;
        var un;
        var pwd;
        var pwds;
        var tele;
        var gid;
        $(".ajaxCla").keyup(function () {  //获取标签对象，绑定键盘改变事件
            un = $("#unames").val(); //通过id获取这个标签对象,再获取这个对象的值
            pwd = $("#pwd").val();
            pwds = $("#pwds").val();
            tele = $("#tele").val();
            /*$("#message").text(un);  //获取标签对象，存放内容*/
            $.ajax({
                url:"doModifyPersonalInformation",   //没有提交也能够去java
                type:"post",  //提交方式，在浏览器网址隐藏
                data:{"unames":un, "pwd":pwd, "pwds":pwds, "tele":tele},   //把值传入java代码中
                success:function (result) {  //回调函数，这里接受传出的数据
                    if(result == "0"){
                        $("#message").text("用户名不能为空");
                        $("#btn").attr("disabled",true);
                    }
                    if (result == "1") {
                        $("#message").text("可以使用");
                        $("#btn").attr("disabled",true);
                    }
                    if(result == "13"){
                        $("#message").text("可以使用");
                        $("#pmes").text("√");
                        //$("#btn").removeAttr("disabled","disabled");
                        $("#btn").attr("disabled",false);   //disabled属性不生效
                    }
                    if(result == "14"){
                        $("#message").text("可以使用");
                        $("#pmes").text("密码不一致");
                        $("#btn").attr("disabled",true);
                    }
                    if(result == "15"){
                        $("#message").text("可以使用");
                        $("#pmes").text("密码不能为空");
                        $("#btn").attr("disabled",true);
                    }
                    if (result == "2"){
                        $("#message").text("用户名以存在");
                        $("#btn").attr("disabled",true);
                    }
                }
            });
        });
        $("#btn").click(function () {     //获取标签对象，绑定点击事件
            id = $("#id1").val();
            gid = $("#gid1").val();
            $.ajax({
                url:"doItModify",
                type:"post",
                data:{"id":id,"unames":un, "pwd":pwd, "pwds":pwds, "tele":tele,"grade_id":gid},   //把值传入java代码中
                success:function (data) {
                    if (data=="1"){
                        alert("修改成功");
                        window.location.href="modifyPersonalInformation";  //跳转界面
                    }
                }
            });
        });
    })
</script>
</body>
</html>
