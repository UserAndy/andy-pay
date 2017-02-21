<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-21
  Time: 下午5:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+ "://" +request.getServerName()+ ":"+request.getServerPort()+path+ "/" ;
%>
<base href="<%=basePath%>">
<script src="<%=basePath%>resources/common/js/jquery-2.1.1.min.js"></script>
<script src="<%=basePath%>resources/common/js/plugins/layer/layer.min.js"></script>
<html>
<head>
    <title>测试地址</title>
</head>
<body>
    <button onclick="alertOpen()">消息框</button>
    <button onclick="confrimOpen()">确认框</button>
    <button>弹出框</button>
</body>
</html>
<script>
    /**
     * 对话框
     */
    function alertOpen(){
        layer.alert('见到你真的很高兴', {icon: 6});
    }

    function confrimOpen(){
        layer.confirm('是否锁定该用户?', {
            btn: ['确定','取消'] //按钮
        }, function(){
            layer.msg('确定', {icon: 1});
        }, function(){
            layer.close();
        });
    }
</script>
