<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 16-11-24
  Time: 上午12:14
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
    <meta name="viewport" content="width=device-width, initial-scale=1.0"><meta name="renderer" content="webkit">
    <title>用户注册</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="<%=basePath%>/resources/common/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link href="<%=basePath%>/resources/common/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">
    <link href="<%=basePath%>/resources/common/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="<%=basePath%>/resources/common/css/animate.css" rel="stylesheet">
    <link href="<%=basePath%>/resources/common/css/style.css?v=2.2.0" rel="stylesheet">
</head>
<body class="gray-bg">
<div class="middle-box text-center loginscreen   animated fadeInDown">
    <div>
        <div>
            <h1 class="logo-name">H+</h1>
        </div>
        <h3>欢迎注册 H+</h3>
        <p>创建一个H+新账户</p>
        <form class="m-t" role="form" method="post" id="registeForm">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="请输入用户名"  aria-required="true" id="username" name="username">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="请输入密码"  aria-required="true" id="password" name="password">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="请再次输入密码"  aria-required="true" id="confrim_password" name="confirm_password">
            </div>
            <div class="form-group text-left">
                <div class="checkbox i-checks">
                    <label class="no-padding">
                        <input type="checkbox" class="checkbox" id="agree" name="agree" checked/><i></i> 我同意注册协议</label>
                </div>
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b">注 册</button>
            <p class="text-muted text-center"><small>已经有账户了？</small><a href="user/login">点此登录</a>
            </p>
            <label style="color:red" class="errormsg"></label>
        </form>
    </div>
</div>
<!-- Mainly scripts -->
<script src="<%=basePath%>/resources/common/js/jquery-2.1.1.min.js"></script>
<script src="<%=basePath%>/resources/common/js/bootstrap.min.js?v=3.4.0"></script>
<script src="<%=basePath%>/resources/common/js/md5.min.js"></script>
<!-- iCheck -->
<script src="<%=basePath%>/resources/common/js/plugins/iCheck/icheck.min.js"></script>
<!--validate js-->
<script src="<%=basePath%>/resources/common/js/plugins/validate/jquery.validate.min.js"></script>
<script src="<%=basePath%>/resources/common/js/plugins/validate/messages_zh.min.js"></script>
<script src="<%=basePath%>/resources/common/js/plugins/form/jquery.form.js"></script>
<%--<script src="<%=basePath%>/resources/custom/js/user/register.js"/>--%>
<script>
    $(document).ready(function () {
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });
        //validate
        validate();
    });
    function validate(){
        console.log("validate");
        $("#registeForm").validate({
            submitHandler:function(form){
                $("#password").val(md5($("#password").val()));
                $("#confrim_password").val(md5($("#confrim_password").val()));
                $(form).ajaxSubmit({
                    type:"post",
                    url:"user/register",
                    dataType:"json",
                    success:showResponse,
                });
            },
            rules: {
                username: {
                    required: true,
                    email: true,
                },
                password: {
                    required: true,
                    minlength: 6
                },
                confirm_password: {
                    required: true,
                    minlength: 6,
                    equalTo: "#password"
                },
                email: {
                    required: true,
                    email: true
                },
                agree: "required"
            },
            messages: {
                firstname: "请输入你的姓",
                lastname: "请输入您的名字",
                username: {
                    required: "请输入您的用户名",
                    minlength: "用户名必须两个字符以上"
                },
                password: {
                    required: "请输入您的密码",
                    minlength: "密码必须5个字符以上"
                },
                confirm_password: {
                    required: "请再次输入密码",
                    minlength: "密码必须5个字符以上",
                    equalTo: "两次输入的密码不一致"
                },
                email: "请输入您的E-mail",
                agree: "必须同意协议后才能注册"
            }
        });
    }
    /**
     * 加载成功后的回调函数
     * @param data
     */
    function showResponse(data){
        if(data.success){
            window.location.href="user/login";
        }else{
            $(".errormsg").html("").html(data.errormsg);
            console.log(JSON.stringify(data));
        }
    }
</script>
</body>
</html>
