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
    <title>用户列表</title>
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
                        <a>用户管理</a>
                    </li>
                    <li>
                        <strong>用户列表</strong>
                    </li>
                </ol>
            </div>
            <div class="col-lg-2">

            </div>
        </div>
        <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="left" title="这里是提示内容">左侧提示</button>
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>用户列表</h5>
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
                                        <input type="password" placeholder="请输入手机号码" id="exampleInputPassword2" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword3" class="sr-only">城市</label>
                                        <input type="password" placeholder="请输入email" id="exampleInputPassword3" class="form-control">
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
                                    <th>用户名</th>
                                    <th>联系电话</th>
                                    <th>email</th>
                                    <th>省</th>
                                    <th>市</th>
                                    <th>区</th>
                                    <th>详细地址</th>
                                    <th>生日</th>
                                    <th>状态</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                   <!--item start-->
                                    <tr class="gradeX">
                                        <td>张三</td>
                                        <td>15608464487</td>
                                        <td>804139028@qq.com</td>
                                        <td>湖南</td>
                                        <td class="center">长沙</td>
                                        <td class="center">武冈</td>
                                        <td class="center">武冈人民医院</td>
                                        <td class="center">2017-02-11</td>
                                        <td class="center">
                                           已冻结
                                        </td>
                                        <td class="center">
                                            <a class="btn btn-white btn-bitbucket" href="javascript:alert('查看更多')">
                                                <i class="fa fa-eye"></i>
                                            </a>
                                            <a class="btn btn-white btn-bitbucket" href="javascript:alert('编辑')">
                                                <i class="fa fa-edit"></i>
                                            </a>
                                            <a class="btn btn-white btn-bitbucket" href="javascript:alert('锁定')">
                                                <i class="fa fa-lock"></i>
                                            </a>
                                        </td>
                                    </tr>
                                   <!--item end-->
                                   <!--item start-->
                                   <tr class="gradeX">
                                       <td>张三</td>
                                       <td>15608464487</td>
                                       <td>804139028@qq.com</td>
                                       <td>湖南</td>
                                       <td class="center">长沙</td>
                                       <td class="center">武冈</td>
                                       <td class="center">武冈人民医院</td>
                                       <td class="center">2017-02-11</td>
                                       <td class="center">正常</td>
                                       <td class="center">
                                           <a class="btn btn-white btn-bitbucket" href="javascript:alert('查看更多')">
                                               <i class="fa fa-eye"></i>
                                           </a>
                                           <a class="btn btn-white btn-bitbucket" href="javascript:alert('编辑')">
                                               <i class="fa fa-edit"></i>
                                           </a>
                                           <a class="btn btn-white btn-bitbucket" href="javascript:alert('锁定')">
                                               <i class="fa fa-lock"></i>
                                           </a>
                                       </td>
                                   </tr>
                                   <!--item end-->
                                   <!--item start-->
                                   <tr class="gradeX">
                                       <td>张三</td>
                                       <td>15608464487</td>
                                       <td>804139028@qq.com</td>
                                       <td>湖南</td>
                                       <td class="center">长沙</td>
                                       <td class="center">武冈</td>
                                       <td class="center">武冈人民医院111</td>
                                       <td class="center">2017-02-11</td>
                                       <td>
                                           正常
                                       </td>
                                       <td class="center">
                                           <a class="btn btn-white btn-bitbucket" href="javascript:alert('查看更多')">
                                               <i class="fa fa-eye"></i>
                                           </a>
                                           <a class="btn btn-white btn-bitbucket" href="javascript:alert('编辑')">
                                               <i class="fa fa-edit"></i>
                                           </a>
                                           <a class="btn btn-white btn-bitbucket" href="javascript:alert('锁定')">
                                               <i class="fa fa-lock"></i>
                                           </a>
                                       </td>
                                   </tr>
                                   <!--item end-->
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
