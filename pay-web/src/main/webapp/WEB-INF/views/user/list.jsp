<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-22
  Time: 上午11:34
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
    <title>用户列表</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico"> <link href="<%=basePath%>resources/common/css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/animate.min.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/style.min862f.css?v=4.1.0" rel="stylesheet">
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <!--item start-->
    <div class="ibox float-e-margins">
        <div class="ibox-title">
            <h5>用户列表</h5>
            <div class="ibox-tools">
                <a class="collapse-link">
                    <i class="fa fa-chevron-up"></i>
                </a>
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-wrench"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="#">选项1</a>
                    </li>
                    <li><a href="#">选项2</a>
                    </li>
                </ul>
                <a class="close-link">
                    <i class="fa fa-times"></i>
                </a>
            </div>
        </div>
        <!--保留 start-->
        <div class="ibox-content">
            <div class="row row-lg">
                <div class="col-sm-12">
                    <div class="example">
                        <div class="btn-group hidden-xs" id="exampleToolbar" role="group">
                            <button type="button" class="btn btn-outline btn-default">
                                <i class="glyphicon glyphicon-plus" aria-hidden="true">新增</i>
                            </button>
                            <button type="button" class="btn btn-outline btn-default">
                                <i class="glyphicon glyphicon-heart" aria-hidden="true">修改</i>
                            </button>
                            <button type="button" class="btn btn-outline btn-default">
                                <i class="glyphicon glyphicon-trash" aria-hidden="true">删除</i>
                            </button>
                        </div>
                        <table id="exampleTableFromData" data-mobile-responsive="true" ata-toggle="table"  data-query-params="queryParams" data-mobile-responsive="true" data-height="800" data-pagination="true" data-icon-size="outline" data-search="true" data-striped="true">
                            <thead>
                            <tr>
                                <th data-field="state" data-checkbox="true"></th>
                                <th data-field="Tid">ID</th>
                                <th data-field="First">姓名</th>
                                <th data-field="sex">性别</th>
                                <th data-field="Score">评分</th>
                                <th data-field="provider">省</th>
                                <th data-field="city">市</th>
                                <th data-field="area">区</th>
                                <th data-field="status">状态</th>
                                <th data-field="telephone">联系电话</th>
                                <th data-field="html">操作</th>
                            </tr>
                            </thead>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <!--保留 end-->
    </div>
    <!--item end-->
</div>
<script src="<%=basePath%>resources/common/js/jquery.min.js?v=2.1.4"></script>
<script src="<%=basePath%>resources/common/js/bootstrap.min.js?v=3.3.6"></script>
<script src="<%=basePath%>resources/common/js/content.min.js?v=1.0.0"></script>
<script src="<%=basePath%>resources/common/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script src="<%=basePath%>resources/common/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
<script src="<%=basePath%>resources/common/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="<%=basePath%>resources/common/js/demo/bootstrap-table-demo.min.js"></script>
</body>
</html>
