<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-14
  Time: 下午6:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+ "://" +request.getServerName()+ ":"+request.getServerPort()+path+ "/" ;
%>
<base href="<%=basePath%>">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"><meta name="renderer" content="webkit">
    <title>登录日志</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="<%=basePath%>resources/common/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link href="<%=basePath%>resources/common/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/animate.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/style.css?v=2.2.0" rel="stylesheet">
</head>
<body>
<div id="wrapper">
    <!--nav 的基本信息-->
    <jsp:include page="../index/nav_index.jsp"/>
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <!--顶部导航 start-->
        <jsp:include page="../index/nav_top.jsp"/>
        <!--顶部导航 end-->
        <!--nav start-->
        <div class="row wrapper border-bottom white-bg page-heading">
            <div class="col-lg-10">
                <h2>系统信息</h2>
                <ol class="breadcrumb">
                    <li>
                        <a href="index.html">主页</a>
                    </li>
                    <li>
                        <a>系统信息</a>
                    </li>
                    <li>
                        <strong>登录日志</strong>
                    </li>
                </ol>
            </div>
            <div class="col-lg-2">
            </div>
        </div>
        <!--nav end-->
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>用户登录日志</h5>
                            <div class="ibox-tools">
                                <a class="collapse-link">
                                    <i class="fa fa-chevron-up"></i>
                                </a>
                                <a class="dropdown-toggle" data-toggle="dropdown" href="javascript:void(0);">
                                    <i class="fa fa-wrench"></i>
                                </a>
                                <ul class="dropdown-menu dropdown-user">
                                    <li><a href="table_basic.html#">选项1</a>
                                    </li>
                                    <li><a href="table_basic.html#">选项2</a>
                                    </li>
                                </ul>
                                <a class="close-link">
                                    <i class="fa fa-times"></i>
                                </a>
                            </div>
                        </div>
                        <div class="ibox-content">
                            <div class="row">
                                <div class="col-sm-5 m-b-xs">
                                    <select class="input-sm form-control input-s-sm inline">
                                        <option value="0">请选择</option>
                                        <option value="1">选项1</option>
                                        <option value="2">选项2</option>
                                        <option value="3">选项3</option>
                                    </select>
                                </div>
                                <div class="col-sm-4 m-b-xs">

                                </div>
                                <div class="col-sm-3">
                                    <div class="input-group">
                                        <input type="text" placeholder="请输入关键词" class="input-sm form-control"> <span class="input-group-btn">
                                        <button type="button" class="btn btn-sm btn-primary"> 搜索</button> </span>
                                    </div>
                                </div>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                    <tr>

                                        <th>登录时间</th>
                                        <th>退出时间</th>
                                        <th>ip</th>
                                        <th>类型</th>
                                        <th>浏览器</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${list}" var="item">
                                        <tr>
                                            <td>2017-03-11 12:11:11</td>
                                            <td>2017-03-11 12:11:12</td>
                                            <td><span class="pie">127.0.0.1</span></td>
                                            <td>微信登录</td>
                                            <td>google chrome</td>
                                            <td><a href="table_basic.html#"><i class="fa fa-check text-navy"></i></a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <jsp:include page="../index/nav_bottom.jsp"/>
    </div>
</div>


</div>

<!-- Mainly scripts -->
<script src="<%=basePath%>resources/common/js/jquery-2.1.1.min.js"></script>
<script src="<%=basePath%>resources/common/js/bootstrap.min.js?v=3.4.0"></script>
<script src="<%=basePath%>resources/common/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="<%=basePath%>resources/common/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<!-- Peity -->
<script src="<%=basePath%>resources/common/js/plugins/peity/jquery.peity.min.js"></script>

<!-- Custom and plugin javascript -->
<script src="<%=basePath%>resources/common/js/hplus.js?v=2.2.0"></script>
<script src="<%=basePath%>resources/common/js/plugins/pace/pace.min.js"></script>

<!-- iCheck -->
<script src="<%=basePath%>resources/common/js/plugins/iCheck/icheck.min.js"></script>

<!-- Peity -->
<script src="<%=basePath%>resources/common/js/demo/peity-demo.js"></script>

<script>
    $(document).ready(function () {
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });
    });
</script>
</body>
</html>
