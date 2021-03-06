<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-22
  Time: 上午11:14
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
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
    <title>登录</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="<%=basePath%>resources/common/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/style.min.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/login.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script>
        if(window.top!==window.self){window.top.location=window.location};
    </script>
</head>
    <body class="signin">
<div class="signinpanel">
    <div class="row">
        <div class="col-sm-7">
            <div class="signin-info">
                <div class="logopanel m-b">
                    <h1>[ H+ ]</h1>
                </div>
                <div class="m-b"></div>
                <h4>欢迎使用 <strong>H+ 后台主题UI框架</strong></h4>
                <ul class="m-b">
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势一</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势二</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势三</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势四</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势五</li>
                </ul>
                <strong>还没有账号？ <a href="<%=basePath%>register">立即注册&raquo;</a></strong>
            </div>
        </div>
        <div class="col-sm-5">
            <form method="POST" action="<%=basePath%>user/login" id="loginForm">
                <h4 class="no-margins">登录：</h4>
                <p class="m-t-md">登录到H+后台主题UI框架</p>
                <input type="text" class="form-control uname" placeholder="用户名" name="email" id="email"/>
                <input type="password" class="form-control pword m-b" placeholder="密码" name="password" id="password"/>
                <a href="#">忘记密码了？</a><a href="<%=basePath%>">直接登录</a>
                <button class="btn btn-success btn-block" id="btnAjaxSubmit" type="button">登录</button>
                <div style="color:red;margin-top: 10px" id="errormsg"></div>
            </form>
        </div>
    </div>
    <div class="signup-footer">
        <div class="pull-left">
            &copy; 2015 All Rights Reserved. H+
        </div>
    </div>
</div>
<!--跳转首页的链接-->
<input type="hidden" value="<%=basePath%>/" id="indexPath"/>
<!--script -->
<script type="text/javascript" src="<%=basePath%>resources/common/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/common/js/plugins/form/jquery.form.js"></script>
<!--md5 加密js-->
<script src="<%=basePath%>resources/common/js/plugins/md5/md5.min.js"></script>
<script type="text/javascript" src="<%=basePath%>resources/system/user/login.js"></script>
    <script>
        $(document).ready(function () {
            login();
        });
    </script>
</body>
</html>
