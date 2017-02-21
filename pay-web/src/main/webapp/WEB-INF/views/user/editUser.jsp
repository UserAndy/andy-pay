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
    <title>标题</title>
</head>
<body>
    编辑用户信息
</body>
</html>
