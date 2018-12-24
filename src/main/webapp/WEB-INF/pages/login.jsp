<%--
  Created by IntelliJ IDEA.
  User: abd
  Date: 2018/12/22
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <title>后台管理</title>
    <link href="css/login.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <div class="login_box">
        <div class="login_l_img"><img src="images/login-img.png" /></div>
        <div class="login">
            <div class="login_logo"><a href="#"><img src="images/login_logo.png" /></a></div>
            <div class="login_name">
                <p>产品浏览系统</p>
            </div>
            <form id="fm" method="post" action="dologin">
                <input name="username" type="text"  value="用户名" onfocus="this.value=''" onblur="if(this.value==''){this.value='用户名'}">
                <span id="password_text" onclick="this.style.display='none';document.getElementById('password').style.display='block';document.getElementById('password').focus().select();" >密码</span>
                <input name="pwd" type="password" id="password" style="display:none;" onblur="if(this.value==''){document.getElementById('password_text').style.display='block';this.style.display='none'};"/>
                <input id="btn" value="登录" style="width:100%;" type="button">
            </form>
            <div class="reg-bar">
                <a class="reg" href="register">立即注册</a>
                <a class="forget" href="javascript:">忘记密码</a>
            </div>
        </div>
        <div class="copyright"><p>墨水有限公司</p></div>
    </div>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            //alert("测试");
            $("#btn").click(function () {   /*给登录绑定点击事件*/
                var fm = $("#fm").serialize();
                //alert(fm);  //测试成功
                $.ajax({    /*在页面不提交，实现数据的查询*/
                    url:"doLogin",
                    type:"post",
                    data:fm,/*{"fm":fm},*/
                    success:function (data) {
                        if (data=="1") {
                            alert("登录成功");
                            window.location.href="list"; //页面跳转
                        }
                        if (data=="2"||data=="3") {
                            alert("用户名或密码输入错误，请重新输入");
                            window.location.href="login";
                        }
                    }
                });
            });
        });
    </script>
</body>
</html>
