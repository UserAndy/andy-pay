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
    <link href="<%=basePath%>resources/common/css/font-awesome.min93e3.css?v=4.3.0" rel="stylesheet">
    <!-- Data Tables -->
    <link href="<%=basePath%>resources/common/css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">
    <link href="<%=basePath%>resources/common/css/style.min.css?v=2.2.0" rel="stylesheet">
</head>
<body>
<div>
    <div class="row">
        <div class="col-lg-12">
            <div class="ibox">
                <div class="ibox-title">
                    <h5>日志列表</h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <!--搜索栏 start-->
                 <%--   <div class="">
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
                        <!--button end-->
                        <p>
                            <button class="btn btn-primary" type="button"><i class="fa fa-search"></i>&nbsp;查询</button>
                        </p>
                    </div>--%>
                    <!--搜索栏 end-->
                    <table class="table table-bordered table-hover" id="editable">
                        <thead>
                        <tr>
                            <th>登录时间</th>
                            <th>登录ip</th>
                            <th>登录系统</th>
                            <th>备注</th>
                            <th>来源</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <!--item end-->
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Mainly scripts -->
<script src="<%=basePath%>resources/common/js/jquery.min.js"></script>
<script src="<%=basePath%>resources/common/js/bootstrap.min.js?v=3.4.0"></script>
<script src="<%=basePath%>resources/common/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="<%=basePath%>resources/common/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<!-- Data Tables -->
<script src="<%=basePath%>resources/common/js/plugins/dataTables/jquery.dataTables.js"></script>
<script src="<%=basePath%>resources/common/js/plugins/dataTables/dataTables.bootstrap.js"></script>

<!-- Page-Level Scripts -->
<script>
    $(document).ready(function () {
        /* Init DataTables */
        var oTable = $('#editable').dataTable({
            "ordering":false,    //是否显示全局排序字段  false 表示不排序, true表示排序
            "searching": false,
            "sDom": '"top"i',
            "bFilter": false,    //去掉搜索框方法
            "bLengthChange": false,   //去掉每页显示多少条数据方法
            "processing":true,        //进度条
            "deferRender": true,
            "serverSide": true,       //服务端分页
            "iDisplayLength": 10,   //每页显示的数量
            "ajax": {
                url:"log/list",
                type:"POST"
            },
          /* "fnServerParams": function(aoData) {   //向服务端提交其他的参数
               aoData.push({ "name": "more_data", "value": "my_value" });
            },*/
            //定制列属性
            "fnRowCallback": function(nRow, aData, iDisplayIndex) {// 当创建了行，但还未绘制到屏幕上的时候调用，通常用于改变行的class风格
                $('td:eq(5)',nRow).html("<a href='javascript:alert(&quot;删除&quot;)' class='btn btn-white btn-bitbucket'><i class='fa fa-edit'></i></a>");
                if(aData.type==1){
                    $('td:eq(4)',nRow).html("pc端");
                }else{
                    $('td:eq(4)',nRow).html("未知");
                };
                return nRow;
            },
            "aoColumns": [ //这个属性下的设置会应用到所有列，按顺序没有是空
                {"mData": 'login_time'}, //mData 表示发请求时候本列的列明，返回的数据中相同下标名字的数据会填充到这一列
                {"mData": 'ip'},
                {"mData": 'os'},
                {"mData": 'remark'},
                {"mData": 'type'},
                {"sDefaultContent": ''},        //占位作用
            ],
        });
    });
</script>
</body>
</html>
