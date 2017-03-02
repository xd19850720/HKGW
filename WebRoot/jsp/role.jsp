<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>角色管理</title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/css/common.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="<%=path %>/js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
  </head>
  <body>
    <div id="center" region="center">
    	<table id="roleTable"></table>
  	</div>
  	<!-- 权限设置 -->
  	<div id="selectPrivilege"  class="easyui-dialog" closed ="true" modal="true" draggable="false"  style="width:800px;height:600px">
  		<div fit="true" collapsible=false class="easyui-layout" id="privilegeLayout" style="width: 100%;height:100%">
  			<div region="west" id="selectedPrivileges" title="已经选择的权限" style="width:400"></div>
  			<div region= "center" id = "selectPrivileges" title="可以选择的权限"></div>
  		</div>
  	</div>
  	<div id="addrole" class="easyui-dialog" closed ="true" style="width:250px;" modal="true" draggable="false">
  		<form action="" method="post" id="addRoleForm">
   			<table>
   				<input type="hidden" name="roleid" value="">
   				<tr>	
   					<td>角色名称:</td>
   					<td><input type="text" name="name"></td>
   				</tr>
   				<tr>	
   					<td>角色描述:</td>
   					<td><input type="text" name="description"></td>
   				</tr>
   				<tr align="center">
					<td colspan="2">
						<a id="addRoleSureBtn" class="easyui-linkbutton">确定</a>
						<a id="addRoleResetBtn" class="easyui-linkbutton">重置</a>
					</td>
	    		</tr>   		
   			</table>
   		</form>
  	</div>
  	<script type="text/javascript" src="<%=path %>/jsp/js/role.js"></script>
  </body>
</html>
