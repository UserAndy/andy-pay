<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-22
  Time: 上午12:35
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
    <title>添加用户</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="<%=basePath%>/resources/common/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link href="<%=basePath%>/resources/common/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">
    <link href="<%=basePath%>/resources/common/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="<%=basePath%>/resources/common/css/animate.css" rel="stylesheet">
    <link href="<%=basePath%>/resources/common/css/style.css?v=2.2.0" rel="stylesheet">
</head>
<body>
<div>
        <div class="wrapper wrapper-content animated fadeInRight">
                <div class="col-lg-12">
                        <div class="ibox-content">
                            <form class="form-horizontal" id="signupForm">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">用户名：</label>
                                    <div class="col-sm-4">
                                        <input id="firstname" name="firstname" class="form-control" type="text">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">E-mail：</label>
                                    <div class="col-sm-4">
                                        <input id="email" name="email" class="form-control" type="email">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">联系电话:</label>
                                    <div class="col-sm-4">
                                        <input id="telephone" name="telephone" class="form-control" type="telephone">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">性别:</label>
                                    <div class="col-sm-4">
                                        <label class="checkbox-inline i-checks">
                                            <input type="checkbox" value="option1">&nbsp;&nbsp;男</label>
                                        <label class="checkbox-inline i-checks">
                                            <input type="checkbox" value="option2">&nbsp;&nbsp;女</label>
                                        <label class="checkbox-inline i-checks">
                                            <input type="checkbox" value="option3">&nbsp;&nbsp;未知</label>
                                    </div>
                                </div>
                                <div class="form-group from-line">
                                    <label class="col-sm-2 control-label">启用:</label>
                                    <div class="col-sm-4">
                                        <label class="checkbox-inline i-checks">
                                            <input type="checkbox" value="option1"></label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-8 col-sm-offset-3">
                                        <button class="btn btn-primary" type="submit">保存</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                </div>

        </div></div>
</div>
<!-- Mainly scripts -->
<script src="<%=basePath%>/resources/common/js/jquery-2.1.1.min.js"></script>
<script src="<%=basePath%>/resources/common/js/bootstrap.min.js?v=3.4.0"></script>

<!-- jQuery Validation plugin javascript-->
<script src="<%=basePath%>/resources/common/js/plugins/validate/jquery.validate.min.js"></script>
<script src="<%=basePath%>/resources/common/js/plugins/validate/messages_zh.min.js"></script>
<script src="<%=basePath%>/resources/common/js/plugins/iCheck/icheck.min.js"></script>
<script>
    $(document).ready(function () {
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });
    });
    //以下为修改jQuery Validation插件兼容Bootstrap的方法，没有直接写在插件中是为了便于插件升级
    $.validator.setDefaults({
        highlight: function (element) {
            $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
        },
        success: function (element) {
            element.closest('.form-group').removeClass('has-error').addClass('has-success');
        },
        errorElement: "span",
        errorClass: "help-block m-b-none",
        validClass: "help-block m-b-none"


    });

    //以下为官方示例
    $().ready(function () {
        // validate signup form on keyup and submit
        $("#signupForm").validate({
            rules: {
                firstname: "required",
                lastname: "required",
                username: {
                    required: true,
                    minlength: 2
                },
                password: {
                    required: true,
                    minlength: 5
                },
                confirm_password: {
                    required: true,
                    minlength: 5,
                    equalTo: "#password"
                },
                email: {
                    required: true,
                    email: true
                },
                topic: {
                    required: "#newsletter:checked",
                    minlength: 2
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

        // propose username by combining first- and lastname
        $("#username").focus(function () {
            var firstname = $("#firstname").val();
            var lastname = $("#lastname").val();
            if (firstname && lastname && !this.value) {
                this.value = firstname + "." + lastname;
            }
        });
    });
</script>
</body>
</html>
