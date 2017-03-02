<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-22
  Time: 上午11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+ "://" +request.getServerName()+ ":"+request.getServerPort()+path+ "/" ;
%>
<base href="<%=basePath%>">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>用户注册</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="<%=basePath%>resources/common/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>
<body class="gray-bg">

<div class="middle-box text-center loginscreen   animated fadeInDown">
    <div>
        <div>
            <h1 class="logo-name">H+</h1>
        </div>
        <h3>欢迎注册 H+</h3>
        <p>创建一个H+新账户</p>
        <form class="m-t" role="form" action="<%=basePath%>user/register" method="post" id="registerFrom">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="请输入邮箱" required="" name="email" id="email" onblur="ajaxValidateEmail()">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="请输入密码" required="" name="password" id="password">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="请再次输入密码" required="" name="salt" id="confirm_password">
            </div>
            <div class="form-group text-left">
                <div class="checkbox i-checks">
                    <label class="no-padding">
                        <input type="checkbox" id="agree"><i></i> 我同意注册协议</label>
                </div>
                <div style="color:red" id="errormsg"></div>
            </div>
            <button type="button" class="btn btn-primary block full-width m-b" id="btn_register">注 册</button>
            <p class="text-muted text-center"><small>已经有账户了？</small><a href="<%=basePath%>user/login">点此登录</a>
            </p>
        </form>
    </div>
</div>
<script src="<%=basePath%>resources/common/js/jquery.min.js?v=2.1.4"></script>
<script src="<%=basePath%>resources/common/js/bootstrap.min.js?v=3.3.6"></script>
<script src="<%=basePath%>resources/common/js/plugins/iCheck/icheck.min.js"></script>
<!--md5-->
<script src="<%=basePath%>resources/common/js/plugins/md5/md5.min.js"></script>
<!--表单插件-->
<script src="<%=basePath%>resources/common/js/plugins/form/jquery.form.js"></script>
<script src="<%=basePath%>resources/system/user/register.js"></script>
<script>
    $(document).ready(function(){
        $(".i-checks").iCheck({checkboxClass:"icheckbox_square-green",radioClass:"iradio_square-green",});
        //注册的方法
        register();
    });
</script>
</body>
</html>
