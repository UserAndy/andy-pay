<%--
  Created by IntelliJ IDEA.
  User: andy   http://localhost:8080/pay/user/login
  Date: 16-11-23
  Time: 下午11:41
  To change this template use File | Settings | File Templates.
  http://localhost:8080/pay/login.jsp
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+ "://" +request.getServerName()+ ":"+request.getServerPort()+path+ "/" ;
%>
<base href="<%=basePath%>">
<html>
<head>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="renderer" content="webkit">
        <title>用户登陆</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <link href="<%=basePath%>resources/common/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
        <link href="<%=basePath%>resources/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">
        <link href="<%=basePath%>resources/common/css/animate.css" rel="stylesheet">
        <link href="<%=basePath%>resources/common/css/style.css?v=2.2.0" rel="stylesheet">
    </head>
</head>
<body class="gray-bg">
    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>
                <h1 class="logo-name">H+</h1>
            </div>
            <h3>欢迎使用 H+</h3>
            <form class="m-t" role="form" action="user/login" method="post" autocomplete="off" id="formSubmit">
                <div class="form-group">
                    <input type="email" class="form-control" placeholder="用户名" required="" name="username">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="密码" required="" name="password" id="password">
                </div>
                <button type="button" id="btnAjaxSubmit" class="btn btn-primary block full-width m-b">登 录</button>
                <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="user/register">注册一个新账号</a>
                </p>
                <label style="color:red" class="errormsg">${message}</label>
            </form>
        </div>
    </div>
    <!-- Mainly scripts -->
    <script src="<%=basePath%>resources/common/js/jquery-2.1.1.min.js"></script>
    <script src="<%=basePath%>resources/common/js/bootstrap.min.js?v=3.4.0"></script>
    <script src="<%=basePath%>/resources/common/js/md5.min.js"></script>
    <script src="<%=basePath%>/resources/common/js/plugins/form/jquery.form.js"></script>
    <script>
                $(document).ready(function () {
                    $("#btnAjaxSubmit").click(function () {
                        $("#password").val(md5($("#password").val()));
                        var options = {
                            url: 'user/login',
                            type: 'POST',
                            data: $("#formSubmit").serialize(),
                            dataType:"json",
                            success:function(data) {
                                if (data.success==true){
                                    window.location.href="user/index";
                                }else{
                                   $(".errormsg").html("").html(data.errormsg);
                                }
                            },
                            beforeSubmit: function(arr, $form, options) {

                            }
                        };
                        $.ajax(options);
                        return false;
                    });
                });
    </script>
</body>
</html>
