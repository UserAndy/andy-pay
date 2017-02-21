<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-21
  Time: 上午9:34
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
    <title>日志列表</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="<%=basePath%>resources/common/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link href="<%=basePath%>resources/common/font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">
    <!-- Data Tables -->
    <link href="<%=basePath%>resources/common/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/animate.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/style.css?v=2.2.0" rel="stylesheet">
</head>
<body>
<div id="wrapper">
    <!--导航页面-->
    <jsp:include page="../index/nav_index.jsp"/>
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <!--顶部导航 start-->
        <jsp:include page="../index/nav_top.jsp"/>
        <!--顶部导航 end-->
        <div class="row wrapper border-bottom white-bg page-heading">
            <div class="col-lg-10">
                <h2>数据表格</h2>
                <ol class="breadcrumb">
                    <li>
                        <a href="index.html">主页</a>
                    </li>
                    <li>
                        <a>表格</a>
                    </li>
                    <li>
                        <strong>数据表格</strong>
                    </li>
                </ol>
            </div>
            <div class="col-lg-2">

            </div>
        </div>
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>登录日志列表</h5>
                            <div class="ibox-tools">
                                <a class="collapse-link">
                                    <i class="fa fa-chevron-up"></i>
                                </a>
                            </div>
                        </div>
                        <div class="ibox-content">
                            <!--搜索栏 start-->
                            <div class="">
                                <form role="form" class="form-inline">
                                    <div class="form-group">
                                        <label for="exampleInputEmail2" class="sr-only">用户名</label>
                                        <input type="email" placeholder="请输入用户名" id="exampleInputEmail2" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword2" class="sr-only">ip</label>
                                        <input type="password" placeholder="请输入IP" id="exampleInputPassword2" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword3" class="sr-only">城市</label>
                                        <select class="form-control" name="account" id="exampleInputPassword3">
                                            <option>---请选择登录类型---</option>
                                            <option>微信端</option>
                                            <option>PC端</option>
                                            <option>移动端</option>
                                        </select>
                                    </div>
                                </form>
                                    <!--button start-->
                                <hr/>
                                <p>
                                    <button class="btn btn-primary" type="button"><i class="fa fa-search"></i>&nbsp;查询</button>
                                    <button class="btn btn-success" type="button"><i class="fa fa-save"></i>&nbsp;添加</button>
                                    <button class="btn btn-info" type="button"><i class="fa fa-paste"></i> 编辑</button>
                                </p>
                                    <!--button end-->
                            </div>
                            <!--搜索栏 end-->
                            <table class="table table-striped table-bordered table-hover" id="editable">
                                <thead>
                                <tr>
                                    <th>登录ip</th>
                                    <th>登录时间</th>
                                    <th>退出时间</th>
                                    <th>类型</th>
                                    <th>浏览器</th>
                                    <th>操作系统</th>
                                    <th>所在地</th>
                                </tr>
                                </thead>
                                <tbody>
                                  <c:forEach items="${list}" var="item">
                                    <tr class="gradeX">
                                        <td>${item.login_ip}</td>
                                        <td><fmt:formatDate value="${item.login_time}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                                        <td><fmt:formatDate value="${item.exit_time}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                                        <td>移动端</td>
                                        <td class="center">${item.login_browser}</td>
                                        <td class="center">${item.login_operateSystem}</td>
                                        <td class="center">上海黄浦区</td>
                                    </tr>
                                  </c:forEach>
                                </tbody>
                            </table>

                        </div>

                    </div>
                </div>
            </div>
        </div>
        <!--底部栏 start-->
        <jsp:include page="../index/nav_bottom.jsp"/>
        <!--底部栏 end-->
    </div>
    </div>
</div>

<!-- Mainly scripts -->
<script src="<%=basePath%>resources/common/js/jquery-2.1.1.min.js"></script>
<script src="<%=basePath%>resources/common/js/bootstrap.min.js?v=3.4.0"></script>
<script src="<%=basePath%>resources/common/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="<%=basePath%>resources/common/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<!-- Data Tables -->
<script src="<%=basePath%>resources/common/js/plugins/dataTables/jquery.dataTables.js"></script>
<script src="<%=basePath%>resources/common/js/plugins/dataTables/dataTables.bootstrap.js"></script>

<!-- Custom and plugin javascript -->
<script src="<%=basePath%>resources/common/js/hplus.js?v=2.2.0"></script>

<!-- Page-Level Scripts -->
<script>
    $(document).ready(function () {
        /* Init DataTables */
        var oTable = $('#editable').dataTable({
            ordering:false    //是否显示全局排序字段  false 表示不排序, true表示排序
        });

       /* /!* Apply the jEditable handlers to the table *!/
        oTable.$('td').editable('../example_ajax.php', {
            "callback": function (sValue, y) {
                var aPos = oTable.fnGetPosition(this);
                oTable.fnUpdate(sValue, aPos[0], aPos[1]);
            },
            "submitdata": function (value, settings) {
                return {
                    "row_id": this.parentNode.getAttribute('id'),
                    "column": oTable.fnGetPosition(this)[2]
                };
            },
            "width": "90%",
            "height": "100%"
        });*/
    });
</script>
</body>
</html>
