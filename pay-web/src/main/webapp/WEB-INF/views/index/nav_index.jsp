<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-14
  Time: 下午5:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+ "://" +request.getServerName()+ ":"+request.getServerPort()+path+ "/" ;
%>
<nav class="navbar-default navbar-static-side" role="navigation">
    <div class="sidebar-collapse">
        <ul class="nav" id="side-menu">
            <li class="nav-header">
                <div class="dropdown profile-element"> <span>
                            <img alt="image" class="img-circle" src="<%=basePath%>resources/common/img/profile_small.jpg" />
                             </span>
                    <a data-toggle="dropdown" class="dropdown-toggle" href="javascript:void(0)">
                                <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">Beaut-zihan</strong>
                             </span>  <span class="text-muted text-xs block">超级管理员 <b class="caret"></b></span> </span>
                    </a>
                    <ul class="dropdown-menu animated fadeInRight m-t-xs">
                        <li><a href="user/formavatar">修改头像</a>
                        </li>
                        <li><a href="profile.html">个人资料</a>
                        </li>
                        <li><a href="contacts.html">联系我们</a>
                        </li>
                        <li><a href="mailbox.html">信箱</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html">安全退出</a>
                        </li>
                    </ul>
                </div>
                <div class="logo-element">
                    H+
                </div>
            </li>
            <li class="active">
                <a href="javascript:void(0);"><i class="fa fa-th-large"></i> <span class="nav-label">主页</span> <span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li><a href="<%=basePath%>">数据统计</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:void(0);"><i class="fa fa-group"></i> <span class="nav-label">用户管理</span><span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li><a href="<%=basePath%>user/list"><i class="fa fa-user"></i>正常用户</a></li>
                    <li><a href="<%=basePath%>user/lockuser"><i class="fa fa-user"></i>已冻结用户列表</a></li>
                </ul>
            </li>
            <li>
                <a href="javascript:void(0);"><i class="fa fa-gears"></i> <span class="nav-label">系统信息</span><span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li><a href="<%=basePath%>system/alllogs"><i class="fa fa-history"></i>登录日志</a></li>
                    <li><a href="<%=basePath%>user/test/test"><i class="fa fa-history"></i>测试button</a></li>
                </ul>
            </li>
        </ul>
    </div>
</nav>
