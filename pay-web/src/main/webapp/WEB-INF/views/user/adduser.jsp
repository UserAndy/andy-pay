<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-22
  Time: 下午3:19
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
    <title>添加用户</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link rel="shortcut icon" href="favicon.ico">
    <link href="<%=basePath%>resources/common/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/style.min.css?v=4.1.0" rel="stylesheet">
</head>
<body class="gray-bg">
<div class="animated">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-content">
                    <form class="form-horizontal m-t" id="signupForm">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">用户名：</label>
                            <div class="col-sm-8">
                                <input id="username" name="username" class="form-control" type="text" aria-required="true" aria-invalid="true" class="error">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">密码：</label>
                            <div class="col-sm-8">
                                <input id="password" name="password" class="form-control" type="password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">确认密码：</label>
                            <div class="col-sm-8">
                                <input id="confirm_password" name="confirm_password" class="form-control" type="password">
                                <span class="help-block m-b-none"><i class="fa fa-info-circle"></i> 请再次输入您的密码</span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">E-mail：</label>
                            <div class="col-sm-8">
                                <input id="email" name="email" class="form-control" type="email">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-8 col-sm-offset-3">
                                <button class="btn btn-primary" type="submit">提交</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
    </div>
</div>
<script src="<%=basePath%>resources/common/js/jquery.min.js?v=2.1.4"></script>
<script src="<%=basePath%>resources/common/js/bootstrap.min.js?v=3.3.6"></script>
<script src="<%=basePath%>resources/common/js/content.min.js?v=1.0.0"></script>
<script src="<%=basePath%>resources/common/js/plugins/validate/jquery.validate.min.js"></script>
<script src="<%=basePath%>resources/common/js/plugins/validate/messages_zh.min.js"></script>
<script src="<%=basePath%>resources/common/js/demo/form-validate-demo.min.js"></script>
</body>
</html>
