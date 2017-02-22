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
                            <th>用户名</th>
                            <th>联系电话</th>
                            <th>email</th>
                            <th>省</th>
                            <th>市</th>
                            <th>区</th>
                            <th>详细地址</th>
                            <th>生日</th>
                            <th>状态</th>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
                        </tr>
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
            ordering:false,    //是否显示全局排序字段  false 表示不排序, true表示排序
            searching : false,
            sDom : '"top"i',
            bFilter: false,    //去掉搜索框方法
            bLengthChange: false,   //去掉每页显示多少条数据方法
        });
    });
</script>
</body>
</html>
