<%--
  Created by IntelliJ IDEA.
  User: andy
  Date: 17-2-22
  Time: 上午10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+ "://" +request.getServerName()+ ":"+request.getServerPort()+path+ "/" ;
%>
<base href="<%=basePath%>">
<div class="row content-tabs">
    <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
    </button>
    <nav class="page-tabs J_menuTabs">
        <div class="page-tabs-content">
            <a href="javascript:;" class="active J_menuTab" data-id="index_v1.html">首页</a>
        </div>
    </nav>
    <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
    </button>
    <div class="btn-group roll-nav roll-right">
        <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

        </button>
        <ul role="menu" class="dropdown-menu dropdown-menu-right">
            <li class="J_tabShowActive"><a>定位当前选项卡</a>
            </li>
            <li class="divider"></li>
            <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
            </li>
            <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
            </li>
        </ul>
    </div>
    <a href="<%=basePath%>user/logout" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
</div>
